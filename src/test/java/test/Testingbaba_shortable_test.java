package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_shortable_page;
import propertyutility.PropertyUtility;

public class Testingbaba_shortable_test extends Baselibrary
{

	Testingbaba_shortable_page ob;
	@BeforeTest
	public void launchurl()
	{
		getlaunch(PropertyUtility.getreadproperty("url"));
		ob=new Testingbaba_shortable_page();
	}

	@Test(priority=1)
	public void get_Title()
	{
		ob.gettitle();
		
	}
	@Test(priority = 2)
	public void clickOn_till_shortBtn()
	{
		ob.till_shortBtn();
	}
	
	@Test(priority = 3)
	
	public void getData_BeforeShort()
	{
		ob.getDataBeforeShort();
	}
	
	@Test(priority = 4)
	public void clickon_sortBtn()
	{
		ob.clickonsortBtn();
	}
	
	@Test(priority = 5)
	public void getData_AfterShort()
	{
		ob.getDataAfterShort();
	}
	
	@Test(priority = 6)
	public void check_veryfy()
	{
		ob.checkveryfy();
	}
	
	
}
