package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		//Page Element
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
        //switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
        //frame Element
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Pooja");
        //switch back to the main page
        driver.switchTo().defaultContent();
        //Page Element
        String Text =driver.findElement(By.xpath("//p[@id='tooltip']")).getText();
        System.out.println(Text);
	}
	

}
