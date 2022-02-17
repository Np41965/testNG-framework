package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_dropdown_page;
import propertyutility.PropertyUtility;

public class Testingbaba_dropdown_test extends Baselibrary
{
	Testingbaba_dropdown_page ob;
	@BeforeTest
	public void getlaunchurl()
	{
		getlaunch(PropertyUtility.getreadproperty("url"));
		ob= new Testingbaba_dropdown_page();
		
	}

	
	@Test(priority = 0)
	public void getTitles()
	{
		ob.gettitle();
		ob.clicktillselectmenu();
	}
	
	@Test(priority = 1)
	public void dropanddown()
	{
		ob.selectbyvalue();
		ob.getdatafromdropdown();
		ob.multiselect();
	}
	
}
