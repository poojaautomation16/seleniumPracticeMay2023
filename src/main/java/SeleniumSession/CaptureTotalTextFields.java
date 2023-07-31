package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTotalTextFields {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int i = images.size();
		System.out.println("Total number of Images: " +i);
		for (int j=0; j<i; j++) {
			String s= images.get(j).getAttribute("src");
			System.out.println(s);
		}
		driver.quit();
 
	}

}
