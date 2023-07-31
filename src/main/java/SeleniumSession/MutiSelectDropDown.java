package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutiSelectDropDown {
  public static String XapthChoice= "//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']";
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement multiSelection = driver.findElement(By.id("justAnInputBox"));
		multiSelection.click();
		//List<WebElement> ChoiceList =driver.findElements(By.xpath(XapthChoice));
		//(choice 1, choice 2, choice 2 1, choice 2 2,choice 2 3, choice 3, choice 4, choice 5
		//choice 6, choice 6 1, choice 6 2, choice 6 2 1,choice 6 2 2
		//choice 6 2 3, choice 7)
//		for (int i=0; i<ChoiceList.size(); i++) {
//			String choiceText =ChoiceList.get(i).getText();
//			System.out.println(choiceText);
//			if (choiceText.equals("choice 2")) {
//				ChoiceList.get(i).click();
//				break;
//			}		
//		}
		//MultipleSelectionFromDropdown(driver, XapthChoice, "choice 2 2","choice 6 1", "choice 6 2", "choice 7" );
		MultipleSelectionFromDropdown(driver, XapthChoice, "All" );
	}
   public static void MultipleSelectionFromDropdown(WebDriver driver,String xapth, String... Text ) {
	   List<WebElement> ChoiceList =driver.findElements(By.xpath(xapth));
		//(choice 1, choice 2, choice 2 1, choice 2 2,choice 2 3, choice 3, choice 4, choice 5
		//choice 6, choice 6 1, choice 6 2, choice 6 2 1,choice 6 2 2
		//choice 6 2 3, choice 7)
	   if (!Text[0].equalsIgnoreCase("all")) {
		   for (int i=0; i<ChoiceList.size(); i++) {
				String choiceText =ChoiceList.get(i).getText();
				System.out.println(choiceText);
				for (int k=0; k<Text.length; k++) {
				if (choiceText.equals(Text[k])) {
					ChoiceList.get(i).click();
					break;
				}
				}
			}   
	   }
	   else {
		   for (int all=0; all<ChoiceList.size(); all++){
			   String choiceText =ChoiceList.get(all).getText();
			   if (!choiceText.isEmpty()) {
			   ChoiceList.get(all).click(); }
		   }
		   }
}
}
