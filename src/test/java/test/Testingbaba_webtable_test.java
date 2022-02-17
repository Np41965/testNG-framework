package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_webtable_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_webtable_test extends Baselibrary
{
	Testingbaba_webtable_Page ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_webtable_Page();
		ob.clickonclosebtn();
		
	
		

	}
	@Test(priority=0)
	
	public void gettitle() throws Exception 
	{
		ob.gettitle();
	}
	
	@Test(priority=1)
	public void clickonElements() throws Exception
	{
		ob.clickonElements();
		Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void clickonwebTable() throws Exception
	{
		Thread.sleep(2000);
		ob.webTable();
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 3)
	public void verifywebtable() throws Exception
	{
		Thread.sleep(1000);
		ob.verifywebtable();
	}
	
	

}
