package au.edu.sapac.grid.glueschema.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class GLUEClassMapper {

	private static Properties glueClassMapperProp;
	
	private static Logger logger = Logger.getLogger(GLUEClassMapper.class);
			
	static {
		glueClassMapperProp = new Properties();
		String glueClassMapperFile = 
			GLUESchemaLibConfig.getConfig("glueclassmap");
		try {
			glueClassMapperProp.load(new FileInputStream(glueClassMapperFile));
		} catch (IOException e) {
			logger.debug(e.getMessage());
			try {
				InputStream is = GLUESchemaLibConfig.class.getClassLoader()
					.getResourceAsStream(glueClassMapperFile);
				glueClassMapperProp.load(is);
			} catch (IOException ioe) {
				e.printStackTrace();
				ioe.printStackTrace();
				logger.debug(ioe.getMessage());
				System.exit(-1);
			}
		}
	}
	
	public static String getClass(String glueRequirement) {
		return glueClassMapperProp.getProperty(glueRequirement);
	}
}
