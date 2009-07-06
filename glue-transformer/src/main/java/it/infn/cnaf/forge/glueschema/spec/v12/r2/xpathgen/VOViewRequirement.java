package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class VOViewRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public VOViewRequirement() {
		xpathQuery = "";
		// add subrequirement: acl
		addSubRequirement(new ACLRequirement());
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("VOView.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("VOView.DefaultSE") ||
				condition.getOperand1().equalsIgnoreCase("VOView.ApplicationDir") ||
				condition.getOperand1().equalsIgnoreCase("VOView.DataDir")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("VOView.RunningJobs") ||
					condition.getOperand1().equalsIgnoreCase("VOView.WaitingJobs") ||
					condition.getOperand1().equalsIgnoreCase("VOView.TotalJobs") ||
					condition.getOperand1().equalsIgnoreCase("VOView.EstimatedResponseTime") ||
					condition.getOperand1().equalsIgnoreCase("VOView.WorstResponseTime") ||
					condition.getOperand1().equalsIgnoreCase("VOView.FreeJobSlots")) {
				xpathQuery += XPathQueryHelper.numberElementToXPath(condition);
			}
			else {
				for (GLUERequirement req : subRequirements) {
					req.processCondition(condition);
				}
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {	
		if (!isXPathStringProcessed) {
			String finalReqXPath = "";
			for (GLUERequirement i : subRequirements) {
				String subReqXPath = i.getXPathQueryString(entityName);
				if (subReqXPath.length() > 0) {
					if (subReqXPath.endsWith("/self::node()")) {
						finalReqXPath = subReqXPath;						
					}
					else {				
						xpathQuery += XPathQueryHelper.goToParentNode(subReqXPath);
					}
				}
			}
			if (finalReqXPath.length() > 0) {
				xpathQuery += finalReqXPath;
			}
			
			if (entityName.equalsIgnoreCase("VOView")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("VOView") + xpathQuery;
		}		
		
		return xpathQuery;
	}

}
