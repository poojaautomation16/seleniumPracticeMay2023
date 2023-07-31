package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleTest extends BaseTest {
	

	@Test (priority=2)
	public void googleTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	
	@Test (priority=1)
	public void googleURLTest() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
//	@Test(priority=3)
//	public void googlesearchTest() {
//		Assert.assertEquals(driver.getTitle(), "Google");
//	}
	

}
