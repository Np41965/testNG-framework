package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_CheckBox_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_CheckBox_Test  extends Baselibrary

{
	Testingbaba_CheckBox_Page ob;
	@BeforeTest
	public void lounchTestingBaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_CheckBox_Page();
		
	}
	
	
	@Test
	public void tillElements()
	{
		ob.tillElement();
	}
	@Test(priority=1)
	public void onclickcheckbox() throws Exception 
	{
		ob.checkbox();
	}
	@Test(priority=2)
	public void clickoncheckbox() throws Exception
	{
		ob.checkedbox();
		
	}
	
	@Test(priority=3)
	public void readcheckedtext() throws Exception
	{
		
		ob.checkedboxtextread();
		Thread.sleep(1000);
		ob.checkedbox();
	}
	
}
