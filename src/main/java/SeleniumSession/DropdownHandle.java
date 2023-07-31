package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	/**
	 * This method is used to get all the values from dropdwon and select values from
	 * dropdwon
	 * @param field
	 * @param value
	 */
	
	public static void GetDropwnAndselectFromDropdown(WebElement field, String value) {
		Select select = new Select(field);
		select.selectByVisibleText(value);
		List<WebElement> listofFields = select.getOptions();
		System.out.println("total no of values in dropdwon: " +listofFields.size());
		
		for (WebElement list: listofFields ) {
			String s=list.getText();
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));

		DropdwonUtil.selectFromDropdown(month,"Feb");
		DropdwonUtil.selectFromDropdown(day,"24");
		DropdwonUtil.selectFromDropdown(year,"2021");
		ArrayList<String> monthList = DropdwonUtil.GetDropwnValues(month);
		System.out.println(monthList);
		ArrayList<String> dayList = DropdwonUtil.GetDropwnValues(day);
		System.out.println(dayList);
		ArrayList<String> yearList =DropdwonUtil.GetDropwnValues(year);
		System.out.println(yearList);
	
		driver.quit();

	}

}
