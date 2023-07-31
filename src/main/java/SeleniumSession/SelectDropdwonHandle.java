package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdwonHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(3000);
		By country = By.id("Form_getForm_Country");
		//WebElement country = driver.findElement(county);
			//Select select = new Select(country);
			//select.selectByIndex(5); in case where month/days/weeks is always fixed. then we can use select by index.
			//selectByValue("American Samoa");
			//select.selectByVisibleText("India");
		//doSelectDropDownByIndex(county, 5);
		doSelectDropDownByVIsibleText(country, "Brazil");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		if (index<0) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		if (value == null) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVIsibleText(By locator, String text) {
		if (text == null) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByVisibleText(text);
	}

}
