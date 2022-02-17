package pages;

import java.util.StringTokenizer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_datepiker_page extends Baselibrary
{

	public Testingbaba_datepiker_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=\"×\"]")
	private WebElement closbtn;
	
	@FindBy(xpath="//*[text()=\"Practice\"]")
	private WebElement practicebtn;
	
	
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	private WebElement widget;
	
	@FindBy(xpath="//*[@href=\"#tab_18\"]")
	private WebElement datepiker;
	
	@FindBy(xpath="//div[@class=\"col-md-9 col-sm-12 form-inline\"]/input[@type=\"date\"] ")
	private WebElement selectdatebox;
	
	@FindBy(xpath="//*[@type=\"datetime-local\"]")
	private WebElement datetimepiker;
	
	
	
	
	
	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	
	public void clicktilldatepiker() throws Exception
	{
		Applicationutility.clickme(closbtn);
		Applicationutility.clickme(practicebtn);
		Thread.sleep(2000);
		Applicationutility.clickme(widget);
		Thread.sleep(2000);
		Applicationutility.clickme(datepiker);
		
		
	}
	
	public void dateselect() throws Exception
	{
		Applicationutility.clickme(selectdatebox);
	
	
		selectdatebox.sendKeys(Keys.ARROW_LEFT);
		selectdatebox.sendKeys(Keys.ARROW_LEFT);
		selectdatebox.sendKeys("02-02-2023");
		
	}
	
	public void date_time_fill() throws InterruptedException 
	{
		Applicationutility.clickme(datetimepiker);
		
		datetimepiker.sendKeys(Keys.ARROW_LEFT);
		
		datetimepiker.sendKeys(Keys.ARROW_LEFT);
		
		datetimepiker.sendKeys(Keys.ARROW_LEFT);
		
		datetimepiker.sendKeys(Keys.ARROW_LEFT);
		
		String datetime=Applicationutility.getdateTime();
		//Using StringTokenIzer 
		
		StringTokenizer tk = new StringTokenizer(datetime);
		String date = tk.nextToken();  
		String time = tk.nextToken();
		String Am_Pm = tk.nextToken();
		//print just for check
		System.out.println(date);
		System.out.println(time);
		System.out.println(Am_Pm);
		//filling the data
		datetimepiker.sendKeys(date);
		Thread.sleep(2000);
		datetimepiker.sendKeys(Keys.RIGHT);
		datetimepiker.sendKeys(time);
		Thread.sleep(2000);
		datetimepiker.sendKeys(Keys.RIGHT);
		datetimepiker.sendKeys(Am_Pm);
		
		String datatimepm=datetimepiker.getAttribute(datetime);
		System.out.println(datatimepm);
	}
	
	
	
}
