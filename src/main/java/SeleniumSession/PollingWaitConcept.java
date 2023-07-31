package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingWaitConcept {

	public static void main(String[] args) {
		// total timeout-10 Sec polling time- 2sec
		//0 sec--> e1-NA
		//2 sec--> e1-NA
		//4 sec--> e1-NA
		//6 sec--> e1-NA
		//default interval time= 500 ms(0.5 sec)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email1");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		
		
		
		
		
	}

}
