package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Accesspropfile {

	static Properties properties =new Properties();
	
	//public Accesspropfile() throws IOException {
//		properties = new Properties();
	static {
	
	try {
//		FileInputStream fis = new FileInputStream("/Users/nehasingh/eclipse-workspace/restAssuredAPIPractice/testData/MY.properties");
		FileInputStream fis = new FileInputStream("/Users/nehasingh/eclipse-workspace/restAssuredAPIPractice/testData/googlePlace.properties");
		properties.load(fis);
	}
	catch( IOException e ) {
		throw new RuntimeException("Failed to load properties file",e);
	}
	}
	
	public static String getproperty( String key) {
		return properties.getProperty(key);
	}
}

