package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		By links = By.tagName("a");
		
		List<WebElement> listOfLinks =driver.findElements(links);
		int l = listOfLinks.size();
		System.out.println("total number of Links: " +l);
		for ( int i=0; i<l; i++) {
			String text =listOfLinks.get(i).getText();
			if (!text.isBlank()) {
				System.out.println(i+ " " + text);
			}
		}
	}
	
	public static void getLinks(By Locator) {
		List<WebElement> listOfLinks =driver.findElements(Locator);
		int l = listOfLinks.size();
		System.out.println("total number of Links: " +l);
		int count =0;
		for (WebElement e:listOfLinks ) {
			String text = e.getText();
			if (!text.isBlank()) {
				System.out.println( count + " " + text);
			}
		}
	}

}
