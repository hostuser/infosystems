package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.*;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;

public class SiteRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public SiteRequirement() {
		xpathQuery = "";
		try {
			Class clusterRequirement = Class.forName(
				GLUEClassMapper.getClass("ClusterRequirement"));
			addSubRequirement((GLUERequirement)clusterRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class clusterRequirement = Class.forName(
				GLUEClassMapper.getClass("StorageElementRequirement"));
			addSubRequirement((GLUERequirement)clusterRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	// this can probably throw an exception later on if the field the user has
	// specified is not supported. OR we can simply just ignore it
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("Site.UniqueID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("Site.Name") ||
				condition.getOperand1().equalsIgnoreCase("Site.Description") ||
				condition.getOperand1().equalsIgnoreCase("Site.UserSupportContact") ||
				condition.getOperand1().equalsIgnoreCase("Site.SysAdminContact") ||
				condition.getOperand1().equalsIgnoreCase("Site.Location") ||
				condition.getOperand1().equalsIgnoreCase("Site.Web") ||
				condition.getOperand1().equalsIgnoreCase("Site.Sponsor") ||
				condition.getOperand1().equalsIgnoreCase("Site.OtherInfo")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("Site.Latitude") ||
					condition.getOperand1().equalsIgnoreCase("Site.Logitude")) {
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
			
			if (entityName.equalsIgnoreCase("Site")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("Site") + xpathQuery;
		}		
		return xpathQuery;
	}
	
}
