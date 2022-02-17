package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_shortable_page extends Baselibrary
{
	ArrayList<String> li1=null;
	ArrayList<String> li2=null;
	public Testingbaba_shortable_page()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[text()=\"×\"]")
	private WebElement closbtn_ele;
	@FindBy(xpath="//*[text()=\"Practice\"]")
	private WebElement Practic_ele;
	@FindBy(xpath="//*[@data-target=\"#interations\"]")
	private WebElement interations_ele;
	@FindBy(xpath="//*[@href=\"#tab_25\"]")
	private WebElement shortable_ele;
	@FindBy(xpath="//*[text()=\"Sort\"]")
	private WebElement shortBtn_ele;
	@FindBy(xpath="//table[@id=\"myTable\"]/tbody/tr/td")
	private List<WebElement> shorted_ele;
	

	public void gettitle() 
	{
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	public void till_shortBtn()
	{
		Applicationutility.clickme(closbtn_ele);
		Applicationutility.clickme(Practic_ele);
		Applicationutility.clickme(interations_ele);
		Applicationutility.clickme(shortable_ele);
		
		
		
	}
	
	public void getDataBeforeShort()
	{
		li1 =new ArrayList<String>();
		for(int i=0;i<16;i=i+2)
		{
			String data=shorted_ele.get(i).getText();
			li1.add(data);
			
		}
		Collections.sort(li1);
	}
	
	public void clickonsortBtn()
	{
		Applicationutility.clickme(shortBtn_ele);
	}
	
	

	public void getDataAfterShort()
	{
		li2 =new ArrayList<String>();
		for(int i=0;i<16;i=i+2)
		{
			String data=shorted_ele.get(i).getText();
			li2.add(data);
			
		}	
	}
	
	public void checkveryfy()
	{
		SoftAssert asert=new SoftAssert();
		for(int i=0;i<8;i++)
		{
			String Expecteddata=li1.get(i);
			String Actualdata=li2.get(i);
			asert.assertEquals(Actualdata, Expecteddata);	
		}
		asert.assertAll();
	}
	
}
