package com.qa.hrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public Properties prop;
	public  ReadPropertyFile()  {
		String propFilePath =  System.getProperty("user.dir")+"\\config\\config.properties";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propFilePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		prop =new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public String getBrowser() {
		String propValue = prop.getProperty("browser");
		return propValue;
	}
	
	public String getAppUrl() {
		String propValue = prop.getProperty("url");
		return propValue;
	}
	
	public String getAdminUserName() {
		String propValue = prop.getProperty("username");
		return propValue;
	}
	
	public String getAdminPwd() {
		String propValue = prop.getProperty("password");
		return propValue;
	}
}
