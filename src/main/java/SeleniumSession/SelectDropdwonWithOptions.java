package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdwonWithOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(3000);
		By country = By.id("Form_getForm_Country");
	
		if ( getDropdownTextList(country).contains("India")) {
			System.out.println("Pass");
		}
		
		List<String> ExpectedValues= Arrays.asList("India", "Brazil", "Aruba");
		if (getDropdownTextList(country).containsAll(ExpectedValues)) {
			System.out.println(ExpectedValues + " is available");
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropdownTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList= select.getOptions();
		List<String> actualList = new ArrayList<>();
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			actualList.add(e.getText());
		}
		return actualList;
	}

}
