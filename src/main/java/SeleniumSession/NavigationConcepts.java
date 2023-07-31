package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
		driver.navigate().to("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		driver.navigate().back();
		String title1 = driver.getTitle();
		System.out.println("Page title is: " + title1);
		
		driver.navigate().forward();
		String title2 = driver.getTitle();
		System.out.println("Page title is: " + title2);
		
		driver.navigate().back();
		String title3 = driver.getTitle();
		System.out.println("Page title is: " + title3);
		
		driver.navigate().refresh();

	}

}
