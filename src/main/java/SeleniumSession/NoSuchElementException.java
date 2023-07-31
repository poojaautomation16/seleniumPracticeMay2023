package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        By forgotPassword = By.linkText("Forgotten Password11");
        try {
        driver.findElement(forgotPassword).click(); //while creating the webElement exception will be thrown\
        }
        catch (Exception e) {
        	System.out.println("getting element exception: please check your locator");
            e.printStackTrace()	;
        }
	}
	
}
