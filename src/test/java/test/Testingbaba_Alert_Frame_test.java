package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Alert_Frame_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_Alert_Frame_test extends Baselibrary
{
	Testingbaba_Alert_Frame_Page ob;
	@BeforeTest
	public void getLaunch()
	{
		
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_Alert_Frame_Page();
	}
	@Test(priority = 0)
	public void gettitle() 
	{
	String title = driver.getTitle();
	System.out.println(title);
	}
	
	@Test(priority = 1)
	public void till_Alert()
	{
		ob.tillAlert();
	}
	
	@Test(priority = 2)
	public void Cleckme_alert()
	{
		ob.click_me();
	}

	@Test(priority = 3)
	public void Cleckme_1() 
	{
		ob.click_me1();
	}
	
	@Test(priority = 4)
	public void Cleckme_2() 
	{
		ob.click_me2();
	}
	
	@Test(priority = 5)
	public void Cleckme_3() 
	{
		ob.click_me3();
	}

}

