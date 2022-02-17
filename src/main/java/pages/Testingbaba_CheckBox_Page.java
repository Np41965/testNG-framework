package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.Baselibrary;

public class Testingbaba_CheckBox_Page extends Baselibrary
{
	public Testingbaba_CheckBox_Page()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
	private WebElement precticeform;
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[2][@href=\"#tab_2\"]")
	private WebElement CheckBox;
	
	@FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
	private WebElement frameEle;
	
	@FindBy(xpath="//*[text()=\"Mobile:\"]")
	private WebElement mobileCheck;
	
	@FindBy(xpath="//*[@id=\"mylaptop\"]")
	private WebElement laptopCheck;
	
	@FindBy(xpath="//*[@id=\"mydesktop\"]")
	private WebElement desktopCheck;
	

	@FindBy(xpath="//*[@id=\"text\"]")
	private WebElement mobiletext;
	

	@FindBy(xpath="//*[@id=\"text1\"]")
	private WebElement leptoptext;
	

	@FindBy(xpath="//*[@id=\"text2\"]")
	private WebElement desktoptext;
	
	

	public void tillElement()
	{
		
		closebtn.click();
		precticeform.click();
		Elements.click();
		
	}
	public void checkbox() throws Exception 
	{
		Thread.sleep(2000);
		CheckBox.click();
		
			
		
	}
	public void checkedbox() throws Exception
	{
	
		driver.switchTo().frame(frameEle);
		Thread.sleep(2000);
		mobileCheck.click();
		Thread.sleep(1000);
		laptopCheck.click();
		Thread.sleep(1000);
		desktopCheck.click();
		
		driver.switchTo().defaultContent();
			
		
	}
	
	public void checkedboxtextread() throws Exception
	{
	
		driver.switchTo().frame(frameEle);
		
		System.out.println(mobiletext.getText());
		System.out.println(leptoptext.getText());
		System.out.println(desktoptext.getText());
		
		driver.switchTo().defaultContent();
			
		
	}
	
	

}
