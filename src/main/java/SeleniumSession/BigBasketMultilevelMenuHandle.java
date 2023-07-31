package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevelMenuHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		By MainManu_xpath = By.xpath("//a[@qa='categoryDD']");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(MainManu_xpath)).perform();
		WebElement level1 =driver.findElement(By.linkText("Beverages"));
		act.moveToElement(level1).perform();
		
		WebElement level2 =driver.findElement(By.linkText("Tea"));
		act.moveToElement(level2).perform();
		WebElement level3 =driver.findElement(By.linkText("Green Tea"));
		level3.click();
		multiLevelMenuHandling(MainManu_xpath,"Beverages","Tea","Green Tea" );
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getLinkElementbyText(String text) {
		return driver.findElement(By.linkText(text));
	}
	
	public static void multiLevelMenuHandling(By Lev1Locator, String lev2, String lev3, String lev4) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(Lev1Locator)).perform();
		Thread.sleep(2000);
		act.moveToElement(getLinkElementbyText(lev2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getLinkElementbyText(lev3)).perform();
		Thread.sleep(1000);
		getLinkElementbyText(lev4).click();
	}
	//ASSIGNMENT: go to each link and iterate each menu items one by one.
	

}
