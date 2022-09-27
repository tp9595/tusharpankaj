package windowpractice;

import java.awt.Window;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		 
		// driver.get("https://www.google.co.in/");
		 String url = "https://www.flipkart.com/";
			driver.get(url);
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9594368542");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Tushar@123");
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			WebDriverWait  wt=new WebDriverWait(driver,Duration.ofSeconds(30));
			wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")));
			WebElement searchText = driver.findElement(By.name("q"));
			searchText.sendKeys("Wing of Fire");
			searchText.sendKeys(Keys.ENTER);
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")));
			String currentWindow =driver.getWindowHandle();//To strore Current window
			driver.findElement(By.xpath("//div[@data-id='RBKG6KJ3HEABZAZF']")).click();
			
			Set<String> allWindow = driver.getWindowHandles();
			System.out.println(allWindow.size());
			//To Trvarrse it we need Iteartor
			Iterator<String> itr =allWindow.iterator();
			
			String childWindow =itr.next();
			if(childWindow.equalsIgnoreCase(currentWindow)) {
				childWindow=itr.next();
			}
			driver.switchTo().window(childWindow);
			
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			driver.switchTo().window(currentWindow);
	}

}
