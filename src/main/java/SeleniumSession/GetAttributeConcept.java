package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By registerHeader = By.tagName("h1");
		By forgotPassword = By.linkText("Forgotten Password");
		By firstName =By.id("First Name");
		
		String value =driver.findElement(forgotPassword).getAttribute("href");
		System.out.println(value);
		String FirstName_value =driver.findElement(firstName).getAttribute("placeholder");
		System.out.println(FirstName_value);
		
	}

}
