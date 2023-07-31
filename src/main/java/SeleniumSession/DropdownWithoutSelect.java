package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='day']/option"));
		for (int i=0; i<list.size();i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals("25")) {
				list.get(i).click();
				break;
			}
			}
		}
		

	

}
