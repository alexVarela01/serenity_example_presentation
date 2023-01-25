package org.example.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class to load the properties file from resource 
 *
 */
public class LocatorsLoader {
	
	private static LocatorsLoader locatorsLoader = null;
	private String fileName;
	private Properties prop;

	public  LocatorsLoader()  {
		prop = new Properties();
		fileName="locators.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		if(inputStream != null) {
			try {
				prop.load(inputStream);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}		
		}
		else {
			System.out.println("the file is null");
		}		
	}	

	public static LocatorsLoader getLocatorsLoader() {
		if(locatorsLoader == null) {
			locatorsLoader = new LocatorsLoader();
		}
		return locatorsLoader;
	}

	public  String getLocator(String key) {
		return prop.getProperty(key);
	}
	public static String getProperty(String key)  {
		return LocatorsLoader.getLocatorsLoader().getLocator(key);
	}


}
