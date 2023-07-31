package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import SeleniumSession.FrameworkException;

public class BaseTest {
	
	static WebDriver driver; 
	@Parameters({"browser"})
	@BeforeTest
	public void setUP(String browser) {
		if (browser == null) {
			System.out.println("browser can not be null");
			throw new FrameworkException ("Browser Shoud not be NULL");
		}
		System.out.println("running on " +browser + " browser" );
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
        case "edge":
//        	driver = new EdgeDriver();
			break;	
        case "firefox":
        	driver = new FirefoxDriver();
			break;	
        case "safari":
        	driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass the correct browseer: " + browser);
			throw new FrameworkException ("Not Valid Browser");}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Parameters({"browser", "url"})
	@BeforeTest
	public void setUP(String browser, String url) {
		if (browser == null) {
			System.out.println("browser can not be null");
			throw new FrameworkException ("Browser Shoud not be NULL");
		}
		System.out.println("running on " +browser + " browser" );
		switch (browser.toLowerCase().trim()) {
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
			System.out.println("Please pass the correct browseer: " + browser);
			throw new FrameworkException ("Not Valid Browser");
			
			}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
