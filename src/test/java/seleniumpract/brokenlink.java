package seleniumpract;



import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlink {
	

	
	
	
	
	
	//WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();
			WebDriver   driver = new ChromeDriver();
			 
			 driver.get("https://www.google.co.in/");
		  List<WebElement> links =	 driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
		  
		  
		  for(int i =0;i<links.size();i++)
		  {
			  WebElement els =links.get(i);
			  String url= els.getAttribute("href");
			  System.out.println(url);
			 // verifyactiveurl(url);
			  URL link= new  URL(url);
				
				 HttpURLConnection httpUrlconnect= (HttpURLConnection)link.openConnection();
				 httpUrlconnect.setConnectTimeout(3000);
				 httpUrlconnect.connect();
				 int respocode =httpUrlconnect.getResponseCode();
				 if(respocode>=400)
				 {
					 System.out.println(url+ " - " + "is broken link");
				 }else
				 {
					 System.out.println(url+ " - " + "is valid link");
				 }
				
			  
		  }
		}
				
	}


