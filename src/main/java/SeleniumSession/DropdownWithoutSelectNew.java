package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectNew {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//selenium 4.0 feature
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		for (WebElement e:findElements) {
		String options=	e.getText();
		System.out.println(options);
		}

	}

}
