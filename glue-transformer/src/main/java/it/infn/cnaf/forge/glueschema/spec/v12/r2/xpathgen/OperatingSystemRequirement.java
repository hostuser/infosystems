package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class OperatingSystemRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public OperatingSystemRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("OperatingSystem.Name") ||
				condition.getOperand1().equalsIgnoreCase("OperatingSystem.Release") ||
				condition.getOperand1().equalsIgnoreCase("OperatingSystem.Version")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else {
				// do nothing cos this element won't have a subrequirement
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("OperatingSystem")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("OperatingSystem") + xpathQuery;
		}		
		return xpathQuery;
	}
}
