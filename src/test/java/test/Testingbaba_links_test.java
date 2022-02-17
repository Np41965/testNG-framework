package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_links_pages;
import propertyutility.PropertyUtility;

public class Testingbaba_links_test extends Baselibrary
{
	Testingbaba_links_pages ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url = PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_links_pages();
	}
	
	@Test(priority = 0)
	public void get_title()
	{
		ob.gettitle();
	}
	@Test(priority = 1)
	public void clickeles()
	{
		ob.clickele();
	}
	@Test(priority = 2 )
	public void demopage() throws Exception
	{
		ob.demopage();
	}
	
	@Test(priority = 3)
	
	public void WindowHendle()
	{
		ob.windowhandle();
	}

	@Test(priority = 4)
	
	public void getVerify()
	{
		ob.getverify();
	}

	@Test(priority = 5)
	
	public void loginFlipcart()
	{
		ob.loginflipcart();
	}
	
@Test(priority = 6)
	
	public void getVerify2()
	{
		ob.getverify2();
	}

	
}
