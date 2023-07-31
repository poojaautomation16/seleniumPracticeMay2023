package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdwonUtil {
	
	/**
	 * This method is used to get all the values from dropdwon and select values from
	 * dropdwon
	 * @param field
	 * @param value
	 */
	public static ArrayList<String> GetDropwnValues(WebElement field) {
		Select select = new Select(field);
		List<WebElement> listofFields = select.getOptions();
		System.out.println("total no of values in dropdwon: " +listofFields.size());
		select.isMultiple();
		ArrayList<String> ar = new ArrayList();
		for (WebElement list: listofFields ) {	
			String s=list.getText();
			ar.add(s);
		}
		return ar;
	}
	
	public static void selectFromDropdown(WebElement field, String value) {
		Select select = new Select(field);
		select.selectByVisibleText(value);
	}
	/**
	 * This method is used to select values from dropdwon.
	 * @param driver
	 * @param Xapth
	 * @param value
	 */
	public static void selectDropdwonWithoutSelect(WebDriver driver, String Xapth, String value) {
		
		List<WebElement> list = driver.findElements(By.xpath(Xapth));
		for (int i=0; i<list.size();i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				list.get(i).click();
				break;
			}
			}
	}
}
