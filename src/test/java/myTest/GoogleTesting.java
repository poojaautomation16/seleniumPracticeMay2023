package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTesting {

		static WebDriver driver; 
		@BeforeTest
		public void setUP() {
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		@Test (priority=2)
		public void googleTitleTest() {
			Assert.assertEquals(driver.getTitle(), "Google");
		}
		
		@Test (priority=1)
		public void googleURLTest() {
			Assert.assertTrue(driver.getCurrentUrl().contains("Google"));
		}
		
		@Test(priority=3)
		public void googlesearchTest() {
			Assert.assertEquals(driver.getTitle(), "Google");
		}
		@AfterTest
		public void tearDown() {
			driver.quit();
		}

}
