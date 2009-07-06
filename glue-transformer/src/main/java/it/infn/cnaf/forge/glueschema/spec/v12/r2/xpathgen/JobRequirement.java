package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class JobRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public JobRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("Job.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("Job.GlobalID") ||
				condition.getOperand1().equalsIgnoreCase("Job.LocalOwner") ||
				condition.getOperand1().equalsIgnoreCase("Job.GlobalOwner") ||
				condition.getOperand1().equalsIgnoreCase("Job.Status") ||
				condition.getOperand1().equalsIgnoreCase("Job.SchedulerSpecific")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else { 
				// do nothing cos this element won't have a subrequirement
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("Job")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("Job") + xpathQuery;
		}		
		return xpathQuery;
	}

}
