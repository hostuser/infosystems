package au.org.arcs.grid.sched.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PluginLoader {

	static Logger myLogger = Logger.getLogger(PluginLoader.class.getName());

	private static Properties matchmakerProperties;

	private final static String MATCHMAKER_PROPERTIES = "matchmaker.properties";

	static {
		matchmakerProperties = new Properties();
		try {
			matchmakerProperties
			.load(new FileInputStream(MATCHMAKER_PROPERTIES));
		} catch (IOException e) {
			myLogger.error(e);
			try {
				InputStream is = PluginLoader.class.getClassLoader()
						.getResourceAsStream(MATCHMAKER_PROPERTIES);
				matchmakerProperties.load(is);
			} catch (IOException ioe) {
				myLogger.error(ioe);
				System.exit(-1);
			}
		}
	}

	public static String getImplementationClass(String interfaceName) {
		return matchmakerProperties.getProperty(interfaceName);
	}

}
