package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//1. Id: unique Locator: 
		
		//2. Name-> can be duplicate 
		driver.findElement(By.name("agree")).click();
		
		//3. class name-> can be duplicate and is duplicate a lot of times.
		//driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		
		//4.xpath-> not an attribute ..address of the element in html DOM
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
//		By firstName_Xapth = By.xpath("//input[@name='firstname']");
//		By Lastname_Xapth = By.xpath("//input[@name='lastname']");
//		By Password_Xapth = By.xpath("//input[@name='password']");
//		By privacyPolicy_Xapth = By.xpath("//input[@name='agree']");
//		By continue_Xapth = By.xpath("//input[@class='btn btn-primary']");
//		SendKeys (firstName_Xapth, "naveen");
//		SendKeys (Lastname_Xapth, "Khuntela");
//		SendKeys (Password_Xapth, "test@123");
//		click(privacyPolicy_Xapth);
//		click(continue_Xapth);
		
		//5.css selector: not an attribute . It is based on css properties.
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("344");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

		//6. linktext :-> applicable only for text of the link (can be duplicate)
		//html tag =<a>
		//attributes , linktext
		//driver.findElement(By.linkText("Delivery Information")).click();
		
		//partial linktext:-> only for links..with partial link of the text
		
		//tagname: html tag (use only when tag name is unique) or else when we want to find 
		// total number of link available on the page
		String text= driver.findElement(By.tagName("h1")).getText(); 
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		}
public static WebElement getElement (By locator) {
return	driver.findElement(locator);
}

public static void SendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}

public static void click(By locator) {
	getElement(locator).click();
}


}
