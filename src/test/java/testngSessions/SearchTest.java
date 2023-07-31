package testngSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import myTest.BaseTest;

public class SearchTest extends BaseTest {
	public static WebDriver driver;
	By seachField = By.name("search");
	By searchClick = By.xpath("//button[@type='button' and contains(@class,'btn btn-default btn-lg')]");
	By macbookPrice = By.xpath("//p[@class='price' and contains(text(),'$602.00')]");
	By macbookttitle =By.xpath("//p[@class='price' and contains(text(),'$602.00')]/preceding-sibling::h4");
	By searchHeader = By.cssSelector("div#content h1");
	By poductnumber = By.xpath("//div[contains(@class,'product-layout')]");
	@BeforeTest
	public void  setUP() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@DataProvider
	public Object[][] searchTestData() {
		return new Object[][] {
			{"macbook", 3},
			{"imac", 1},
			{"samsung", 2},
			{"canon", 1},
			{"Test", 0},
		};
	}

	@Test(dataProvider = "searchTestData")
	public void searchTest(String searchItem, int expSearchCount) {
		driver.findElement(seachField).clear();
		driver.findElement(seachField).sendKeys(searchItem);
		driver.findElement(searchClick).click();
		String header = driver.findElement(searchHeader).getText();
		System.out.println(header);
		Assert.assertTrue(header.contains(searchItem));
		
		int actualSearchCount =driver.findElements(poductnumber).size();
		System.out.println("Product count for " +searchItem+ " is: " + actualSearchCount);
	    Assert.assertEquals(actualSearchCount, expSearchCount);
	}

}
