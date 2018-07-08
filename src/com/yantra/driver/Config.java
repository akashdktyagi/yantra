package com.yantra.driver;

import java.io.File;
/*
 * @author: Akash Tyagi
 * date:7May2018
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Config {

		
	private HashMap<String,String> hm = new HashMap<String,String>();
	
	public HashMap<String, String> getHm() {
		return hm;
	}
	
	public Config() throws IOException {
		//Read the Config
		Properties p = new Properties();
		InputStream s = null;
		//File f=new File();
		s = new FileInputStream("D:\\VisionIT\\SeleniumFW\\yantra\\src\\com\\yantra\\config.properties");
		p.load(s);
		
		Enumeration<?> e  = p.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String val = p.getProperty(key);
			hm.put(key, val);
			
		}//end While
	}//end construct

}//end class
