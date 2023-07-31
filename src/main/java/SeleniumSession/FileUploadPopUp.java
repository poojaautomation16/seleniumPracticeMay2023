package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FileUploadPopUp {
	
	public static String Xpath_File= "//input[@name='upfile']";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//when you inspect the element and type =file shud be there.
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\manis\\OneDrive\\Desktop\\Pooja job profile.txt");

	}

}
