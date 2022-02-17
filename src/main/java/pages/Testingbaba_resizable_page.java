package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_resizable_page extends Baselibrary
{
	public Testingbaba_resizable_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-target=\"#interations\"]")
	private WebElement interationsbtn;

	
	@FindBy(xpath="//*[@href=\"#tab_27\"]")
	private WebElement resizablebtn;
	
	@FindBy(xpath="//*[@class=\"resize-box\"]")
	private WebElement resizableEle;
	
	
	
	
	public void gettitle()
	{
	System.out.println(	"Title: "+driver.getTitle());
		
	}

	public void clicktillresizablebtn()
	{
		Applicationutility.clickme(interationsbtn);
		Applicationutility.clickme(resizablebtn);
	}

	public void resizing()
	{
		Applicationutility.clickme(resizableEle);
		Applicationutility.Rezizable(resizableEle, 500, 300);
	}
}
