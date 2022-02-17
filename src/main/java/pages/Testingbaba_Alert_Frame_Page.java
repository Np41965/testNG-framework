package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaitUtility.Waitutility;
import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_Alert_Frame_Page extends Baselibrary 
{
	public Testingbaba_Alert_Frame_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=" //*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath=" //*[text()=\"Practice\"]")
	private WebElement  Practice;
		
	@FindBy(xpath="//*[@data-target=\"#alerts\"]")
	private WebElement alertswindow;
	
	@FindBy(xpath="//*[@href=\"#tab_12\"]")
	private WebElement alert;
	
	@FindBy(xpath="//*[@onclick=\"myalert()\"]")
	private WebElement Clickme;
	
	@FindBy(xpath="//*[@onclick=\"aftersec5()\"]")
	private WebElement Clickme1;
	
	@FindBy(xpath = "//*[@onclick=\"myconfirm()\"]")
	private WebElement Clickme2;
	
	@FindBy(xpath="//*[@onclick=\"myprompt()\"]")
	private WebElement Clickme3;
	
	
	
	public void tillAlert() 
	{
		Applicationutility.clickme(closebtn);
		Applicationutility.clickme(Practice);
		Applicationutility.clickme(alertswindow);
		Applicationutility.clickme(alert);
		
	}
	
	public void click_me()
	{
		Applicationutility.clickme(Clickme);
		driver.switchTo().alert().accept();
	}

	public void click_me1()
	{
		Applicationutility.clickme(Clickme1);
		Waitutility.alert_ispresent(5);
		driver.switchTo().alert().accept();
	}

	public void click_me2()
	{
		Applicationutility.clickme(Clickme2);
		Waitutility.alert_ispresent(5);
		driver.switchTo().alert().dismiss();
	}
	public void click_me3()
	{
		Applicationutility.clickme(Clickme3);
		Waitutility.alert_ispresent(5);
		driver.switchTo().alert().sendKeys("Narendra");
		driver.switchTo().alert().accept();
	}
	
}
