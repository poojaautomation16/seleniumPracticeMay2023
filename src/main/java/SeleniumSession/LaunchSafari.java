package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchSafari {

	public static void main(String[] args) {
		//geckodriver
	System.setProperty("Webdriver.Gecko.driver", "C:\\Users\\manis\\Downloads\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		

	}

}
