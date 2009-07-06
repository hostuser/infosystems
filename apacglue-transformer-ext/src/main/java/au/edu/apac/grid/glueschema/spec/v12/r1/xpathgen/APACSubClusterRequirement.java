package au.edu.apac.grid.glueschema.spec.v12.r1.xpathgen;

import au.edu.sapac.grid.glueschema.transform.GLUERequirement;
import au.edu.sapac.grid.glueschema.util.GLUEClassMapper;
import it.infn.cnaf.forge.glueschema.spec.v12.r2.xpathgen.SubClusterRequirement;

public class APACSubClusterRequirement extends SubClusterRequirement {

	public APACSubClusterRequirement() {
		super();
		
		try {
			Class softwarePackageRequirement = Class.forName(
				GLUEClassMapper.getClass("SoftwarePackageRequirement"));
			addSubRequirement((GLUERequirement)softwarePackageRequirement.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
}
