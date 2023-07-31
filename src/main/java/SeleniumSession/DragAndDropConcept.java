package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		
		WebElement Source =driver.findElement(By.id("draggable"));
		WebElement target =driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//act.clickAndHold(Source).moveToElement(target).release().build().perform();
		//drag and drop we can only do webElement to webElement in selenium.
		act.dragAndDrop(Source, target).perform();
		
	}

}
