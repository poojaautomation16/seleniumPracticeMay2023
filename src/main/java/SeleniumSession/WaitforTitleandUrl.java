package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleandUrl {
	static WebDriver driver;
	public static void main(String[] args) {
	driver = new ChromeDriver();
	 driver.get("http://classic.crmpro.com/");
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	 if(wait.until(ExpectedConditions.titleContains("Free CRM"))) {
//		 System.out.println(driver.getTitle());
//	 }
	 waitForTitleContains("Free CRM",10);
	 

	}
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		 }
		 else {
			 System.out.println(titleFraction + " is not present in title");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(titleFraction + " is not present in title");
			e.printStackTrace();
			return null;
		 }
	}
	
	public static String waitForTitleIs(String title, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		 }
		 else {
			 System.out.println(title + " is not present in title");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(title + " is not present in title");
			e.printStackTrace();
			return null;
		 }
	}
	
	public static String waitForurlContains(String urlFraction, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		 }
		 else {
			 System.out.println(urlFraction + " is not present in URL");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(urlFraction + " is not present in URL");
			e.printStackTrace();
			return null;
		 }
	}
	
	public static String waitForurlIS(String url, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		 }
		 else {
			 System.out.println(url + " is not present in URL");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(url + " is not present in URL");
			e.printStackTrace();
			return null;
		 }
	}
	
	
	

}
