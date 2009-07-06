package au.edu.sapac.grid.glueschema.transform;

public class GLUEQueryTransformerFactory {
	
	public final static String GLUE_SCHEMA_V12_R2 = 
		"http://forge.cnaf.infn.it/glueschema/Spec/V12/R2";
	
	private GLUEQueryTransformerFactory() {
		
	}
	
	public static GLUEQueryTransformerFactory newInstance() {
		return new GLUEQueryTransformerFactory();
	}
	
	public GLUEQueryTransformer createGLUEQueryTransformer(
			String glueSchemaVersion) throws UnknownGLUESchemaVersion {
		if (glueSchemaVersion.equals(GLUE_SCHEMA_V12_R2)) {
			return new GLUEv12r2QueryTransformer();
		}
		else {
			throw new UnknownGLUESchemaVersion();
		}
		
	}

}
