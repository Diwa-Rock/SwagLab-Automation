package com.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	
	String path=System.getProperty("user.dir");
	System.out.println(path);
	Properties properties=new Properties();
	properties.load(new FileInputStream ("C:\\Users\\gopika\\eclipse-workspace\\OmrBranchHotelBookingAutomation\\Config\\config.properties"));
	Object object=properties.get("url");
	String value=(String)object;
	System.out.println(value);
}
}