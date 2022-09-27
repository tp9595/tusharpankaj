package seleniumpract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenabledeciablemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement serch = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("disply status"+serch.isDisplayed());
		System.out.println("enable status"+serch.isEnabled());
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(serch));
//
		WebElement dyt = driver.findElement(By.xpath("//input[@id='ap_email']"));
		dyt.sendKeys("tp12345007@gmail.com");
		WebElement sign = driver.findElement(By.xpath("//*[contains(@class,'a-button-input')]"));
		sign.click();
		WebElement tyu = driver.findElement(By.xpath("//*[contains(@id,'ap_password')]"));
		tyu.sendKeys("Sangita@123");
		WebElement dyu = driver.findElement(By.xpath("//*[contains(@id,'signInSubmit')]"));
		dyu.click();
	}

}
