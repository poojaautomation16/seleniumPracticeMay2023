package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWithList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	   
	    driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
	     Set<String> windowHandles = driver.getWindowHandles();
	        List<String> handles=  new ArrayList<String>(windowHandles);

	}

}
