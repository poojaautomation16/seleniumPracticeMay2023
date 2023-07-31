package SeleniumSession;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Lists;

public class RelativeLocatorConcepts {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//selenium 4.0 feature
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.linkText("North Bay, Canada"));
		//right of element:
		String rightEle= driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightEle);
		
		//left of element:
		String leftEle= driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftEle);
		//below of element:
		String aboveEle= driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveEle);
		//above of element:
		String belowEle= driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowEle);
		
		//near of element
//		String nearEle= driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(nearEle);
		
		List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
		System.out.println(belowElements.size());
		for (WebElement e: belowElements) {
			System.out.println(e.getText());
		}
		
		

	}

}
