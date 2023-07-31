package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
 String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
	
	@Test (priority=2)
	public void OpenCartTitleTest() {
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Test (priority=1)
	public void OpenCartURLTest() {
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));
	}
	
}
