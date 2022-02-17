package baselibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import screenshortutility.Screenshortutility;

public class Baselibrary
{
	public static WebDriver driver;
	public static void getlaunch(String url)
	{
		String location=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", location+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*
		System.setProperty("webdriver.geckodriver.driver","C:\\Users\\Naresh\\eclipse-workspace\\NewTestingBaba\\Driver\\geckodriver.exe"); 
		driver= new FirefoxDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		*/
    
	}
	
	



	


	
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterMethod
	public void getresultanalyses(ITestResult result)
	{
		String methodname=result.getMethod().getMethodName();
		if(result.isSuccess())
		{
			Screenshortutility.getscreenshot("passed", methodname);
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			Screenshortutility.getscreenshot("failed", methodname);
		}
		else
		{
			Screenshortutility.getscreenshot("skip", methodname);
			
		}
	}
	
}



