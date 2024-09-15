package com.crm.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String readData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Vaibhav\\eclipse-workspace\\com.crm.PricTechnology\\src\\test\\resources\\CrossBrowser.properties");
		 prop.load(fis);
		 String data = prop.getProperty(key);
		return data;
	}	

}
