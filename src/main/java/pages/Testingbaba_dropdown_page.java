package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Testingbaba_dropdown_page extends Baselibrary
{

	public Testingbaba_dropdown_page()
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[text()=\"×\"]")
	private WebElement closebtn;
	
	@FindBy(xpath="//*[text()=\"Practice\"]")
	private WebElement precticebtn;
	
	@FindBy(xpath="//*[@data-target=\"#widget\"]")
	private WebElement widgets;

	@FindBy(xpath="//*[text()='select menu']")
	private WebElement selectmenu;
	
	@FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement selectvalue;
	
	@FindBy(xpath="//*[@id=\"tab_24\"]/form/div/div[5]/div/select")
	private WebElement multiselect;
	
	
	public void gettitle()
	{
		String Title=driver.getTitle();
		System.out.println("Title:"+Title);
	}
	
	public void clicktillselectmenu()
	{
		applicationutility.Applicationutility.clickme(closebtn);
		applicationutility.Applicationutility.clickme(precticebtn);
		Applicationutility.clickme(widgets);
		Applicationutility.clickme(selectmenu);
	}
	
	
	
	public void selectbyvalue()
	{
		Applicationutility.selctbyvisibletext(selectvalue, "Group 1, Option 2");
	}
	
	public void getdatafromdropdown()
	{
		Select sel= new Select(selectvalue);
		List<WebElement> list = sel.getOptions();
		System.out.println(list.get(0).getText());
		System.out.println(list.get(1).getText());
		System.out.println(list.get(3).getText());
			
	}

	public void multiselect()
	{
		try {

			Robot robot= new Robot();
			multiselect.click();
			Select sel= new Select(multiselect);
			List<WebElement> dd = sel.getOptions();
			System.out.println();
			robot.keyPress(KeyEvent.VK_CONTROL);
			dd.get(1).click();
			dd.get(0).click();
			
			dd.get(2).click();
			robot.keyRelease(KeyEvent.VK_CONTROL);
		
		} catch (Exception e)
		{
	
	System.out.println("issue in Getmultidropdown "+e);
		}
		
		
		
	}


}
	
	

