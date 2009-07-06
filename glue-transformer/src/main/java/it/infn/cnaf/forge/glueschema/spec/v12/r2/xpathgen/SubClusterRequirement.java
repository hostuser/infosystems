package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class SubClusterRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public SubClusterRequirement() {
		xpathQuery = "";
		
		// add subrequirements: os, processor, networkadapter, mainmemory, 
		// architecture, benchmark, runtimeenv
		try {
			Class osRequirement = Class.forName(
				GLUEClassMapper.getClass("OperatingSystemRequirement"));
			addSubRequirement((GLUERequirement)osRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class processorRequirement = Class.forName(
				GLUEClassMapper.getClass("ProcessorRequirement"));
			addSubRequirement((GLUERequirement)processorRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class networkAdapterRequirement = Class.forName(
				GLUEClassMapper.getClass("NetworkAdapterRequirement"));
			addSubRequirement((GLUERequirement)networkAdapterRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class mainMemoryRequirement = Class.forName(
				GLUEClassMapper.getClass("MainMemoryRequirement"));
			addSubRequirement((GLUERequirement)mainMemoryRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class architectureRequirement = Class.forName(
				GLUEClassMapper.getClass("ArchitectureRequirement"));
			addSubRequirement((GLUERequirement)architectureRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Class benchmarkRequirement = Class.forName(
				GLUEClassMapper.getClass("BenchmarkRequirement"));
			addSubRequirement((GLUERequirement)benchmarkRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class locationRequirement = Class.forName(
				GLUEClassMapper.getClass("LocationRequirement"));
			addSubRequirement((GLUERequirement)locationRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			Class runTimeEnvRequirement = Class.forName(
				GLUEClassMapper.getClass("RunTimeEnvRequirement"));
			addSubRequirement((GLUERequirement)runTimeEnvRequirement.newInstance());
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
			if (condition.getOperand1().equalsIgnoreCase("SubCluster.UniqueID")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("SubCluster.Name") ||
				condition.getOperand1().equalsIgnoreCase("SubCluster.PhysicalCPUs") ||
				condition.getOperand1().equalsIgnoreCase("SubCluster.LogicalCPUs") ||
				condition.getOperand1().equalsIgnoreCase("SubCluster.TmpDir") ||
				condition.getOperand1().equalsIgnoreCase("SubCluster.WNTmpDir")) {
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
			
			if (entityName.equalsIgnoreCase("SubCluster")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("SubCluster") + xpathQuery;
		}		
		
		return xpathQuery;
	}
}
