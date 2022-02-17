package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_Frame_Page;
import propertyutility.PropertyUtility;

public class Testingbaba_Frame_test extends Baselibrary
{
	Testingbaba_Frame_Page ob;
	@BeforeTest
	
	public void launchUrl()
	{
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob = new Testingbaba_Frame_Page();
		
	}
	@Test(priority = 0)
	public void getTitle()
	{
		ob.gettitle();
	}

	@Test(priority =1 )
	
	public void tillPrectice()
	{
		ob.tillprectice();
	}
	
	@Test(priority = 2)
	public void alertand_frame()
	{
		ob.alertandframe();
	}
	
	@Test(priority = 3)
	public void framebtn()
	{
		ob.frameBtn();
	}
	
	@Test(priority = 4)
	public void frameHandle()
	{
		ob.frame1handle();
	}
	
	@Test(priority=5)
	public void frame2_handle()
	{
		ob.frame2handle();
	}
	
	@Test(priority = 6)
	public void clickonnestedframes()
	{
		ob.nested_frames();
	}
	
	@Test(priority = 7)
	public void handle_nestedframe()
{
	ob.handlenestedframe();
}

}
