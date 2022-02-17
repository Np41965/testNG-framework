package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Autocomplete_page;

import propertyutility.PropertyUtility;

public class Testingbaba_Autocomplete_test extends Baselibrary
{
	
	Testingbaba_Autocomplete_page ob;
	
	@BeforeTest
	public void launchurl()
	{
		
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_Autocomplete_page();
		
				
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
	 public void clickautocmplte()
	 {
		 ob.clickautocmpltebtn();
	 }
	 
	 @Test(priority = 4)
	 public void clickCountryslect() throws Exception
	 {
		 ob.clickcountryslect();
	 }

}
