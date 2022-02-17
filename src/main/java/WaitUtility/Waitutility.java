package WaitUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class Waitutility extends Baselibrary
{
	static WebDriverWait wait=null;
	public static void alertispresent(int time)
	{
		wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static void visblityofelement(int time, WebElement ele) 
	{
		wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void alert_ispresent(int time)
	{
		wait= new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	//FluentWait:
	public static void fluentwait(WebElement ele)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(10, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(ele));
	
	
	}
	

}

