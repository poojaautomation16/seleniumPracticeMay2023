package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		By rightClickele = By.xpath("//span[text()='right click me']");
//		Actions act = new Actions(driver);
//		act.contextClick(rightClickele).perform();
//		control+2 , L :-> assign to local variable 
        // WebElement findElement = driver.findElement(By.xpath("//span[text()='Copy']"));	
	    selectRightClickOption(rightClickele, "Paste");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectRightClickOption(By ContextMenuLocator, String Optiontext) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(ContextMenuLocator)).perform();
//		By contextClickList_CSS = By.cssSelector("ul.context-menu-list.context-menu-root span");
//		List<WebElement> contextClickList = driver.findElements(contextClickList_CSS);
//		for (WebElement e: contextClickList) {
//			String listtext= e.getText();
//			System.out.println(listtext);
//		}
	    By locator = By.xpath("//*[text()='"+Optiontext+"']");
	    getElement(locator).click();    
	}

}
