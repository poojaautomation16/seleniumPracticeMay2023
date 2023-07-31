package com.qa.obero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		//every tr has mutiple td
	//a[text()='deepti Gupta']/parent::td/preceding-sibling::td/input
     // Xapth = "//a[text()='"+ name+ "']/parent::td/preceding-sibling::td/input"
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.get("https://classic.crmpro.com/index.html");
    	driver.switchTo().frame("mainPanel");
    	
    	
    	driver.findElement(By.name("username")).sendKeys("groupautomation");
    	driver.findElement(By.name("password")).sendKeys("Test@12345");
    	driver.findElement(By.xpath("//input[@value='Login'")).click();
    	
    	
    		  
    		  
	}
	
	public static void SelectContact(String contacName) {
		String xapth = "//a[text()='"+ contacName + "']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xapth)).click();
	}

}
