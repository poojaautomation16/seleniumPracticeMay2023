package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeoutConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// three stages of page loading: loading, interactive, complete
		//create custom wait without using any selenium wait.
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		if (isPageLoaded(10)) {
			System.out.println("page is fully loaded");
		}

	}
	
	public static boolean isPageLoaded(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		String flag =wait.until(ExpectedConditions.jsReturnsValue("return document.readyState =='complete'")).toString();
	    return Boolean.parseBoolean(flag);
	}
	

}
