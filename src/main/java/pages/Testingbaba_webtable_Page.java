package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;
import excelutility.ExcelUtility;


public class Testingbaba_webtable_Page extends Baselibrary
{ 
	ArrayList<String> li1=null;
	ArrayList<String> li2=null;
	
	public Testingbaba_webtable_Page()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement precticeform;
	
	@FindBy(xpath=" //*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement Elements;
	
	@FindBy(xpath="//*[text()=\"web tables\"][@onclick=\"changeText(this)\"]")
	private WebElement webtable;
	

	@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
	private WebElement Frame;
	

	@FindBy(xpath="/html/body/div/form/div[1]/input")
	private WebElement name;
	

	@FindBy(xpath="/html/body/div/form/div[2]/input")
	private WebElement email;
	
	@FindBy(xpath="/html/body/div/form/button")
	private WebElement save;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td")
	private List<WebElement> webtableList;
	
	
	
	
	
	
	
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

	public void clickonElements() throws Exception
	{
		Thread.sleep(2000);
		
		Elements.click();
	}
	
	public void webTable() throws Exception
	{
		li1=new ArrayList<String>();
		li2=new ArrayList<String>();
		Thread.sleep(2000);
		 webtable.click();
		 Thread.sleep(1000);
		 driver.switchTo().frame(Frame);
		 for (int i=1;i<=5;i++) 
		 {
			 Thread.sleep(1000);
			 String Name =ExcelUtility.getreaddata(i,0);
			 Thread.sleep(1000);
			 li1.add(Name);
			 String Emails =ExcelUtility.getreaddata(i,1);
			 li2.add(Emails);
			 Thread.sleep(1000);
			 name.sendKeys(Name);
			 email.sendKeys(Emails);
			 Thread.sleep(1000);
			 save.click();
			 Thread.sleep(1000);
		 
		 }
		
	}
	
	public void verifywebtable() throws Exception
	{
		Thread.sleep(1000);
		SoftAssert softassert= new SoftAssert();
		for(int i=0;i<webtableList.size();i=i+3)
		{
			for(String dd:li1)
			{
				String actualdata=webtableList.get(i).getText();
				softassert.assertEquals(actualdata, dd);
				System.out.println(dd);
				li1.remove(dd);
				System.out.println(actualdata);
				break;
			}
			
			
		}
		for(int i=1;i<=webtableList.size();i=i+3)
		{
			for(String dd:li2)
			{
				String actualdata=webtableList.get(i).getText();
				softassert.assertEquals(actualdata, dd);
				System.out.println(dd);
				li2.remove(dd);
				System.out.println(actualdata);
				break;
			}	
		}
		softassert.assertAll();
	}

	
	

}
