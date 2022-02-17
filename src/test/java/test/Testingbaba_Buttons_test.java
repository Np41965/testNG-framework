package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Buttons_page;
import propertyutility.PropertyUtility;

public class Testingbaba_Buttons_test extends Baselibrary 
{
	Testingbaba_Buttons_page ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_Buttons_page();
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
	public void clickonBTNs() throws Exception
	{
		ob.clickonButtons();
		
	}
	@Test(priority = 3)
	public void  doubleclicks()
	{
		ob. doubleclick();
	}
	
	@Test(priority = 4)
	public void  rightclick()
	{
		ob.rightclicks();
		
	}
	
	@Test(priority = 5)
	public void getverify()
	{
		ob.verify();
	}

}
