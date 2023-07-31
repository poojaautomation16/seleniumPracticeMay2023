package SeleniumSession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, SQLException {
		
		driver = new ChromeDriver();
		Connection connection = DriverManager.getConnection("JDBC:VIHAANS-LAPTOP\\MSSQLSERVER01", "sa", "Hamesha@123");
		if (connection.isClosed()) {
		System.out.println("Connection not establised with DB");	
		}
		else {
			System.out.println("We have successfully connected to DB");
		}
	
		driver.get("http://mrbool.com/search/");
		Thread.sleep(3000);
		By parentMenu =By.className("menulink");
		Actions act = new Actions(driver);
		//act.moveToElement(parentMenu).build(); // not valid
		//if you have single action then you can use only perform and it will work
		//act.moveToElement(parentMenu).perform();//valid
		//if you have 
		//act.moveToElement(parentMenu).build().perform(); //valid
	    By childMenu = By.linkText("COURSES"); // dom has link text Courses but we will use the text present on the webpage.
	    twoLevelMenuHandling(parentMenu,childMenu);
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuHandling(By levelOneLocator, By LevelTwoLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(levelOneLocator)).perform();
		Thread.sleep(1500);
		getElement(LevelTwoLocator).click();	
	}

}
