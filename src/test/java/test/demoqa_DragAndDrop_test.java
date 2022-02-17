package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.demoqa_DragAndDrop_page;
import propertyutility.PropertyUtility;

public class demoqa_DragAndDrop_test extends Baselibrary
{
	demoqa_DragAndDrop_page ob;
	@BeforeTest
	public void launchurl()
	{
		getlaunch(PropertyUtility.getreadproperty("url1"));
		ob= new demoqa_DragAndDrop_page();
	}
	
	@Test(priority = 0)
	public void Title()
	{
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 1)
	public void Tilldragbalbtn()
	{
		ob.interactionbtn();
	}
	
	@Test(priority = 2)
	public void dragAndDrop()
	{
		ob.draganddrop();
	}
	
	

}
