package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Hoverandclick_page;
import propertyutility.PropertyUtility;

public class Testingbaba_Hoverandclick_test extends Baselibrary
{
	Testingbaba_Hoverandclick_page ob;
	
	@BeforeTest
	public void getlaunch()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_Hoverandclick_page();
		
	}
	
	@Test(priority=0)
	public void clickonclosebtn()
	{	
		ob.gettitle();
		ob.clickonclosebtn();
	}
	
	@Test (priority=1)
	public void clickprectice()
	{
		ob.clickonprecticebtn();
	}
	
	 @Test(priority = 2)
	 public void clickwidget()
	 {
		 ob.clickwidgetbtn();
		 ob.clickonmenu();
	 }
	 @Test(priority = 3)
	 public void webDEVhoverandClick()
	 {
		 ob.hoverandclickwebDev();
		 
	 }
	 
	
}
