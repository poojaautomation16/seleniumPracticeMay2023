package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		if (title.contains("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("In-correct title");
		}
		
		String url =driver.getCurrentUrl();
		System.out.println("Current Url is: "+ url);
		//System.out.println(driver.getPageSource());
		driver.close();// will close the browser. 
		 driver.quit();// will terminate the driver and session id will become null
	}

}
