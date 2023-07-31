package SeleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {
	private WebDriver driver;
	/**
	 * this method is used to initilize the driver based on browser name
	 * @param browser
	 * @return this returns driver 
	 */
	
	public WebDriver initDriver(String browser) {
		if (browser == null) {
			System.out.println("browser can not be null");
			throw new FrameworkException ("Browser Shoud not be NULL");
		}
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
			throw new FrameworkException ("Not Valid Browser");}
		return driver;
	}
	
	public void launchUrl(String url) {
		if (url==null) {
			System.out.println("browser is null");
			return;
		}
		if (url.contains("http")) {
			 driver.get(url);
		}
		else {
			throw new FrameworkException ("url should have http(s)");
		}   
		}
	
	public void launchUrl(URL url) {
		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}
		else {
			throw new FrameworkException ("url should have http(s)");
		}
	}
	
	public String getTitle() {
		String title =driver.getTitle();
		System.out.println("Page title is: " + title);
		return title;
	}
	
	public String getPageURL() {
		String pageURL =driver.getCurrentUrl();
		System.out.println("Page URL is: " + pageURL);
		return pageURL;
	}
	
	public boolean isURlFractionEsist(String Fraction) {
		if (getPageURL().contains(Fraction)) {
			return true;}
		return false;
	}
	
	public String getPageSource() {
		String pageSource =driver.getPageSource();
		//System.out.println("Page URL is: " + pageSource);
		return pageSource;
	}
	
	public boolean isInfoExistINPageSource(String info) {
		if (getPageSource().contains(info)) {
			return true;
		}
		return false;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
