package test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_launch_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_launch_test extends Baselibrary
{

	Testingbaba_launch_Page ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_launch_Page();
		ob.clickonclosebtn();
		

	}
	@Test
	
	public void gettitle() throws Exception 
	{
		ob.gettitle();
	}
	
	
	

}
