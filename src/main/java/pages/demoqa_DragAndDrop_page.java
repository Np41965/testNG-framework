package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class demoqa_DragAndDrop_page extends Baselibrary
{
	public demoqa_DragAndDrop_page()
	{
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[5]")
	private WebElement interationsbtn;

	@FindBy(xpath="//span[text()=\"Droppable\"]")
	private WebElement dropbalebtn;
	
	@FindBy(id="draggable")
	private WebElement draggabeTo;
	
	@FindBy(xpath="//*[@id=\"simpleDropContainer\"]/div[2]")
	private WebElement drppableFrom;
	
	
	public void interactionbtn()
	{
		Applicationutility.clickme(interationsbtn);
		Applicationutility.getscroll(dropbalebtn);
		Applicationutility.clickme(dropbalebtn);
	}
	
	public void draganddrop()
	{
		Applicationutility.dragandDrop(draggabeTo, drppableFrom);
	}
}
