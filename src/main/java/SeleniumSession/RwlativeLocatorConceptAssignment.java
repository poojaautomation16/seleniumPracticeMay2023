package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RwlativeLocatorConceptAssignment {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//selenium 4.0 feature
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']"));
		String right =driver.findElement(with(By.xpath("//label[@class='radio-inline']")).toRightOf(ele)).getText();
		System.out.println(right);
		
		String left =driver.findElement(with(By.xpath("//label[@class='col-sm-2 control-label']")).toLeftOf(ele)).getText();
		System.out.println(left);
		
		

	}

}
