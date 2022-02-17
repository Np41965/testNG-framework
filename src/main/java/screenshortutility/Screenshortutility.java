package screenshortutility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baselibrary.Baselibrary;

public class Screenshortutility extends Baselibrary
{
	public static void getscreenshot(String foldername, String filename)
	{
		
		String location=System.getProperty("user.dir");
		try 
		{
			String path=location+"\\Screenshorts\\"+foldername+"\\"+filename+".jpeg";
			EventFiringWebDriver efw= new EventFiringWebDriver(driver);
			File src=efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File(path));
				
		} 
		catch (Exception e) 
		{
			System.out.println("issue of getscreenshot"+e);
		}
	
		
	}
}


