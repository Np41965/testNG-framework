package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_RadioButton_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_RadioButton_test extends Baselibrary
{
	Testingbaba_RadioButton_Page ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_RadioButton_Page();
		ob.clickonclosebtn();
	}
	
	@Test(priority=0)
	
	public void gettitle() throws Exception 
	{
		ob.gettitle();
	}

	@Test(priority=1)
	public void clickonElements()
	{
		ob.clickonElements();
	}
	
	@Test(priority=2)
	public void clickonRbtn() throws Exception 
	{
		ob.RadioButtonclick();
	}

	@Test(priority=3)
	public void rediobtns() throws Exception
	{
		ob.clickonradiobtns();
	}
	

	

}
