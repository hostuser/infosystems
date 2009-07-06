package au.edu.sapac.grid.glueschema.util;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GLUESchemaLibConfig {

	private static Properties glueSchemaLibProp;
	private final static String GLUESCHEMALIB_PROPS_FILE = 
		"glueschemalib.properties";
	
	private static Logger logger = Logger.getLogger(GLUESchemaLibConfig.class);
	
	
	static {
		//PropertyConfigurator.configure("log4j.properties");
		glueSchemaLibProp = new Properties();
		try {
			glueSchemaLibProp.load(new FileInputStream(GLUESCHEMALIB_PROPS_FILE));
		} catch (IOException e) {
			logger.debug(e.getMessage());
			try {
				InputStream is = GLUESchemaLibConfig.class.getClassLoader()
					.getResourceAsStream(GLUESCHEMALIB_PROPS_FILE);
				glueSchemaLibProp.load(is);
			} catch (IOException ioe) {
				e.printStackTrace();
				ioe.printStackTrace();
				logger.debug(e.getMessage());
				System.exit(-1);
			}
		}
		
		
	}
	
	public static String getConfig(String configName) {
		return glueSchemaLibProp.getProperty(configName);
	}
	
	public static void main(String[] args) {
		System.out.println(getConfig("glueclassmap"));
	}
}
