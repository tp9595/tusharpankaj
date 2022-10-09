package seleniumpract;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowpratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
		
		String url ="https://demoqa.com/browser-windows";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		String gh = driver.getWindowHandle();
		//we will get the window id 
		System.out.println(gh);
		WebElement dyt  = driver.findElement(By.id("tabButton"));
		dyt.click();
		
		Set<String> windows =driver.getWindowHandles();
		System.out.println(windows.size());
		 Iterator itr =windows.iterator();
		Object  parentId = itr.next();
		Object ChildId = itr.next();
		System.out.println(parentId);
		System.out.println(ChildId);
		
		
		for (String  j :windows)
		{
			 String ghh =driver.switchTo().window(j).getTitle();
			 System.out.println(ghh);
		}
		while(itr.hasNext())
		 {
			 String nextwindow= (String) itr.next();
			 if(!gh.equalsIgnoreCase(nextwindow))
			 {
				 driver.switchTo().window(nextwindow);
				 WebElement txt = driver.findElement(By.id("sampleHeading"));
						 String grabText = txt.getText();
				 System.out.println(grabText);
			 }
		 }
		
		}
}