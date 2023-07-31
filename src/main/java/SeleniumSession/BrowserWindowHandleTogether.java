package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	    
	   String parentWindowId = driver.getWindowHandle();
	    
		WebElement facebook =driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement Twitter =driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement Linkedin =driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement Youtube =driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		
		facebook.click();
		Twitter.click();
		Linkedin.click();
		Youtube.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		 while (it.hasNext()) {
			 String WindowId = it.next();
			 driver.switchTo().window(WindowId);
			 System.out.println(driver.getCurrentUrl());
			 Thread.sleep(1500);
			 if (!WindowId.equals(parentWindowId)) {
			 driver.close();
			 }
		 }
		 
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent window url: " + driver.getCurrentUrl() );

	}

}
