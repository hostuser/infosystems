package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class AccessProtocolRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public AccessProtocolRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("AccessProtocol.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("AccessProtocol.Endpoint") ||
					condition.getOperand1().equalsIgnoreCase("AccessProtocol.Type") ||
					condition.getOperand1().equalsIgnoreCase("AccessProtocol.Version") ||
					condition.getOperand1().equalsIgnoreCase("AccessProtocol.Capability")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else {
				// do nothing
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {		
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("AccessProtocol")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("AccessProtocol") + xpathQuery;
		}		
		return xpathQuery;
	}
}
