package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtils {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		By images = By.tagName("img");
		By links = By.tagName("a");
		
	}
	
	public static List<String> getElementText(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> textlist = new ArrayList<String>();
		for(WebElement e:list ) {
			String text =e.getText();
			if(!text.isEmpty()) {
				textlist.add(text);
			}
		}
		return textlist;
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
	return	driver.findElements(locator);
	}
}