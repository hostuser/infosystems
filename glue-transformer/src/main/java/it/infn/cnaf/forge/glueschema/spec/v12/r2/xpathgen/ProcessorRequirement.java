package it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.XPathQueryHelper;

public class ProcessorRequirement extends GLUERequirement {
	
	private String xpathQuery;
	private boolean isConditionProcessed = false;
	private boolean isXPathStringProcessed = false;
	
	public ProcessorRequirement() {
		xpathQuery = "";
	}
	
	public void processCondition(GLUEQueryCondition condition) {
		if (!isConditionProcessed) {
			if (condition.getOperand1().equalsIgnoreCase("Processor.Vendor") ||
				condition.getOperand1().equalsIgnoreCase("Processor.Model") ||			
				condition.getOperand1().equalsIgnoreCase("Processor.InstructionSet") ||
				condition.getOperand1().equalsIgnoreCase("Processor.OtherDescription")) {
				xpathQuery += XPathQueryHelper.textAttributeToXPath(condition);
			}
			else if (condition.getOperand1().equalsIgnoreCase("Processor.ClockSpeed") ||
					condition.getOperand1().equalsIgnoreCase("Processor.CacheL1") ||
					condition.getOperand1().equalsIgnoreCase("Processor.CacheL1I") ||
					condition.getOperand1().equalsIgnoreCase("Processor.CacheL1D") ||
					condition.getOperand1().equalsIgnoreCase("Processor.CacheL2")) {
				xpathQuery += XPathQueryHelper.numberAttributeToXPath(condition);
			}
			else {
				// do nothing cos this element won't have a subrequirement
			}
		}
	}
	
	public String getXPathQueryString(String entityName) {
		if (!isXPathStringProcessed) {
			if (entityName.equalsIgnoreCase("Processor")) {
				xpathQuery += "/self::node()";
			}
			xpathQuery = xpathQuery.length() == 0 ? "" :
				XPathQueryHelper.goToDescendantNode("Processor") + xpathQuery;
		}		
		return xpathQuery;
	}

}
