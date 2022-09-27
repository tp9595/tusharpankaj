package listnerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class manger1 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	WebElement	search =driver.findElement(By.xpath("//a[contains(text(),'')]"));
	
	System.out.println("display status=" +search.isDisplayed());
	System.out.println("enable status=" +search.isEnabled());	
		
		
	}

}
