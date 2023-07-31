package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPauseConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName =By.id("input-firstname");
		WebElement fName = driver.findElement(firstName);
		String name = "NaveenAutomationLabs";
		Actions act = new Actions(driver);
		char[] charOfName = name.toCharArray();
		
		for (int i=0; i<charOfName.length; i++) {
			act.sendKeys(fName, String.valueOf(charOfName[i])).pause(500).perform();
		}
		

	}

}
