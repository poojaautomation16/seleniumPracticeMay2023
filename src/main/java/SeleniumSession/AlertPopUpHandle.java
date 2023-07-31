package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//there are three types of alert
		//alert, 2-prompt 3- confirmation alert
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert a= driver.switchTo().alert();
//		String text= a.getText();
//		System.out.println(text);
//		a.accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert a= driver.switchTo().alert();
//		Thread.sleep(2000);
//		String text= a.getText();
//		System.out.println(text);
//		a.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a= driver.switchTo().alert();
		String text= a.getText();
		System.out.println(text);
		a.sendKeys("test");
		Thread.sleep(5000);
		a.accept();
		
		
		
		
		
	}

}
