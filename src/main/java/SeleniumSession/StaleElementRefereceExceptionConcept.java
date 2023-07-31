package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefereceExceptionConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> username =driver.findElements(By.id("input-email"));
		System.out.println(username.size());
		for (WebElement e:username ) {
			e.sendKeys("Testing");
		}
		
		driver.navigate().refresh();
		System.out.println(username.size());
		for (WebElement e:username ) {
			e.sendKeys("TestingHello");
		}
//		username =driver.findElement(By.id("input-email"));
		
//		username.sendKeys("TestingNew");
		
		/**
		 *whenever we launch the url dom is gets loaded and then if we refresh 
		 *the page dom is also getting refreshed.so after refreshing the page dom 
		 *is refreshed and element will not be found we get stale element exception. we need
		 *to reinitize the element 
		 *In which cases we can get StaleElementException: we are doing back and forward in 
		 *the Script
		 */
		
		/**
		 *
		 *
		 */
		
		
		
	}

}
