package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	
	public static void main(String[] args) {
		//headless: No browser
		//invisible browser /without UI
		//testing happening behind the scene
		//faster than normal
		//when to use? Linux OS,jenkins is also running on linux machine so on jenkins we can run our TC on headless mode
		//we generally use it in NON UI environment
		//test case are running in back-end and you can do your work
		//disadvantage: it might not work for complex html application. if there are lot of navigation, mouse movement, responsive testing(testing on different size of window)
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless=new");
		//co.setHeadless(true);this method is deprecated in the latest selenium version
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		//WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://mail.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
