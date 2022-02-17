package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_upload_download_page extends Baselibrary
{
	public Testingbaba_upload_download_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static String fillocation="C:\\Users\\Naresh\\eclipse-workspace\\19octnewtestNG\\testdata\\passNarendra.jpg";
	
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
	
	public void clickonelementbtn()
	{
		applicationutility.Applicationutility.clickme(element);
	}
	
	public void clickonupload_downloadbtn()
	{
		applicationutility.Applicationutility.clickme(upload_downloadbtn);
	}
	
	public void clickonuploadbtn()
	{
	
		applicationutility.Applicationutility.clickme(uploadbtn);
		
	}
	
	public void filupload() throws Exception
	{
		Thread.sleep(3000);
		applicationutility.Applicationutility.fileuploding(fillocation);
	}
}
