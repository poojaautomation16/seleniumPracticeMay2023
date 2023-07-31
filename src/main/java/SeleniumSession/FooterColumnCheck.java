package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumnCheck {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		
		
        System.out.println(getFooterHeaderTest("Amazon Store Card"));
        System.out.println(getFooterHeaderTest("Your Account"));
        System.out.println(getFooterHeaderTest("Become an Affiliate"));
        System.out.println(getFooterHeaderTest("Press Center"));
	}
	
	public static String getFooterHeaderTest(String footerText) {
		String footerHeadertext =driver
				.findElement(By.xpath("//a[text()='"+footerText+"']/ancestor::ul/parent::div/div"))
				.getText();
		return footerHeadertext;
	}

}
