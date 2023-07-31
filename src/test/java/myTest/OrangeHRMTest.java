package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	String url = "https://www.orangehrm.com/";
	
	@Test (priority=2)
	public void OrangeHRMTitleTest() {
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}
	
	@Test (priority=1)
	public void OrangeHRMURLTest() 
	{   
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm"));
	}
	
}
