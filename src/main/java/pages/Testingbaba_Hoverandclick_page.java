package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_Hoverandclick_page extends Baselibrary
{
	public Testingbaba_Hoverandclick_page()
	{ 
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[text()=\"×\"]")
	private WebElement closebtn;
	
	@FindBy(xpath="//*[text()=\"Practice\"]")
	private WebElement precticebtn;
	
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//*[@href=\"#tab_8\"]")
	private WebElement upload_downloadbtn ;
	
	@FindBy(xpath="//*[text()=\"Select a file\"]")
	private WebElement uploadbtn;
	
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	private WebElement widgetbtn;
	
	@FindBy(xpath="//*[@href=\"#tab_23\"]")
	private WebElement menubtn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/div[24]/nav/ul/li[3]")
	private WebElement servicehover;
	
	
	String linkText ="Mobile Development";
	private String WebDevelopmentlinkText=linkText;

	public void gettitle()
	{
		String Title=driver.getTitle();
		System.out.println("Title:"+Title);
	}
	
	public void clickonclosebtn()
	{
		applicationutility.Applicationutility.clickme(closebtn);
	}
	
	public void clickonprecticebtn()
	{
		applicationutility.Applicationutility.clickme(precticebtn);
	}
	
	public void clickwidgetbtn ()
	{
		applicationutility.Applicationutility.clickme(widgetbtn);
	}
	
	public void clickonmenu()
	{
		applicationutility.Applicationutility.clickme(menubtn);
		
	}
	
	public void hoverandclickwebDev()
	{
		applicationutility.Applicationutility.mouseHoverandclick(servicehover, WebDevelopmentlinkText);
	}
	

}
