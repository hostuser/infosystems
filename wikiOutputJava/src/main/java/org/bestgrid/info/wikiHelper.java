package org.bestgrid.info;

import grisu.jcommons.interfaces.GridInfoInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;
import org.bestgrid.mds.SQLQueryClient;

import au.edu.sapac.grid.mds.QueryClient;

public class wikiHelper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GridInfoInterface qc = null;
		if (args.length > 0) {
			if (args[0].equals("mysql")) {
				qc = new SQLQueryClient(
						"jdbc:mysql://mysql-bg.ceres.auckland.ac.nz/mds_test",
						"grisu_read", "password");
			}
		}
		if (qc == null) {
			qc = new QueryClient("/tmp");
		}

		String vo = "/ARCS/BeSTGRID";

		String[] apps = qc.getCodesOnGridForVO(vo);

		Comparator icc = new Comparator<String>() {

			public int compare(String strA, String strB) {
				return strA.compareToIgnoreCase(strB);
			}

		};



		Arrays.sort(apps, icc);

		Map<String, Map<String, Set<String>>> siteMap = new TreeMap<String, Map<String, Set<String>>>();

		for ( String site : qc.getSitesForVO(vo)) {
			Map<String, Set<String>> versionMap = new HashMap<String, Set<String>>();
			siteMap.put(site, versionMap);

		}

		String[] allSites = siteMap.keySet().toArray(new String[] {});

		for (String app : apps) {

			String[] versions = qc.getVersionsOfCodeOnGridForVO(app, vo);
			for (String version : versions) {
				String[] sites = qc.getSitesWithAVersionOfACode(app, version);

				for (String site : sites) {

					if (!siteMap.keySet().contains(site)) {
						continue;
					}

					Map<String, Set<String>> appMap = siteMap.get(site);
					if ( appMap == null ) {
						appMap = new TreeMap<String, Set<String>>();
						siteMap.put(site, appMap);
					}

					Set<String> versionSet = appMap.get(app);
					if (versionSet == null) {
						versionSet = new TreeSet<String>();
						appMap.put(app, versionSet);
					}

					versionSet.add(version);

				}



			}
		}

		// for (String site : siteMap.keySet()) {
		// System.out.println("Site: " + site);
		//
		// Map<String, Set<String>> appMap = siteMap.get(site);
		// for (String app : appMap.keySet()) {
		// System.out.println("\tApp: " + app);
		// for ( String version : appMap.get(app)) {
		// System.out.println("\t\tVersion: " + version);
		// }
		//
		// }
		// }

		StringBuffer table = new StringBuffer();
		table.append("{| border=\"1\" cellpadding=\"5\" cellspacing=\"0\"\n");
		table.append("! Software Package !!" + StringUtils.join(allSites, "!!")
				+ "\n");
		for (String app : apps) {
			table.append("|-\n");
			table.append("| '''" + app + "''' ||");
			List<String> allVersions = new LinkedList<String>();
			for (String allSite : allSites) {
				Set<String> versions = siteMap.get(allSite).get(app);
				String versionsString = StringUtils.join(versions, "<br>");
				if (StringUtils.isBlank(versionsString)) {
					versionsString = "   ";
				}
				allVersions.add(versionsString);
			}
			table.append(StringUtils.join(allVersions, " || ") + "\n");
		}

		table.append("|-\n");
		table.append("|}");

		System.out.println(table);

	}
}
