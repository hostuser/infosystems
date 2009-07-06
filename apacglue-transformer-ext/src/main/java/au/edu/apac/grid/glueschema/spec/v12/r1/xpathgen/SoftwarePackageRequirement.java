package au.edu.apac.grid.glueschema.spec.v12.r1.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class SoftwarePackageRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public SoftwarePackageRequirement() {
		xpathQuery = "";
		
		try {
			Class softwareExecutableRequirement = Class.forName(
				GLUEClassMapper.getClass("SoftwareExecutableRequirement"));
			addSubRequirement((GLUERequirement)softwareExecutableRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// add voview later..
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("SoftwarePackage.LocalID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("SoftwarePackage.Name") ||
				condition.getOperand1().equalsIgnoreCase("SoftwarePackage.Version") ||
				condition.getOperand1().equalsIgnoreCase("SoftwarePackage.Path") ||
				condition.getOperand1().equalsIgnoreCase("SoftwarePackage.QueueResource") ||
				condition.getOperand1().equalsIgnoreCase("SoftwarePackage.Module")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("SoftwarePackage.SerialAvail") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.ParallelAvail")) {
				xpathQuery += XPathQueryHelper.booleanElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("SoftwarePackage.ParallelMaxCPUs") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.TotalCPUSeats") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.FreeCPUSeats") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.TotalJobSeats") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.FreeJobSeats") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.TotalUserSeats") ||
					condition.getOperand1().equalsIgnoreCase("SoftwarePackage.FreeUserSeats")) {
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
			
			if (entityName.equalsIgnoreCase("SoftwarePackage")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("SoftwarePackage") + xpathQuery;
		}		
		
		return xpathQuery;
	}
}
