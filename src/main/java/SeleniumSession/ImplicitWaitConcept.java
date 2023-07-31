package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args){
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//it's a global wait
		//its applicable to all the elements
		//won't work for non webElements: title, url, alerts
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//pact1 frame
		driver.findElement(By.name("username")).sendKeys("admin");

	}

}
