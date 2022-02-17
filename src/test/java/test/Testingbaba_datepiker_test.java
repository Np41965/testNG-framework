package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_datepiker_page;
import propertyutility.PropertyUtility;

public class Testingbaba_datepiker_test extends Baselibrary
{
	Testingbaba_datepiker_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(PropertyUtility.getreadproperty("url"));
		ob=new Testingbaba_datepiker_page();
	}
	
	@Test(priority= 0)
	public void gettitles()
	{
		ob.gettitle();
	}
	
	@Test(priority=-1)
	public void clicktill_datepiker() throws Exception
	{
		ob.clicktilldatepiker();
	}
	
	@Test(priority=2)
	public void date_select() throws Exception
	{
		ob.dateselect();
	}
	
	@Test(priority = 3)
	public void dateTimepicking() throws InterruptedException 
	{
		ob.date_time_fill();
	}
}
