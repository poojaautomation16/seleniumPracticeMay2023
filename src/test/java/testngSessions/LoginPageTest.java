package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest {
	
public WebDriver driver;
By email = By.name("email");
By password = By.name("password");
By loginBtn = By.xpath("//input[@type='submit']");
By seachField = By.name("search");
By searchClick = By.xpath("//button[@type='button' and contains(@class,'btn btn-default btn-lg')]");
By macbookPrice = By.xpath("//p[@class='price' and contains(text(),'$602.00')]");
By macbookttitle =By.xpath("//p[@class='price' and contains(text(),'$602.00')]/preceding-sibling::h4");

	
	@BeforeTest
	public void  setUP() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@Test
	public void login() {
		driver.findElement(email).sendKeys("poojaa1253@gmail.com");
		driver.findElement(password).sendKeys("Hamesha@123");
		driver.findElement(loginBtn).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='My Account']")).getText(), "My Account");
	}
	
	@AfterTest
	public void  tearDown() {
		driver.quit();;
	}

}
