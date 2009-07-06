package au.edu.sapac.grid.glueschema.transform;

import java.io.StringReader;

public class GLUEv12r2QueryTransformer implements GLUEQueryTransformer {

	public String transform(String glueQueryString) throws ParseException {
		GLUEQueryParser parser = new GLUEQueryParser(
				new StringReader(glueQueryString));
	    return parser.parse();
	}
}
