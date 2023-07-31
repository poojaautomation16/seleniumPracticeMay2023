package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDwonWithoutSelectMethod {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(3000);
		By country = By.id("Form_getForm_Country");
		//assignment: create a generic method for list of attributes.

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownValue(By locator, String dropdownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList= select.getOptions();
		
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
