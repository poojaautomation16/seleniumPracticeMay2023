package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageTest {
	WebDriver driver ;
	public static void main(String[] args) {
		BrowserUtils butil = new BrowserUtils();
		butil.initDriver("chrome");
		butil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
	}

}
