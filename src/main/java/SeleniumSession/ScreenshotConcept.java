package SeleniumSession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		takeScreenshot(driver, "loginPage");
		WebElement emailID = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginbtn = driver.findElement(By.id("loginBtn"));
		takeElementScreenshot(emailID, "emailID");
		takeElementScreenshot(passWord, "Password");
		takeElementScreenshot(loginbtn, "login");
		emailID.sendKeys("pooja@testmail.com");
		passWord.sendKeys("pooja1234");
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void takeScreenshot(WebDriver driver, String filename) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void takeElementScreenshot(WebElement element, String filename) {
		File srcfile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
