package au.edu.sapac.grid.glueschema.transform;

import java.util.List;
import java.util.ArrayList;

public abstract class GLUERequirement {
	
	protected List<GLUERequirement> subRequirements = 
		new ArrayList<GLUERequirement>();
	
	protected void addSubRequirement(GLUERequirement requirement) {
		subRequirements.add(requirement);
	}

	public abstract void processCondition(GLUEQueryCondition condition);
	
	public abstract String getXPathQueryString(String entityName);
	
}
