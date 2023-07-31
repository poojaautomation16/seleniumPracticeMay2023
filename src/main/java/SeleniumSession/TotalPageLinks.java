package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\manis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: " + list.size());
		for (int i=0; i<list.size(); i++) {
			String s = list.get(i).getText();
			if (!(s.isEmpty())){
			System.out.println(list.get(i).getText());}
		}
		System.out.println("***********************");
		driver.quit();

	}

}
