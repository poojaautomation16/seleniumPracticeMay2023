package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(50000);
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		Actions action = new Actions(driver);
		action.sendKeys(emailID, "pooja@gmail.com").build().perform();
		action.sendKeys(passWord, "pooja1234").build().perform();
		action.click(driver.findElement(By.id("loginBtn"))).build().perform();
		//right click 
		//action.contextClick(null).build().perform();
		
		//driver.findElement(By.xpath("ul/li[contains(@class='context-menu-icon-copy')])");

	}

}
