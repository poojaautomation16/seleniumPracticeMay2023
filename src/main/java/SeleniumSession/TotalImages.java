package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		By images = By.tagName("img");
		List<WebElement>listImages =driver.findElements(images);
		int n = listImages.size();
		System.out.println("total Images: " +n);
		
		for(WebElement e:listImages ) {
			String srcValue= e.getAttribute("src");
			String altValue= e.getAttribute("alt");
			
			System.out.println(srcValue + " altvalue: " + altValue);
		}
		
	}

}
