package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopHandle {
 public static String Xpath_Submit = "//input[@type='submit']";
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(Xpath_Submit)).click();
		// Alert class is responsible for java-script pop up.
		Alert alert =driver.switchTo().alert();
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct msg");
		}
		else {
			System.out.println("IN-Correct msg");
		}
		alert.accept();
		
		Set<String> Handles =driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
	}   

}
