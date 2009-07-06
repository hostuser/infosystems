package au.edu.sapac.grid.glueschema.transform;

public class GLUEQueryCondition {
	
  private String operand1;
  private String operator;
  private String operand2;
  
  public GLUEQueryCondition() { }
  
  public GLUEQueryCondition(String operand1, String operator, String operand2) {
    this.operand1 = operand1;
    this.operator = operator;
    this.operand2 = operand2;
  }
  
  public void setOperator(String operator) {
	  this.operator = operator;
  }
  
  public void setOperand1(String operand1) {
	  this.operand1 = operand1;
  }
  
  public void setOperand2(String operand2) {
	  this.operand2 = operand2;
  }

  public String getOperator() {
    return operator;
  }

  public String getOperand1() {
    return operand1;
  }

  public String getOperand2() {
    return operand2;
  }
  /*
  public class SingleCondition {
	  private String operand1;
	  private String operator;
	  private String operand2;
	  
	  public SingleCondition() { }
	  
	  public SingleCondition(String operand1, String operator, String operand2) {
		  this.operand1 = operand1;
		  this.operator = operator;
		  this.operand2 = operand2;
	  }
	  
	  public void setOperator(String operator) {
		  this.operator = operator;
	  }
	  
	  public void setOperand1(String operand1) {
		  this.operand1 = operand1;
	  }
	  
	  public void setOperand2(String operand2) {
		  this.operand2 = operand2;
	  }
	  
	  public String getOperator() {
	    return operator;
	  }

	  public String getOperand1() {
	    return operand1;
	  }

	  public String getOperand2() {
	    return operand2;
	  }	  
  }
  
  public class GroupCondition {
	  
  }
  */
}
