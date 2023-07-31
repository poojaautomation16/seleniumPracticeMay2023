package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
  
	public WebDriver driver;
	
	//test parametrization
	//data driver approch: drive
	
	
	
	@BeforeTest
	public void  setUP() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	public boolean doLogin(String userName, String Password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        String warnMesg =driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
	
	  if (warnMesg.contains(" No match for E-Mail Address and/or Password")) {
		  return true;
		  }
	  return false;
	}
	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] {
			{"firstdata","first123"},
			{"seconddata",""},
			{"","first123"},
			{"f%^&&(*909","first123"},
			{"firstdata","first1234345465776876887989"}	
		};
	}
	
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String Password) {
		boolean flag = doLogin(userName,Password);
		Assert.assertTrue(flag);
	}
}
