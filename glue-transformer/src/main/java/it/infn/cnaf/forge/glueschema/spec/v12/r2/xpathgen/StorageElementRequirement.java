package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class StorageElementRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public StorageElementRequirement() {
		xpathQuery = "";
		
		// add subrequirement: storagearea
		try {
			Class storageAreaRequirement = Class.forName(
				GLUEClassMapper.getClass("StorageAreaRequirement"));
			addSubRequirement((GLUERequirement)storageAreaRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class accessProtocolRequirement = Class.forName(
				GLUEClassMapper.getClass("AccessProtocolRequirement"));
			addSubRequirement((GLUERequirement)accessProtocolRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class controlProtocolRequirement = Class.forName(
				GLUEClassMapper.getClass("ControlProtocolRequirement"));
			addSubRequirement((GLUERequirement)controlProtocolRequirement.newInstance());
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
			if (condition.getOperand1().equalsIgnoreCase("StorageElement.UniqueID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("StorageElement.Architecture")) {
				xpathQuery += XPathQueryHelper.textElementToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("StorageElement.SizeTotal") ||
					condition.getOperand1().equalsIgnoreCase("StorageElement.SizeFree")) {
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
			
			if (entityName.equalsIgnoreCase("StorageElement")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("StorageElement") + xpathQuery;
		}		
		
		return xpathQuery;
	}
}
