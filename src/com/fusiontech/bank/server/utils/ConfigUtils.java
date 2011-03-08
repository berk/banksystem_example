package com.fusiontech.bank.server.utils;

import java.util.Properties;

public class ConfigUtils {
	private static Properties properties = null;
	
	static {
		try {
			java.net.URL url = ClassLoader.getSystemResource("banksystem.properties");
			if (url==null)
				throw new Exception("Failed to locate banksystem.properties");
			
			System.out.println("Loading properties from " + url.toString());
			
			properties = new Properties();
			properties.load(url.openStream());
		} catch (Exception e) {
			properties = null;
			System.out.println("Failed to load properties: " + e.getMessage());
		}
	}
	
	private static Properties getProperties() {
		return properties;
	}
	
	public static String getProperty(String propName, String defaultVal) {
		Properties props = getProperties();
		if (props==null)
			return defaultVal;
		
		return props.getProperty(propName, defaultVal);
	}

	public static int getPropertyAsInt(String propName, int defaultVal) {
		Properties props = getProperties();
		if (props==null)
			return defaultVal;
		
		try {
			return Integer.parseInt(props.getProperty(propName));
		} catch (Exception e) {
			return defaultVal;
		}
	}

	public static boolean getPropertyAsBoolean(String propName, boolean defaultVal) {
		Properties props = getProperties();
		if (props==null)
			return defaultVal;
		
		try {
			return Boolean.parseBoolean(props.getProperty(propName));
		} catch (Exception e) {
			return defaultVal;
		}
	}
}
