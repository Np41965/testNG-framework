package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;
import propertyutility.PropertyUtility;

public class Testingbaba_Buttons_page extends Baselibrary
{
	List<String> li=null;
	public Testingbaba_Buttons_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement precticeform;
	
	@FindBy(xpath=" //*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	
	@FindBy(xpath = "//*[@id=\"v-pills-tab\"]/a[5][text()=\"buttons\"]")
	private WebElement buttons;
	
	@FindBy(xpath = "//*[@id=\"tab_5\"]/div[1]/button")
	private WebElement doubleclick;
	
	@FindBy(xpath="//*[@id=\"noContextMenu\"]")
	private WebElement rightclick;
	
	@FindBy(xpath = "//*[@id=\"tab_5\"]/div[3]/button")
	private WebElement onlyclick;
	
	@FindBy(xpath ="//*[@id=\"tab_5\"]/div[4]/p")
	private List<WebElement> afterClickbtn;
	
	
	public void gettitle() throws Exception
	{
	    String title =driver.getTitle();
		System.out.println(title);
	}

	public void clickonclosebtn()
	{
		closebtn.click();
		
	}

	public void clickonElements() throws Exception
	{
		precticeform.click();
		Thread.sleep(2000);
		Elements.click();
	}
	
	public void clickonButtons()
	{
		buttons.click();
		
	}
	public void doubleclick()
	{
		Applicationutility.dubleclick(doubleclick);
		
	}
	public void rightclicks()
	{
		Applicationutility.rightclick(rightclick);
		onlyclick.click();
		
		
	}
	public void verify() 
	{
		li = new ArrayList<String>();
		li.add(PropertyUtility.getreadproperty("double_click"));
		li.add(PropertyUtility.getreadproperty("right_click"));
		li.add(PropertyUtility.getreadproperty("dynamic_click"));
		SoftAssert softassert= new SoftAssert();
		for(WebElement dd:afterClickbtn)
		{
			for (String dd1:li)
			{
				softassert.assertEquals(dd.getText(), dd1);
				li.remove(0);
				break;
			}
			
		}
		softassert.assertAll();
	}
}
