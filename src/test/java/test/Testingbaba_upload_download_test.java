package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Testingbaba_upload_download_page;
import propertyutility.PropertyUtility;

public class Testingbaba_upload_download_test extends Baselibrary
{
	Testingbaba_upload_download_page ob;
	
	@BeforeTest
	public void launchurl()
	{
		
		String url=PropertyUtility.getreadproperty("url");
		getlaunch(url);
		ob=new Testingbaba_upload_download_page();
		
				
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
	
	@Test (priority = 2)
	public void clickelement()
	{
		ob.clickonelementbtn();
	}
	
	@Test(priority = 3)
	public void clickonuploadDownloadbtn()
	{
		ob.clickonupload_downloadbtn();
	}
	
	@Test (priority = 4)
	public void clickuploadbtn()
	{
		ob.clickonuploadbtn();
	}
	@Test(priority = 5)
	public void filUpload() throws Exception
	{
		ob.filupload();
	}

}
