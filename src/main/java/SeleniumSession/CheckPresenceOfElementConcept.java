package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPresenceOfElementConcept {

	static WebDriver driver;
	public static void main(String[] args){
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		By name =By.name("username");
		By passWord =By.name("password");
		By login = By.xpath("//button[@type='submit']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
		WebElement username_ele = waitforElementPresence(name, 10);
		username_ele.sendKeys("admin");
		driver.findElement(passWord).sendKeys("admin");
		driver.findElement(login).click();

	}
	
	public static WebElement waitforElementPresence(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}

}
