package Keyboardoperationactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement  fg =driver.findElement(By.id("firstName"));
		fg.sendKeys("tus");
		Actions gh= new Actions(driver);
		gh.sendKeys(Keys.chord(Keys.CONTROL ,"C")).perform();
		gh.sendKeys(Keys.TAB).perform();
		gh.sendKeys(Keys.chord(Keys.CONTROL ,"V")).perform();
		
		
		
	}

}
