package pages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetBrokenLinks
{
	
	private static WebDriver driver = null;

    
    public static void getResponseCode(String urlString) 
	{ 
		 
		try 
		{ 
			URL curl = new URL(urlString); 
			HttpURLConnection huc = (HttpURLConnection) curl.openConnection(); 	
			huc.setRequestMethod("GET"); 
			huc.connect(); 
			int response = huc.getResponseCode();
	 
			 if(response >= 400)
			 {
                 System.out.println(urlString+" is a broken link");
             }
             else
             { 
                 System.out.println(urlString+" is a valid link");
             }
		} 
		catch (Exception e) 
		{ 
			System.out.println(urlString+" Issue in getresponsecode");
		}
		
	} 
	
    public static void main(String[] args)
    {
            
        String homePage = "http://testingbaba.com/";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            getResponseCode(url);
            if(url == null || url.isEmpty())
            {
            //	System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(homePage))
            {
               //.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try 
            {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400)
                {
                    System.out.println(url+" is a broken link");
                }
                else
                {
                    System.out.println(url+" is a valid link");
                }
            }
            catch (IOException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
     

    }

}
