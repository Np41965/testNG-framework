package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_launch_Page extends Baselibrary
{
	public Testingbaba_launch_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\\\"myModal2\\\"]/div/div/div[1]/button")
	private WebElement precticeform;
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	
	public void gettitle() throws Exception
	{
	    String title =driver.getTitle();
		System.out.println(title);
	}
	public void clickonclosebtn()
	{
		closebtn.click();
		precticeform.click();
		
	}

	
	
}
