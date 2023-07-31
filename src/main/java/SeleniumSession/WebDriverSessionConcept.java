package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcept {

	public static void main(String[] args) {
		//case 1: Quit
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com"); //4bb57d883d61601ee72ca8a089d8531d
		// 
		String title = driver.getTitle(); //4bb57d883d61601ee72ca8a089d8531d
		//cf778dedcd4e9223154bb4035a97af72
		
		System.out.println("title is: " +title );
		System.out.println(driver.getCurrentUrl()); //4bb57d883d61601ee72ca8a089d8531d
		
		//driver.quit(); //4bb57d883d61601ee72ca8a089d8531d
		driver.close();
		driver = new ChromeDriver();
		driver.getTitle(); //session id =null
		// in case of close session id will become invalid or it will expire.

	}

}
