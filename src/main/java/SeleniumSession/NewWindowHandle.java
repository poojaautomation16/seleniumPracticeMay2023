package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
	    Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.close();
        
        driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
        
        
	}

}
