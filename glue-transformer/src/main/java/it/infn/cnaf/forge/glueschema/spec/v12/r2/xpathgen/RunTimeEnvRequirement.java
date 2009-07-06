package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class RunTimeEnvRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public RunTimeEnvRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("RunTimeEnv.Variable")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else {
				// do nothing cos this element won't have a subrequirement
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("RunTimeEnv")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("RunTimeEnv") + xpathQuery;
		}		
		return xpathQuery;
	}

}
