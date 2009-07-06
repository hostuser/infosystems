package au.edu.sapac.grid.glueschema.util;

import au.edu.sapac.grid.glueschema.transform.GLUEQueryCondition;
import java.util.List;
import java.util.Iterator;

public class XPathQueryHelper {

	public static String lowerABC = "abcdefghijklmnopqrstuvwxyz";
	public static String upperABC = lowerABC.toUpperCase();
	
	/**
	 * Generates the xpath query which makes the current xpathString go up one
	 * node higher.
	 * @param str
	 * @return
	 */
	public static String goToParentNode(String xpathString) {
		// only go up one node higher if we've one node lower in the xml tree
		if (xpathString.length() != 0) { 
			xpathString += "/parent::node()"; 
		}
		return xpathString;
	}
	
	public static String goToDescendantNode(String nodeName) {
		return "/descendant::node()[local-name()='" +nodeName + "']";
	}
	
	private static String getCaseAwareText(boolean isCaseSensitive) {
		if (isCaseSensitive) {
			return "text()";
		}
		return "translate(text(),'" + lowerABC + "','" + upperABC + "')";
	}
	
	private static String getCaseAwareOperand2(String operand2, boolean isCaseSensitive) {
		if (!isCaseSensitive) {
			return operand2.toUpperCase();
		}
		return operand2;
	}
	
	public static String textElementToXPath(GLUEQueryCondition condition) {
		return textElementToXPath(condition, false);
	}
	
	public static String textElementToXPath(GLUEQueryCondition condition, boolean isCaseSensitive) {
		if (condition.getOperator().equals("!=")) {
			return goToParentNode("/child::node()[local-name()='" +
					getFieldName(condition.getOperand1()) + "'][" + 
					getCaseAwareText(isCaseSensitive) + "!=" + 
					getCaseAwareOperand2(condition.getOperand2(), isCaseSensitive) + "]");
			
			
		}
		else if (condition.getOperator().equals("=")) {
			return goToParentNode("/child::node()[local-name()='" +
					getFieldName(condition.getOperand1()) + "'][" + 
					getCaseAwareText(isCaseSensitive) + "=" + 
					getCaseAwareOperand2(condition.getOperand2(), isCaseSensitive) + "]");
		}
		else {//if (condition.getOperator().equalsIgnoreCase("like")) {
			// TODO: might need to add a check later on for str%ing
			String operand2 = condition.getOperand2().replaceAll("%", "");
			// string%
			if (!condition.getOperand2().startsWith("'%") && 
					condition.getOperand2().endsWith("%'")) {
				return goToParentNode("/child::node()[local-name()='" +
						getFieldName(condition.getOperand1()) + "'][starts-with(" + 
						getCaseAwareText(isCaseSensitive) + "," +
						getCaseAwareOperand2(operand2, isCaseSensitive) + ")]");
			}			
			// string - exact case sensitive match; equivalent to '='
			else if (!condition.getOperand2().startsWith("'%") && 
					!condition.getOperand2().endsWith("%'")) {
				return goToParentNode("/child::node()[local-name()='" +
						getFieldName(condition.getOperand1()) + "'][" + 
						getCaseAwareText(isCaseSensitive) + "=" + 
						getCaseAwareOperand2(operand2, isCaseSensitive) + "]");
			}
			// %string% and %string				
			// %string is not supported but for the mean time, we'll make 
			// this behave like %string%
			return goToParentNode("/child::node()[local-name()='" +
					getFieldName(condition.getOperand1()) + "'][contains(" + 
					getCaseAwareText(isCaseSensitive) + "," + 
					getCaseAwareOperand2(operand2, isCaseSensitive) + ")]");
		}
	}
	
	/*public static String exactTextElementToXPath(GLUEQueryCondition condition) {
		if (condition.getOperator().equals("!=")) {
			return goToParentNode("/child::node()[local-name()='" +
				getFieldName(condition.getOperand1()) + "'][text()!=" + 
				condition.getOperand2() + "]");
		}
		return goToParentNode("/child::node()[local-name()='" +
			getFieldName(condition.getOperand1()) + "'][text()=" + 
			condition.getOperand2() + "]");
	}*/
	
	// might need to check for the data types of the fields later on
	public static String numberElementToXPath(GLUEQueryCondition condition) {
		return goToParentNode("/child::node()[local-name()='" +
			getFieldName(condition.getOperand1()) + "'][number(" +
			"child::node())" + condition.getOperator() + condition.getOperand2() + "]");
	}
	
	public static String booleanElementToXPath(GLUEQueryCondition condition) {
		return goToParentNode("/child::node()[local-name()='" +
			getFieldName(condition.getOperand1()) + "'][text()" + 
			condition.getOperator() + "'" + condition.getOperand2().toLowerCase() + "']");
	}
	
	public static String textAttributeToXPath(GLUEQueryCondition condition) {
		return "[contains(translate(@" + getFieldName(condition.getOperand1()) +
			",'" + lowerABC + "','" + upperABC + "')," + 
			condition.getOperand2().toUpperCase() + ")]";
	}
	
	public static String numberAttributeToXPath(GLUEQueryCondition condition) {
		return "[@" + getFieldName(condition.getOperand1()) + 
			condition.getOperator() + condition.getOperand2() + "]";
	}
	
	public static String booleanAttributeToXPath(GLUEQueryCondition condition) {
		return "[@" + getFieldName(condition.getOperand1()) + 
			condition.getOperator() + "'" + condition.getOperand2().toLowerCase() + "']";
	}
	
	
	/**
	 * Overloaded version of the above methods
	 */
	
	public static String textElementToXPath(List<GLUEQueryCondition> conditions) {
		
		String xpathQuery = "/child::node()[local-name()='" +
				getFieldName(conditions.get(0).getOperand1()) + "'][";
		
		Iterator<GLUEQueryCondition> iter = conditions.iterator();
		xpathQuery += "contains(translate(text(),'" + lowerABC + "','" + 
			upperABC + "')," + iter.next().getOperand2()
			.toUpperCase() + ")";
		while(iter.hasNext()) {
			xpathQuery += "and contains(translate(text(),'" + lowerABC + "','" + 
			upperABC + "')," + iter.next().getOperand2()
			.toUpperCase() + ")";
		}
		return goToParentNode(xpathQuery + "]");
		
	}
	
	public static String getXPathForStringEntity(String xpathQuery, String entityName) {
		if (!xpathQuery.endsWith("/self::node()")) {
			return xpathQuery + XPathQueryHelper.goToDescendantNode(entityName);
		}
		return xpathQuery;
	}
	
/*	public static String numberElementToXPath(List<GLUEQueryCondition> conditions) {
		return goToParentNode("/child::node()[local-name()='" +
				getFieldName(condition.getOperand1()) + "'][number(" +
				"child::node())" + condition.getOperator() + condition.getOperand2() + "]");
	}
	
	public static String booleanElementToXPath(List<GLUEQueryCondition> conditions) {
		return goToParentNode("/child::node()[local-name()='" +
				getFieldName(condition.getOperand1()) + "'][text()='" + 
				condition.getOperand2() + "']");
	}
	
	public static String textAttributeToXPath(List<GLUEQueryCondition> conditions) {
		return "[contains(translate(@" + getFieldName(condition.getOperand1()) +
				",'" + Helper.lowerABC + "','" + Helper.upperABC + "')," + 
				condition.getOperand2().toUpperCase() + ")]";
	}
	
	public static String numberAttributeToXPath(List<GLUEQueryCondition> conditions) {
		return "[@" + getFieldName(condition.getOperand1()) + 
				condition.getOperator() + condition.getOperand2() + "]";
	}
	
	public static String booleanAttributeToXPath(List<GLUEQueryCondition> conditions) {
		return "[@" + getFieldName(condition.getOperand1()) + 
				"='" + condition.getOperand2().toLowerCase() + "']";
	}
	*/
	
	
	private static String getFieldName(String glueField) {
		return glueField.substring(glueField.lastIndexOf(".") + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(textElementToXPath(new GLUEQueryCondition(
				"ComputingElement.Name", "=", "'SaPaC'"), false));
		System.out.println(numberElementToXPath(new GLUEQueryCondition(
				"ComputingElement.Name", ">=", "6")));
		System.out.println(booleanAttributeToXPath(new GLUEQueryCondition(
				"OperatingSystem.Name", "=", "tRUE")));
		
		List<GLUEQueryCondition> hello = new java.util.ArrayList<GLUEQueryCondition>();
		hello.add(new GLUEQueryCondition(
				"ComputingElement.Name", "=", "'SAPAC'"));
		hello.add(new GLUEQueryCondition(
				"ComputingElement.Name", "=", "'SAPAC'"));
				
		System.out.println(textElementToXPath(hello));
	}
}
