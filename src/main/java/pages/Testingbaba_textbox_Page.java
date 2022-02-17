package pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;
import propertyutility.PropertyUtility;

public class Testingbaba_textbox_Page extends Baselibrary 
{
	ArrayList<String> li=null;
	public Testingbaba_textbox_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement precticeform;
	
	@FindBy(xpath=" //*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	
	@FindBy(xpath="//*[text()=\"text box\"]")
	private WebElement TextBox;
	
	@FindBy(xpath="//*[@id=\"fullname1\"]")
	private WebElement fullname;
	
	@FindBy(xpath="//*[@id=\"fullemail1\"]")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"fulladdresh1\"]")
	private WebElement caddress;
	
	@FindBy(xpath="//*[@id=\"paddresh1\"]")
	private WebElement paddress;
	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	private WebElement Submit;
	
	@FindBy(xpath="//*[@id=\"tab_1\"]/div/div[2]/label")
	
	private List<WebElement> textboxdataList;
	
	
	public void gettitle() throws Exception
	{
	    String title =driver.getTitle();
		System.out.println(title);
	}
	public void clickonclosebtn()
	{
		closebtn.click();
		
	}

	public void clickonElements()throws Exception
	{
		Thread.sleep(2000);
		precticeform.click();
		Elements.click();
	}
	
	
	
	public void fillTextBox() throws Exception
	{
		TextBox.click();
		String Name =PropertyUtility.getreadproperty("name");
		String Emails =PropertyUtility.getreadproperty("Email");
		String  CAddress=PropertyUtility.getreadproperty("currentaddress");
		String PAddress =PropertyUtility.getreadproperty("parmanentaddress");
		
		li=new ArrayList<String>();
		li.add(Name);
		li.add(Emails);
		li.add(CAddress);
		li.add(PAddress);
		
		fullname.sendKeys(Name);
		email.sendKeys(Emails);
		caddress.sendKeys(CAddress);
		paddress.sendKeys(PAddress);
		Submit.click();
		
		System.out.println("Ending......");
	}
	
	
	public void getverify_textboxdata()
	{
		SoftAssert softassert= new SoftAssert();
		for(int i=1;i<8;i=i+2)
		{
			for(String dd:li)
			{
				String actualdata=textboxdataList.get(i).getText();
				
				/*Assert
				Assert.assertEquals(actualdata, dd);
				*/
				
				softassert.assertEquals(actualdata, dd);
				li.remove(dd);
				break;
			}
			
			
		}
		softassert.assertAll();
	}
	

}
