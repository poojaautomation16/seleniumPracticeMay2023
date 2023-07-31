package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		By registerHeader = By.tagName("h1");
//		By forgotPassword = By.linkText("Forgotten Password");
//		By firstName =By.id("First Name");
//	//	driver.findElement(firstName).sendKeys(null);// illegalargumentexception error will be thrown
//	//	driver.findElement(firstName).sendKeys("");
//		driver.findElement(firstName).sendKeys(" ");
//		driver.findElement(firstName).sendKeys("");
		
		driver.findElement(By.id("fname")).sendKeys("Pooja");
		if(driver.findElement(By.id("pass")).isEnabled()) {
		driver.findElement(By.id("pass")).sendKeys("Test123");
		}
		else {
			System.out.println("Element is not enabled");
		}
		String attribute_value =driver.findElement(By.id("pass")).getAttribute("disabled");
		System.out.println(attribute_value);
		
		

	}

}
