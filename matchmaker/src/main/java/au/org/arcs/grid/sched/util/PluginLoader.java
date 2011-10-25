package au.org.arcs.grid.sched.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PluginLoader {

	static Logger myLogger = LoggerFactory.getLogger(PluginLoader.class);

	private static Properties matchmakerProperties;

	private final static String MATCHMAKER_PROPERTIES = "matchmaker.properties";

	static {
		matchmakerProperties = new Properties();
		try {
			matchmakerProperties
			.load(new FileInputStream(MATCHMAKER_PROPERTIES));
		} catch (IOException e) {
			myLogger.error(e.getLocalizedMessage(), e);
			try {
				InputStream is = PluginLoader.class.getClassLoader()
						.getResourceAsStream(MATCHMAKER_PROPERTIES);
				matchmakerProperties.load(is);
			} catch (IOException ioe) {
				myLogger.error(ioe.getLocalizedMessage(), ioe);
				System.exit(-1);
			}
		}
	}

	public static String getImplementationClass(String interfaceName) {
		return matchmakerProperties.getProperty(interfaceName);
	}

}
