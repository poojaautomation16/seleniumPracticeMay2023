package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		//give both username and password separated by : then followed by @url
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		//driver.switchTo().frame(2);
		driver.switchTo().frame("main");

		String text =driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();

	}

}
