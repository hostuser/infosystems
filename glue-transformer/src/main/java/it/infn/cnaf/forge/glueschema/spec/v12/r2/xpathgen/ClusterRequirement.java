package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class ClusterRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed;
	private boolean isXPathStringProcessed = false;
	
	public ClusterRequirement() {
		isConditionProcessed = false;
		xpathQuery = "";
		
		// add subrequirements: ce, subcluster		
		try {
			Class computingElementRequirement = Class.forName(
				GLUEClassMapper.getClass("ComputingElementRequirement"));
			addSubRequirement((GLUERequirement)computingElementRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class subClusterRequirement = Class.forName(
				GLUEClassMapper.getClass("SubClusterRequirement"));
			addSubRequirement((GLUERequirement)subClusterRequirement.newInstance());
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
			if (condition.getOperand1().equalsIgnoreCase("Cluster.UniqueID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("Cluster.Name") ||
				condition.getOperand1().equalsIgnoreCase("Cluster.TmpDir") ||
				condition.getOperand1().equalsIgnoreCase("Cluster.WNTmpDir")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
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
			
			if (entityName.equalsIgnoreCase("Cluster")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("Cluster") + xpathQuery;
		}		
		return xpathQuery;
	}
}
