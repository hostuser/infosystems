package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class ComputingElementRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public ComputingElementRequirement() {
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
		
		try {
			Class jobRequirement = Class.forName(
				GLUEClassMapper.getClass("JobRequirement"));
			addSubRequirement((GLUERequirement)jobRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class voViewRequirement = Class.forName(
				GLUEClassMapper.getClass("VOViewRequirement"));
			addSubRequirement((GLUERequirement)voViewRequirement.newInstance());
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
			if (condition.getOperand1().equalsIgnoreCase("ComputingElement.UniqueID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("ComputingElement.Name")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("ComputingElement.LRMSType") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.LRMSVersion") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.GRAMVersion") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.HostName") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.GateKeeperPort") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.JobManager") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.ContactString") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.ApplicationDir") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.DataDir") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.DefaultSE") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.Status")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}			
			else if (condition.getOperand1().equalsIgnoreCase("ComputingElement.RunningJobs") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.WaitingJobs") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.TotalJobs") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.EstimatedResponseTime") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.WorstResponseTime") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.FreeJobSlots") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.MaxWallClockTime") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.MaxCPUTime") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.MaxTotalJobs") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.MaxRunningJobs") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.Priority") ||
				condition.getOperand1().equalsIgnoreCase("ComputingElement.AssignedJobSlots")) {
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
			
			if (entityName.equalsIgnoreCase("ComputingElement")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("ComputingElement") + xpathQuery;
		}		
		
		return xpathQuery;
	}
}
