package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

//	public static void main(String[] args) {
		//decide which browser
		//open browser
		//ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		if (title.equals("Google")) {
//			System.out.println("Correct title");
//		}else
//		{
//			System.out.println("Incorrect title");
//		}
//		driver.quit();

//	}
	WebDriver driver;
	public void launchBrowser(String BrowserName) {
		System.out.println("Browser name is: " +BrowserName );
		if (BrowserName == null) {
			System.out.println("browser can not be null");
			throw new FrameworkException ("Browser Shoud not be NULL");
		}
		switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
        case "edge":
        	driver = new EdgeDriver();
			break;
			
        case "firefox":
        	driver = new FirefoxDriver();
			break;
			
        case "safari":
        	driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the correct browseer: " + BrowserName);
			throw new FrameworkException ("Not Valid Browser");
		}
		
	}

}
