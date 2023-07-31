package SeleniumSession;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarouselHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(5000);
		//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']
		//h2[text()='Recommended for you']/../../following-sibling::div//div[contains(@class,'swiper-button-next')]
		//swiper-button-disabled
		
		String productList  ="//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']";
		String Carousual_Xpath= "//h2[text()='Recommended for you']/../../following-sibling::div//div[contains(@class,'swiper-button-next')]";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement title =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Recommended for you']")));
		//String text =driver.findElement(with(By.xpath("//div[@data-qa='product-name']")).below(driver.findElement(By.xpath("//h2[text()='Recommended for you']")))).getText();
		//System.out.println(text);
		List<WebElement> product_list = driver.findElements(By.xpath(productList));
		//Set<String> unique_List = new HashSet<String>();  for Unique value
		// Set<String> unique_List = new TreeSet<String>();  for alphabetical Oder
		
		 Set<String> unique_List = new LinkedHashSet<String>();  //for unique list with Order
		
		
		while (!driver.findElement(By.xpath(Carousual_Xpath)).getAttribute("class").contains("swiper-button-disabled")) {
			for (WebElement e:product_list ) {
				String prodName =e.getAttribute("title");
				unique_List.add(prodName);
				
			}
			//System.out.println("--------------------------------------");
			driver.findElement(By.xpath(Carousual_Xpath)).click();
		}
		//iterate the prodList
		for (String e: unique_List) {
			System.out.println(e);
		}
		

	}

}
