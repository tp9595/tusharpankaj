package listnerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listnerpractice.Lis.class )
@Test
public class loginTest {
	
	WebDriver   driver;
	
	
	@Test(invocationCount =2)
	public void Aaunchbrowser()
	{
		WebDriverManager.chromedriver().setup();
	WebDriver   driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");

	driver.manage().window().maximize();
	
		//System.out.println("Login by Email");
		//Assert.assertEquals("tushar", "tushar");
	}
 //    @Test
//	void titletest()
//	
//	{
//    		driver.get("https://www.saucedemo.com/");
//    		driver.manage().window().maximize();
//	}
     
     @Test(priority =2)
     public void Browser()
     {
    	 WebElement un = driver.findElement(By.id("user-name"));
    	 un.sendKeys("standard_user");
    	 WebElement pwd = driver.findElement(By.id("password"));
    	 pwd.sendKeys("secret_sauce");
    	 WebElement logi= driver.findElement(By.id("login-button"));
    	 logi.click();
	 
    	
     }
     
//     @Test
//     public void currenturl()
//     {
//    	String urlString = driver.getCurrentUrl();
// 		System.out.println(urlString);
//     }
     
}
