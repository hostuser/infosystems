package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class NetworkAdapterRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public NetworkAdapterRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("NetworkAdapter.InboundIP") ||
				condition.getOperand1().equalsIgnoreCase("NetworkAdapter.OutboundIP")) {
				xpathQuery += XPathQueryHelper.booleanAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("NetworkAdapter.Name") ||
				condition.getOperand1().equalsIgnoreCase("NetworkAdapter.IPAddress")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("NetworkAdapter.MTU")) {
				xpathQuery += XPathQueryHelper.numberAttributeToXPath(condition);
			}
			else {
				// do nothing cos this element won't have a subrequirement
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("NetworkAdapter")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("NetworkAdapter") + xpathQuery;
		}		
		return xpathQuery;
	}
}
