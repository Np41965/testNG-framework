package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_Autocomplete_page extends Baselibrary 
{
	public Testingbaba_Autocomplete_page()
	{
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath="//*[@href=\"#tab_17\"]")
	private WebElement autocmpltebtn;
	
	@FindBy(xpath="//*[@name=\"myCountry\"]")
	private WebElement countryslect;
	
	@FindBy(xpath="//*[@src=\"Autocomplete.html\"]")
	private WebElement frame;
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
	
	public void clickautocmpltebtn()
	{
		applicationutility.Applicationutility.clickme(autocmpltebtn);
	}
	
	public void clickcountryslect() throws Exception
	{
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		countryslect.click();
		applicationutility.Applicationutility.sendKey(countryslect, "india");
		Thread.sleep(2000);
		countryslect.sendKeys(Keys.ARROW_DOWN);
		countryslect.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		}
	

}
