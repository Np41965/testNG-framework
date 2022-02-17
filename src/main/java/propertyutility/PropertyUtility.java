package propertyutility;

import java.io.FileInputStream;
import java.util.Properties;

import baselibrary.Baselibrary;

public class PropertyUtility extends Baselibrary 
{
	static String path="C:\\Users\\Naresh\\eclipse-workspace\\TestingBABA\\TestData\\testdata.properties"; 
	public static String getreadproperty(String key)
	{
		String value="";
	try
	{
		FileInputStream file=new FileInputStream(path);
		Properties prob=new Properties();
		prob.load(file);
		value=prob.getProperty(key);
		
	}
	catch(Exception e)
	{
		System.out.println("Issue in Getproperty"+ e);
	}
	
	return value;
	}
 
}