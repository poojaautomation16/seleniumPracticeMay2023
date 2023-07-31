package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		//Thread.sleep(1500);
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		//control+keydown to go at the bottom of the page
	   // act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
	   // Thread.sleep(1000);
	    //to go at the top of the page
	    //act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	    //scroll to element
	    act.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help")))
	    .build()
	    .perform();

	}

}
