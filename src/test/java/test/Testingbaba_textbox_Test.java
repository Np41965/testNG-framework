package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_textbox_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_textbox_Test extends Baselibrary
{
	Testingbaba_textbox_Page ob;
	@BeforeTest
	public void launchTestingbaba()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob= new Testingbaba_textbox_Page();
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
		Thread.sleep(1000);
		ob.clickonElements();
	}
	
	@Test(priority=2)
	public void fillTextBox() throws Exception 
	{
		ob.fillTextBox();
	}
	@Test(priority=3)
	public void getverify() 
	{
		ob.getverify_textboxdata();
	}

}
