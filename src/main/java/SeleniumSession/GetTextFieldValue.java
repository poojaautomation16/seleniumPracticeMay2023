package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Test@gmail.com");
		String s= driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(s);
		driver.quit();

	}

}
