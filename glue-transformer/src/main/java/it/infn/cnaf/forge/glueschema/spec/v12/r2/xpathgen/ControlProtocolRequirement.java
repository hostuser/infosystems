package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class ControlProtocolRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public ControlProtocolRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("ControlProtocol.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("ControlProtocol.Endpoint") ||
					condition.getOperand1().equalsIgnoreCase("ControlProtocol.Type") ||
					condition.getOperand1().equalsIgnoreCase("ControlProtocol.Version") ||
					condition.getOperand1().equalsIgnoreCase("ControlProtocol.Capability")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else {
				// do nothing
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("ControlProtocol")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("ControlProtocol") + xpathQuery;
		}		
		return xpathQuery;
	}

}
