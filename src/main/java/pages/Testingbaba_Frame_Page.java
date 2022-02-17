package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;
import screenshortutility.Screenshortutility;

public class Testingbaba_Frame_Page extends Baselibrary
{
	public Testingbaba_Frame_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class=\"close\"][text()=\"×\"]")
	private WebElement closebtn;
	
	@FindBy(xpath="//*[text()=\"Practice\"]")
	private WebElement Practice;
	
	@FindBy(xpath="//*[@data-target=\"#alerts\"]")
	private WebElement alerts_frame; 
	
	@FindBy(xpath="//*[text()=\"frames\"]")
	private WebElement framebtn;
	
	@FindBy(xpath="//*[@style=\"height:200px;width:400px\"]")
	private WebElement frame1;
	
	@FindBy(xpath="//*[@style=\"height:80px;width:120px\"]")
	private WebElement frame2;
	
	@FindBy(xpath="/html/body/h1")
	private WebElement insideframe;
	
	@FindBy(xpath="//*[text()=\"nested frames\"]")
	private WebElement nestedframes;
	
	@FindBy(xpath="//*[@id=\"frame2\"]/iframe")
	private WebElement childframe;
	
	@FindBy(xpath="//*[text()=\"Parent frame \"]")
	private WebElement ParentFrame;
	
	public void gettitle()
	{
		
		String title= driver.getTitle();
		System.out.println("Title: "+ title);
		Screenshortutility.getscreenshot("passed", "gettitle");
	}
	
	public void tillprectice()
	{
		Applicationutility.clickme(closebtn);
		Applicationutility.clickme(Practice);
		
	}
	
	public void alertandframe()
	{
		Applicationutility.clickme(alerts_frame);
	}
	
	public void frameBtn() 
	{
		Applicationutility.clickme(framebtn);
	}
	
	public void frame1handle()
	{
		driver.switchTo().frame(frame1);
		String data1 = insideframe.getText();
		System.out.println(data1);
		driver.switchTo().defaultContent();
		
	}
	
	public void frame2handle()
	{
	   driver.switchTo().frame(frame2);
	   String data2=insideframe.getText();
	   System.out.println(data2);
	   driver.switchTo().defaultContent();
	}
	
	public void nested_frames() 
	{
		Applicationutility.clickme(nestedframes);	
	}
	
	public void handlenestedframe()
	{
		driver.switchTo().frame(childframe);
		//String data3=childframe.getText();
		//System.out.println(data3);
		//driver.switchTo().parentFrame();
		//String data4=ParentFrame.getText();
		//System.out.println(data4);
	}
	
	
	

}
