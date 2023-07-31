package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Set<String> handles = driver.getWindowHandles();
		//list is order based collection but set is not order based.
		//set does not maintain order , also set cannot have duplicate values.
		Iterator<String> it = handles.iterator();
		String parentWindowId= it.next();
		System.out.println("Parent Window Id is: " + parentWindowId);
		String childWindowId= it.next();
		System.out.println("Child Window Id is: " + parentWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window URL is: " + driver.getCurrentUrl());
		//close the child window
		driver.close();
		//switch to parent Window
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window URL is: " + driver.getCurrentUrl());
		driver.quit();
		
		
		

	}

}
