package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;
import pages.Testingbaba_resizable_page;
import propertyutility.PropertyUtility;

public class Testingbaba_resizable_test extends Baselibrary
{
	Testingbaba_resizable_page ob;
	@BeforeTest
	public void launchurl()
	{
		getlaunch(PropertyUtility.getreadproperty("url"));
		ob=new Testingbaba_resizable_page();
	}

	
	@Test(priority = 0)
	
	public void tillprectice() 
	{
		Applicationutility.tillprecticebtn();
		ob.gettitle();
	}
	
	@Test(priority=1)
	public void tillresizableBTN()
	{
		ob.clicktillresizablebtn();
	}
	
	@Test(priority = 2)
	public void resizing()
	{
		ob.resizing();
	}
}
