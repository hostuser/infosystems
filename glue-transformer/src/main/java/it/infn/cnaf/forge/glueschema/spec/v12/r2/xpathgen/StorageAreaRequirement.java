package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class StorageAreaRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public StorageAreaRequirement() {
		xpathQuery = "";
		
		// add subrequirements: acl, job, voview
		try {
			Class aclRequirement = Class.forName(
				GLUEClassMapper.getClass("ACLRequirement"));
			addSubRequirement((GLUERequirement)aclRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("StorageArea.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("StorageArea.Path") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.Type")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("StorageArea.Quota") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.MinFileSize") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.MaxFileSize") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.MaxData") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.MaxNumFiles") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.MaxPinDuration") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.UsedSpace") ||
					condition.getOperand1().equalsIgnoreCase("StorageArea.AvailableSpace")) {
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
			
			if (entityName.equalsIgnoreCase("StorageArea")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("StorageArea") + xpathQuery;
		}		
		return xpathQuery;
	}

}
