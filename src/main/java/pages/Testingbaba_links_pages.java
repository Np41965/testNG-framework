package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByLinkText;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;
import excelutility.ExcelUtility;

public class Testingbaba_links_pages extends Baselibrary
{
	public Testingbaba_links_pages()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=" //*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	
	@FindBy(xpath=" //*[text()=\"Practice\"]")
	private WebElement  Practice;
	
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement elements;
	
	@FindBy(xpath="//*[@href=\"#tab_6\"]")
	private WebElement links ;
	
	@FindBy(xpath="//*[text()=\"Demo Page\"]")
	private WebElement Demo_Page;
	
	@FindBy(xpath="//*[@data-target=\"#alerts\"]")
	private WebElement alerts;
	
	@FindBy(xpath="//*[@href=\"#tab_11\"]")
	private WebElement browserWindow;
	
	@FindBy(xpath="//*[@class=\"btn btn-primary\"][@target=\"_blank\"]")
	private WebElement newtab;
	
	@FindBy(xpath="//*[@class=\"gLFyf gsfi\"]")
	private WebElement googlesearch;
	
	@FindBy(xpath="//*[@class=\"TbwUpd NJjxre\"]/cite[@class=\"iUh30 tjvcx\"]")
	private WebElement filpkartlink;
	
	@FindBy(xpath="//*[text()=\"Login\"]")
	private WebElement getTextForverfy;
	
	@FindBy(xpath="//*[@class=\"IiD88i _351hSN\"]/input[@type=\"text\"]")
	private WebElement Inputusername;
	
	@FindBy(xpath="//*[@class=\"IiD88i _351hSN\"]/input[@type=\"password\"]")
	private WebElement Inputpass;
	
	@FindBy(xpath="//button/span[text()=\"Login\"]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[text()=\"Narendra\"]")
	private WebElement verfication2;
	
	public void gettitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	    	
	}
		public void clickele()
	{
		Applicationutility.clickme(closebtn);
		Applicationutility.clickme(Practice);
		Applicationutility.clickme(elements);
		Applicationutility.clickme(links);
		
		
	}

		public void demopage() throws Exception
		{
			 Applicationutility.clickme(Demo_Page);
			 Applicationutility.changeWindow(1);
			 Applicationutility.clickme(closebtn);
			 Applicationutility.clickme(Practice);
			 Applicationutility.clickme(alerts);
			 Applicationutility.clickme(browserWindow);
			 Applicationutility.clickme(newtab);
		}
		
		public void windowhandle()
		{
			Applicationutility.changeWindow(2);
			 Applicationutility.sendKey(googlesearch, "flipkart");
			 googlesearch.sendKeys(Keys.ARROW_DOWN);
			 googlesearch.sendKeys(Keys.ENTER);
			 Applicationutility.clickme(filpkartlink);
			 	
		}
		
		public void loginflipcart()
		{
			String username=ExcelUtility.getreaddata(1, 3);
			String pass=ExcelUtility.getreaddata(1, 4);
			Applicationutility.sendKey(Inputusername,username );
			Applicationutility.sendKey(Inputpass, pass);
			Applicationutility.clickme(loginbtn);
		}
		
		
		
		public void getverify()
		{
			SoftAssert asert = new SoftAssert();
			String Actualdata1= getTextForverfy.getText();
			String ExpectedData1="Login";
			asert.assertEquals(Actualdata1, ExpectedData1);
			asert.assertAll();
		}
		
		public void getverify2()
		{
			SoftAssert asert = new SoftAssert();
			String Actualdata2= verfication2.getText();
			String ExpectedData2="Narendra";
			asert.assertEquals(Actualdata2, ExpectedData2);
			asert.assertAll();
			//Applicationutility.mouseHoverandclick(verfication2,"Logout");
		}


}
