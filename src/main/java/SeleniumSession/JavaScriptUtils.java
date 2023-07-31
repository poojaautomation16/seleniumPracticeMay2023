package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
	
	private WebDriver driver;
	private JavascriptExecutor js;
	
	public JavaScriptUtils (WebDriver driver) {
		this.driver = driver;
		        js  = (JavascriptExecutor)this.driver;
	}
	
	public String getTitleByJS() {
		return js.executeScript("return document.title;").toString();
	}
	
	public void goBackWithJs() {
		js.executeScript("history.go(-1);");
	}
	
	public void goForwardWithJs() {
		js.executeScript("history.go(1);");
	}
	
	public void refreshWithJs() {
		js.executeScript("history.go(0);");
	}
	
	public void generateJSAlert(String message) {
		js.executeScript("alert('"+message+"')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}
	
	public void generateJSPrompt(String message, String Value) {
		js.executeScript("prompt('"+message+"')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(Value);
		alert.accept();
	}
	
	public void generateJSConfirm(String message) {
		js.executeScript("confirm('"+message+"')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}

	public String getPageInnerText() {
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void scrollPageDown() {
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public void ScrollPageUp() {
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	
	public void ScrollPageSpecificHeight(String Height) {
		 js.executeScript("window.scrollTo(0, "+Height+");");
	}
	
	public void scrolltoMiddleOfThePage() {
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}
	
	public void scrollIntoView(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true);",ele );
	}
	/**
	 * example="document.body.style.zoom = '400.0%';"
	 * @param zoompercentage
	 */
	public void zoomChromeEdgeSafari(String zoomPercentage) {
		String zoom= "document.body.style.zoom = '"+zoomPercentage+"%';";
		js.executeScript(zoom);
	}
	
	/**
	 * example="document.body.style.MozTransform = 'scale(0.5)';"
	 * @param zoompercentage
	 */
	public void zoomFirefox(String zoomPercentage) {
		String zoom= "document.body.style.MozTransform = 'scale("+zoomPercentage+")';";
		js.executeScript(zoom);
	}
	
	public void drawBorder(WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public void flash(WebElement element) {
		String bgColor= element.getCssValue("background-color");
		for (int i=0; i<=10; i++) {
			changeColor("rgb(0,200,0)",element);
			changeColor(bgColor,element );
		}
	}

	public void changeColor(String color, WebElement element) {
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element );
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
