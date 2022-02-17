package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Tool_Tips_page;

public class Testingbaba_Tool_Tips_test extends Baselibrary 
{
	Testingbaba_Tool_Tips_page ob;
	@BeforeTest
	public void launchurl()
	{
		String url=propertyutility.PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_Tool_Tips_page();
		ob.gettitle();
	}
	

	@Test(priority=0)
	public void clickonclosebtn()
	{	
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
	 }
	 @Test(priority = 3)
	 public void clickontooltipsBtn() 
	 {
		 ob.tooltipsBtn();
	 }

	 @Test(priority = 4)
	 public void onhovered()
	 {
		 ob.hoveron();
	 }
}
