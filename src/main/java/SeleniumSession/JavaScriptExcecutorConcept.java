package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//remotewebdriver has two parent-->Webdriver and Java Script Executor--> execute Script
		//to access all the method of javascriptExecutoer we have to cast our driver to java script executor
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("alert('hi this is pooja')");
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		String url =js.executeScript("return document.URL;").toString();
//		System.out.println(url);
		
		JavaScriptUtils jsutil = new JavaScriptUtils(driver);
		System.out.println(jsutil.getTitleByJS());
		//jsutil.generateJSAlert("Hello this is my alert");
//		jsutil.scrollPageDown();
		Thread.sleep(2000);
//		jsutil.ScrollPageUp();
//		Thread.sleep(2000);
//		jsutil.ScrollPageSpecificHeight("500");
		//WebElement ViewElement = driver.findElement(By.xpath("//h2[text()='Trending deals']"));
		//jsutil.scrollIntoView(ViewElement);
		//jsutil.zoomChromeEdge("300.0");
		//jsutil.drawBorder(ViewElement);
//	    WebElement flashEle= driver.findElement(By.id("glow-ingress-block"));
//	    jsutil.flash(flashEle);
		
	}
}
