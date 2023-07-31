package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysAndClick {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email = By.id("input-email");
		By firstName =By.id("input-password");
		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(email), "Test@gmail.com").perform();
		act.sendKeys(driver.findElement(firstName), "test123").perform();
		act.click(driver.findElement(By.xpath("//input[@value='Login']"))).perform();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public static void doActionsSendKeys(By locator, String Text) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),Text ).perform();
	}

}
