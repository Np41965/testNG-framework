package applicationutility;

import java.util.ArrayList;
import java.util.Set;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.Baselibrary;

public class Applicationutility extends Baselibrary 
{
	//Action class methods:
	//DubleClick
	public static void dubleclick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	//RightClick
	public static void rightclick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	
	
	//MouseHover And Click:
	
	public static void mouseHoverandclick(WebElement ele, String linktext)
	{
		try
		{
			Actions act= new Actions(driver);
			act.moveToElement(ele).build().perform();
			driver.findElement(By.linkText(linktext)).click();
		} 
		catch (Exception e) 
		{
			System.out.println("Issue of mousehovermethods"+e);
		}
	}

	
//MouseHover:
	
		public static void mouseHover(WebElement ele)
		{
			try
			{
				Actions act= new Actions(driver);
				act.moveToElement(ele).perform();
			} 
			catch (Exception e) 
			{
				System.out.println("Issue of mousehovermethods"+e);
			}
		}
//Resizable:
		
		public static void Rezizable(WebElement ele,int Xoffset,int Yoffset)
		{
			
			try{
				Actions act= new Actions(driver);
				Thread.sleep(2000);
				act.dragAndDropBy(ele, Xoffset, Yoffset).perform();
			 }
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
//draganddrop......
		public static void dragandDrop(WebElement TO,WebElement FROM)
		{
			Actions act= new Actions(driver);
			act.dragAndDrop(TO, FROM).perform();
		}
		
		
//Ussing Select Class..........
//DropDown:		
		
		public static void selctbyvisibletext(WebElement ele,String value)
		{
			Select sel= new Select(ele);
			sel.selectByVisibleText(value);
			
		}
	//ChangeWindow
	public static void changeWindow(int tapno)
	{
		Set <String> set= driver.getWindowHandles();
		ArrayList<String> taps=new ArrayList<>(set);
		driver.switchTo().window(taps.get(tapno));
		
	}
	
	//Scrollimg
		public static void getscroll(WebElement ele)
		{
			try 
			{
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
			} catch (Exception e) 
			{
				System.out.println("Issue in Getscroll "+e);
			}
		}
		

		public void Scroll_Page_To_Bottom() 
		{
			try {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			} catch (Exception ex) {
				System.out.println("Exception scroll.");
			}
		}
		
		//fileuploding
	public static void fileuploding(String fileloc)
	{
		try 
		{
			StringSelection sl=new StringSelection(fileloc);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sl, null);
			Robot robot =new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(150);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			
		} catch (Exception e) 
		{
			System.out.println("Issue in File uploading "+e);
		}
	}
	
	
	
	//Ele.click()
	public static void clickme(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	
	//Sendkeys
		public static void sendKey(WebElement ele,String data)
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(data);
		}
	
	//DateTime
	public static String getdateTime() 
	{
		String datetime = null;
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");  
			LocalDateTime now =LocalDateTime.now();  
			datetime = dtf.format(now);
		 }
		catch (Exception e)
		{
			System.out.println("Issue in Getdatetime" + e);
		}
		return datetime;
	}
	
	
	public static void tillprecticebtn()
	{
		driver.findElement(By.xpath("//*[text()=\"×\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Practice\"]")).click();
		
	}
	

	
	
}
