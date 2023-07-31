package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframesPractice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		//pact1 frame
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Hello");
		//pact2 frame
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("are you crush?");
		//pact3 frame
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("why crush");
		
		//driver is in pact2 frame
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("jex")).sendKeys("are you crush again?");
		//pact 1
		//driver.switchTo().parentFrame();
		//driver.findElement(By.id("inp_val")).clear();
		//back to main page
		driver.switchTo().defaultContent();
		String Text =driver.findElement(By.tagName("h3")).getText();
		System.out.println(Text);
		
		

	}

}
