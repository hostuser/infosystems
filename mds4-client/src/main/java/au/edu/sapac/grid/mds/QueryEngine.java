package au.edu.sapac.grid.mds;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.rpc.Stub;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.addressing.Address;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.globus.axis.util.Util;
import org.globus.wsrf.WSRFConstants;
import org.globus.wsrf.client.BaseClient;
import org.globus.wsrf.impl.security.authorization.NoAuthorization;
import org.globus.wsrf.utils.FaultHelper;
import org.oasis.wsrf.properties.QueryExpressionType;
import org.oasis.wsrf.properties.QueryResourcePropertiesResponse;
import org.oasis.wsrf.properties.QueryResourceProperties_Element;
import org.oasis.wsrf.properties.QueryResourceProperties_PortType;
import org.oasis.wsrf.properties.WSResourcePropertiesServiceAddressingLocator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class QueryEngine extends BaseClient {

	public final static String VERSION = (("$LastChangedRevision: 131 $"
			.split(":"))[1]).replace('$', ' ').trim();

	public static void main(String[] args) {
		QueryEngine engine = new QueryEngine();
		//		NodeList list = engine
		//				.turboMDSquery("/descendant::node()[local-name()='Site']/descendant::node()[local-name()='Cluster']/descendant::node()[local-name()='SubCluster']/descendant::node()[local-name()='SoftwarePackage']/child::node()[local-name()='Name'][contains(translate(text(),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ'),'BEAST')]/parent::node()/parent::node()/parent::node()/parent::node()/self::node()");
		//		for (int i = 0; i < list.getLength(); i++) {
		//			org.w3c.dom.Element e = (org.w3c.dom.Element) list.item(i);
		//			System.out.println(e);
		//		}

		String name = args[0];
		if (StringUtils.isBlank(name)) {
			name = "MDSCache.xml";
		}

		engine.makeCacheFile(args[0]);
	}

	/** This file contains a cached version of the MDS information. */
	private final String mdsCacheFileName = "MDSCache.xml";
	private String mdsCacheFile = mdsCacheFileName;
	private final String backupMdsCacheFileName = "backup" + mdsCacheFileName;

	private String backupMdsCacheFile = backupMdsCacheFileName;
	private static final String DEFAULT_ARCS_MDS_SERVER = "https://mds.grid.apac.edu.au:8443/wsrf/services/DefaultIndexService";

	private String mds_url = DEFAULT_ARCS_MDS_SERVER;

	private static final WSResourcePropertiesServiceAddressingLocator locator = new WSResourcePropertiesServiceAddressingLocator();

	private static Log logger = LogFactory.getLog(QueryEngine.class.getName());

	static {
		Util.registerTransport(); // For secure transport
	}

	// event stuff
	// ================================================
	private Vector<GridInformationListener> mdsInfoListener;

	/**
	 * Initialize the Registry Query Client. Should make sure that the MDS
	 * server it is connecting to is actually alive.
	 * 
	 * <b>TODO: Finish this properly! Make sure MDS server is alive or fail!</b>
	 */
	public QueryEngine() {
		// TODO: Test that the MDS server is alive.
	}

	public QueryEngine(String mds_url) {

		if (StringUtils.isNotBlank(mds_url)) {
			this.mds_url = mds_url;
		}

	}

	/* LOCAL HELPER METHODS */

	// register a listener
	synchronized public void addGridInformationListener(
			GridInformationListener l) {
		if (mdsInfoListener == null) {
			mdsInfoListener = new Vector();
		}
		mdsInfoListener.addElement(l);
	}

	private void fireNewInfoEvent(Date dateTheInfoChanged) {
		// if we have no mountPointsListeners, do nothing...
		if ((mdsInfoListener != null) && !mdsInfoListener.isEmpty()) {
			// create the event object to send
			if (dateTheInfoChanged == null) {
				dateTheInfoChanged = new Date();
			}
			// make a copy of the listener list in case
			// anyone adds/removes Listeners
			Vector<GridInformationListener> infoListenersTargets;
			synchronized (this) {
				infoListenersTargets = (Vector<GridInformationListener>) mdsInfoListener
				.clone();
			}

			// walk through the listener list and
			// call the gridproxychanged method in each
			Enumeration<GridInformationListener> e = infoListenersTargets
			.elements();
			while (e.hasMoreElements()) {
				GridInformationListener fqan_l = e.nextElement();

				fqan_l.informationChanged(dateTheInfoChanged);

			}
		}
	}

	public String getAttributeValue(Element ele, String tagName) {
		return ele.getAttribute(tagName);
	}

	/**
	 * Get the text value of the first child element with the specified tag name
	 * in the given parent element.
	 * 
	 * @param ele
	 *            The parent element
	 * @param tagName
	 *            The tag to look for
	 * @return The text value of the first child element
	 */
	public String getTextValue(Element ele, String tagName) {
		String textVal = "";
		// Get the NodeList of all child elements with the tag name
		NodeList nl = ele.getElementsByTagName(tagName);

		if ((nl != null) && (nl.getLength() > 0)) {
			// Get the first element
			Element el = (Element) nl.item(0);
			try {
				// Get text value of first child
				textVal = el.getFirstChild().getNodeValue();
			} catch (Exception e) {
				textVal = "";
			}
		}

		return textVal;
	}

	/**
	 * Checks to see if the MDS cache file exists, and then checks its age. If
	 * it is too old, or doesn't exist, it is recreated.
	 */
	public boolean isNewCacheAvailable() {
		Date currentTime = new Date(); // Get the current date and time.

		File mdsCache = new File(mdsCacheFile);
		if (mdsCache.exists()) {
			if ((currentTime.getTime() - mdsCache.lastModified()) > 500000) {
				logger.info("Cache old");
				makeCacheFile(mdsCacheFile);
				return true;
			} else { // Cache Hit
				logger.info("Cache Hit");
				return false;
			}
		} else {
			logger.info("No MDS cache file... Creating one...");
			// System.err.println("No MDS cache file... Creating one...");
			makeCacheFile(mdsCacheFile);
			return true;
		}
	}

	/*
	 * Implementing GridInfoInterface. These methods basically define a query
	 * and run this query on the MDS file. They then return the results.
	 */

	/**
	 * Make the MDS cache file. The name of the file is passed in, but this
	 * could just use the class variable 'mdsCacheFile' later, maybe...
	 * 
	 * @param cacheFileName
	 *            The name to give the cache file
	 * @return <code>true</code> if the cache file was successfully created
	 */
	public boolean makeCacheFile(String cacheFileName) {
		boolean success = false;
		try {
			File cacheFile = new File(cacheFileName);
			File backupCacheFile = new File(backupMdsCacheFile);
			logger.info("Cache file too old!");

			// Get site based info only! no mds service info collected.
			String xPathqueryString = "//*[local-name()='Site']";
			String mdsStr = masterQueryMDS(mds_url, xPathqueryString);
			// how to check if host is up?
			// no idea!

			// Force a test for restore backup
			// mdsStr = "";

			// If bad data - restore mds backup
			if ((mdsStr == null) || (mdsStr.length() == 0)) {
				try {
					byte[] iobuff = new byte[4096];
					int bytes;

					FileInputStream fis = new FileInputStream(
							backupMdsCacheFile);
					FileOutputStream fos = new FileOutputStream(cacheFileName);

					while ((bytes = fis.read(iobuff)) != -1) {
						fos.write(iobuff, 0, bytes);
					}
					fis.close();
					fos.close();
					success = true;

					logger.info("cache file restored from backup");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				// Good data - update cache, update backup.
				try {
					cacheFile.delete();
					FileWriter fw = new FileWriter(cacheFileName);
					fw.write("<trmds>\n");
					fw.write(mdsStr);
					fw.write("\n</trmds>");
					logger.info("cache file updated");
					fw.close();

					backupCacheFile.delete();
					FileWriter fwCache = new FileWriter(backupMdsCacheFile);
					fwCache.write("<trmds backupCache=\"true\">\n");
					fwCache.write(mdsStr);
					fwCache.write("\n</trmds>");
					logger.info("backup file updated");
					fwCache.close();

					success = true;
				} catch (Throwable e) {
					System.out
					.println("Could not write job string to file" + e);
				}
			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}

		return success;
	}

	/**
	 * Run an XPath query on the MDS information at a given address.
	 * 
	 * @param url
	 *            The address of the Monitoring & Discovery Service.
	 * @param xPathqueryString
	 *            The XPath query to run
	 * @return A String containing the result of the query
	 */
	private String masterQueryMDS(String url, String xPathqueryString) {
		// List<Document> documents = new ArrayList<Document>();
		String returnStr = "";
		QueryEngine client = new QueryEngine();
		WSResourcePropertiesServiceAddressingLocator locator = new WSResourcePropertiesServiceAddressingLocator();
		try {
			client.endpoint = new EndpointReferenceType();
			client.endpoint.setAddress(new Address(url));
			client.authorization = NoAuthorization.getInstance();
			client.anonymous = Boolean.TRUE;

			QueryResourceProperties_PortType queryPort = locator
			.getQueryResourcePropertiesPort(client.getEPR());

			// This is the XPath query that we will use.
			// It requests all entries that contain the string
			// specified in 'searchString'
			// String xpathQuery = xPathqueryString;
			/*
			 * // DON'T THINK THIS CHECK IS STILL NEEDED.. KEEP IT JUST IN CASE
			 * // a check to make sure that only the Site element that conforms
			 * to GLUE // schema 1.2 is what we are getting if
			 * (xpathQuery.equals("//*[local-name()='Site']")) { xpathQuery =
			 * "//*[local-name()='Site' and " +
			 * "namespace-uri()='http://forge.cnaf.infn.it/glueschema/Spec/V12/R2']"
			 * ; } // a check to make sure that this method will return the xml
			 * document // that has Site as its root element if
			 * (!xpathQuery.endsWith
			 * ("/ancestor::node()[local-name()='Site' and " +
			 * "namespace-uri()='http://forge.cnaf.infn.it/glueschema/Spec/V12/R2']"
			 * )) {
			 * 
			 * if (!xpathQuery.equals("//*[local-name()='Site' and " +
			 * "namespace-uri()='http://forge.cnaf.infn.it/glueschema/Spec/V12/R2']"
			 * )) { xpathQuery =
			 * xpathQuery.concat("/ancestor::node()[local-name()='Site' and " +
			 * "namespace-uri()='http://forge.cnaf.infn.it/glueschema/Spec/V12/R2']"
			 * ); } }
			 */

			// System.out.println("search string: " + xpathQuery);
			QueryExpressionType query = new QueryExpressionType();
			query.setDialect(new URI(WSRFConstants.XPATH_1_DIALECT));
			query.setValue(xPathqueryString);
			QueryResourceProperties_Element qrp = new QueryResourceProperties_Element(
					query);
			client.setOptions((Stub) queryPort);

			QueryResourcePropertiesResponse response = queryPort
			.queryResourceProperties(qrp);

			// so now, response contains 0 or more Entries.
			// we need to loop over each entry and display the
			// appropriate interesting bits

			MessageElement[] entries = response.get_any();
			for (int i = 0; (entries != null) && (i < entries.length); i++) {
				returnStr = returnStr + entries[i].getAsString();
				// documents.add(entries[i].getAsDocument());
				logger.debug(entries[i].getAsString());
			}

		} catch (Exception e) {
			if (client.isDebugMode()) {
				FaultHelper.printStackTrace(e);
			} else {
				System.err.println("Error: " + FaultHelper.getMessage(e));
			}
		}
		return returnStr;
	}

	/**
	 * Parses an XML document and looks for a particular element to query. Old
	 * way of doing things - we now use XPath on a local (cached) XML file.
	 * 
	 * @param elToQuery
	 *            The element to query for
	 * @param fileToParse
	 *            The XML file to parse
	 * @return A <code>NodeList</code> containing the elements selected by the
	 *         query
	 * @deprecated As of r568, replaced by {@link #turboMDSquery(String)}
	 */
	@Deprecated
	private NodeList parseDocument(String elToQuery, String fileToParse) {
		NodeList elList = null;

		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
			.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = null;

			if (fileToParse.contentEquals("*xml")) {
				File file = new File(fileToParse);
				doc = docBuilder.parse(file);
			} else {
				doc = docBuilder.parse(fileToParse);
			}

			// Normalize text representation.
			doc.getDocumentElement().normalize();
			elList = doc.getElementsByTagName(elToQuery);

		} catch (SAXParseException err) {
			System.out.println("** Parsing error" + ", line "
					+ err.getLineNumber() + ", uri " + err.getSystemId());
			System.out.println(' ' + err.getMessage());
			throw new RuntimeException(err.getMessage());
		} catch (SAXException e) {
			Exception x = e.getException();
			((x == null) ? e : x).printStackTrace();
			System.out.println("SAX Exception Error" + e);
			throw new RuntimeException(e.getMessage());
		} catch (Throwable t) {
			System.out.println("Some other parser error");
			t.printStackTrace();
		}

		return elList;
	}

	// remove a listener
	synchronized public void removeGridInformationListener(
			GridInformationListener l) {
		if (mdsInfoListener == null) {
			mdsInfoListener = new Vector<GridInformationListener>();
		}
		mdsInfoListener.removeElement(l);
	}

	public void setCacheFileLocation(String cacheFile) {
		mdsCacheFile = cacheFile + File.separator + mdsCacheFileName;
		backupMdsCacheFile = cacheFile + File.separator
		+ backupMdsCacheFileName;
	}

	/**
	 * Runs an XPath query on the local (cached) MDS file.
	 * 
	 * @param query
	 *            The XPath query to run
	 * @return A <code>NodeList</code> containing the nodes/elements selected by
	 *         the query
	 */
	public NodeList turboMDSquery(String query) {
		// temporarily disable this since CachedMdsInformationManager can just
		// be the one doing this check
		// checkCache(); // now called isNewCacheAvailable() which returns
		// boolean
		isNewCacheAvailable();

		NodeList myNodeList = null;
		XPathFactory xPath = XPathFactory.newInstance();

		try {
			InputSource inpXml = new InputSource(mdsCacheFile);
			myNodeList = (NodeList) xPath.newXPath().evaluate(query, inpXml,
					XPathConstants.NODESET);
		} catch (Exception e) {
			System.err.println("Died");
			System.err.println(e.getMessage());
			logger.error(e.getMessage());
		}

		return myNodeList;
	}

}
