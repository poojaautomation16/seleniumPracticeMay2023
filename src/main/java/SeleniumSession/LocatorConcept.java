package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
public static String email_xapth = "//input[@id='username']";
static String username = "poojaa1253@gmail.com";
static String password1 = "Hamesha@123";
static String loginButton = "//input[@type = 'submit']";
static String email_id ="input-email";
static String password_id = "input-password";
static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
	//create webelement + perform action (click, sendkeys,gettext, is displayed etc)
	 driver = new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	System.out.println(driver.getTitle());
	
	ElementUtil eleUtil = new ElementUtil(driver);
//1st:
//	driver.findElement(By.id("input-email")).sendKeys("poojaa1253@gmail.com");
//	driver.findElement(By.id("input-password")).sendKeys("Hamesha@123"); 
//	driver.findElement(By.xpath("//input[@type = 'submit']")).click();
//	System.out.println(driver.getTitle());
	
	//2nd
//	WebElement email =driver.findElement(By.id("input-email"));
//	WebElement password = driver.findElement(By.id("input-password"));
//	WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
//	
//	email.sendKeys("poojaa1253@gmail.com");
//	password.sendKeys("Hamesha@123");
//	login.click();
	
	//3rd Approch
//	By email = By.id("input-email");
//	By password = By.id("input-password");
//	
//	WebElement eMail = driver.findElement(email);
//	WebElement passWord = driver.findElement(password);
//	
//	eMail.sendKeys(username);
//	passWord.sendKeys(password1);
//	driver.close();
	
	//4. BY locator + generic function
//	By email = By.id("input-email");
//	By password = By.id("input-password");
//	getElement(email);
//	getElement(password);
	
	//5. BY locator + generic function for element and actions
//	By email = By.id("input-email");
//	By password = By.id("input-password");
//	By login = By.xpath(loginButton);
//	
//	doSendKeys(email, username);
//	doSendKeys(password, password1);
//	doclick (login);
	
	//6. BY locator + generic function for element in utils class
//	By email = By.id("input-email");
//	By password = By.id("input-password");
//	By login = By.xpath(loginButton);
//	eleUtil.doSendKeys(email, username);
//	eleUtil.doSendKeys(password, password1);
//	eleUtil.doclick(login);
//	
	//7. saparate utils class
	//8th: maintain String locators + generic functions for element
	By email = By.id(email_id);
	By pword = By.id(password_id);
	By login = By.xpath(loginButton);
//	eleUtil.doSendKeys(email, username);
//	eleUtil.doSendKeys(pword, password1);
//	eleUtil.doclick(login);
	
	//9th: maintain String locators + generic functions for element
	doSendKeys("id",email_id, username);
	doSendKeys("id",password_id, password1);
	//5.css Selector: 
	
   
	}
	
	public static By getByMethod(String Selector, String LocatorType) {
		By locator = null;
		switch(LocatorType.toLowerCase()){
		case "id":
			locator = By.id(Selector);
			break;
		
		default:
			break;
		}
	return locator;	
	}
	
	public static void doclick(By Locator) {
		getElement(Locator).click();
	}
	
	public static void doSendKeys(String locatortype, String Selector, String value) {
		By loc =getByMethod(locatortype,Selector );
		getElement(loc).sendKeys(value);;
	}
	
	public static void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}
	
	public static String doGetElementText(By Locator) {
		return getElement(Locator).getText();
	}

}
