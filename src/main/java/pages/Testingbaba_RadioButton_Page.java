package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Testingbaba_RadioButton_Page extends Baselibrary
{
	public Testingbaba_RadioButton_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath = "//*[@id=\\\"myModal2\\\"]/div/div/div[1]/button")
	private WebElement precticeform;
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[3][text()=\"radio buttons\"]")
	private WebElement radiobutton;
	

	@FindBy(xpath="//*[@id=\"yes\"]")
	private WebElement clickyes;

	@FindBy(xpath="//*[@id=\"impressive\"]")
	private WebElement clickimpressive;

	@FindBy(xpath="//*[@id=\"no\"]")
	private WebElement clickno;
	
	@FindBy(xpath="//*[@id=\"radio-content\"]")
	private WebElement radiocontent;
	
	

	
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

	public void clickonElements()
	{
		
		Elements.click();
	}

	
	public void RadioButtonclick() throws Exception 
	{
		Thread.sleep(2000);
		radiobutton.click();
		
	}

	public void clickonradiobtns() throws Exception
	{
		Thread.sleep(1000);
		clickyes.click();
		System.out.println(radiocontent.getText());
		Thread.sleep(1000);
		clickimpressive.click();
		System.out.println(radiocontent.getText());
		Thread.sleep(1000);
		clickno.click();
		System.out.println(radiocontent.getText());
	}
	
}
