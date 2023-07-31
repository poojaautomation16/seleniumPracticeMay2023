package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;
	public static void main(String[] args) {
		//create custom wait without using any selenium wait.
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		retryingElement(email, 5, 2000).sendKeys("Testing");
		
	}
	
	public static WebElement getElement(By locator) {	
			 return driver.findElement(locator);	
	}
	
	public static WebElement retryingElement(By locator, int totalAttempts, int pollingtime) {
		WebElement element = null;
		int attempts= 0;
		while (attempts<totalAttempts) {
			try {
			element=getElement(locator);
			System.out.println("Element is found..... " + locator + " in " +attempts + " attempts" );
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element is not found........" + locator + " in " +attempts + " attempts");
				try {
					Thread.sleep(pollingtime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				attempts++;
			}
			
		}
		if (element==null) {
			System.out.println("Element is not found........ " + locator + " in " +attempts + " attempts" );
		}
		return element;
	}
	
	
	
	public static WebElement retryingElement(By locator, int totalAttempts) {
		WebElement ele = null;
		int attempts =0;
		while (attempts<totalAttempts) {
			try {
			ele=getElement(locator);
			System.out.println("Element is found........" + ele + "in attempts " + attempts);
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element is not found........" + ele + "in attempts " + attempts);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (ele==null) {
			System.out.println("Element is not found........" + ele + "in attempts " + attempts);
		}
		return ele;
	}

}
