package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By registerHeader = By.tagName("h1");
		By forgotPassword = By.linkText("Forgotten Password");
		
	}
	
	public static String doElementGetText(By locator) {
		return driver.findElement(locator).getText();
	}

}
