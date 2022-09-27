package seleniumpract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		 
		 driver.get("https://www.google.co.in/");
		 driver.manage().window().maximize();
		WebElement wdd=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		wdd.sendKeys("api testing");
		WebElement wddd=driver.findElement(By.xpath("//input[@class='gNO89b']"));//input[@class='gNO89b']
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wddd);
		WebElement wdddd=driver.findElement(By.xpath("//a[@aria-label='Page 2']"));//input[@class='gNO89
		JavascriptExecutor jss =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",wddd);
	}

}
