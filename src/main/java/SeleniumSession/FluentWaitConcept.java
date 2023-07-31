package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email1");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...Element is not found.." + email);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("Test");

	}
	
	public static WebElement waitforElementVisibleWithFluentWait(By locator, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...Element is not found.." + locator);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitforElementPresenceWithFluentWait(By locator, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...Element is not found.." + locator);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static Alert waitforJSAlertWithFluentWait( int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...JS Alert is not found.." );
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static WebDriver waitforFrametWithFluentWait(String frameId, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...Frame is not found.." +frameId );
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
	}
	
	

}
