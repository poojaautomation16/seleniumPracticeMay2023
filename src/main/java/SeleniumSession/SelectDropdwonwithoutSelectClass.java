package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdwonwithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(3000);
		By country = By.xpath("//select[@id='Form_getForm_Country']//option");
		driver.findElements(country);
		doSelectDropdownValueUsingLocator (country, "Brazil");
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownValueUsingLocator(By locator, String dropdownValue) {
		List<WebElement> optionsList= driver.findElements(locator);
		for (WebElement e: optionsList) {
			String listtext = e.getText();
			System.out.println(listtext);
			if (listtext.equals(dropdownValue)) {
				e.click();
				break;
			}
		}

	}
}
