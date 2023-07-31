package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodcChainingRegister {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName =By.id("input-firstname");
//		By LastName =By.id("First Name");
//		By email =By.id("First Name");
//		By telephone =By.id("First Name");
//		By password = By.id("input-password");
//		By confirmPassword = By.id("input-confirm");
		WebElement fName = driver.findElement(firstName);
		Actions act = new Actions(driver);
		act.sendKeys(fName, "Selenium")
		.sendKeys(Keys.TAB).pause(1000).sendKeys("Automation")
		.sendKeys(Keys.TAB).pause(1000).sendKeys("Test@Automation.com")
		.sendKeys(Keys.TAB).pause(1000).sendKeys("234556")
		.sendKeys(Keys.TAB).pause(1000).sendKeys("test123")
		.sendKeys(Keys.TAB).pause(1000).sendKeys("test123")
		.sendKeys(Keys.TAB).pause(1000)
		.sendKeys(Keys.TAB).pause(1000)
		.sendKeys(Keys.TAB).pause(1000).
		click().perform();
	}

}
