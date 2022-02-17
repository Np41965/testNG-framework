package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_Tool_Tips_page extends Baselibrary
{
	public Testingbaba_Tool_Tips_page()
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
	
	@FindBy(xpath="//*[@href=\"#tab_22\"]")
	private WebElement tooltipsbtn;
	
	@FindBy(xpath="//*[@title=\"you hovered over the button\"]")
	private WebElement hoverBtn;
	
	
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
	
	public void tooltipsBtn()
	{
		applicationutility.Applicationutility.clickme(tooltipsbtn);
	}

	public void hoveron() 
	{
		applicationutility.Applicationutility.mouseHover(hoverBtn);
		String title= hoverBtn.getAttribute("title");
		System.out.println(title);
		
	}

}
