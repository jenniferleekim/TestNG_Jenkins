package techCircle_OrangeHRM.testbase;

import java.io.FileInputStream;
import java.util.Properties;

import techCircle_OrangeHRM.utilities.Constants;



public class ConfigurationReader {

	
	
	
	private static Properties configFile;
	static {
		try {
			String path = Constants.CONFIGURATION_FILEPATH;
			FileInputStream input = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
	
	
	
	
}
