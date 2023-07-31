package com.qa.obero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver ();
		driver.get("http://automationpractice.multiformis.com/");
		driver.findElement(By.xpath("//div[@id='contact-link']")).click();
		//WebElement Xpath = driver.findElement(By.xpath("//div[@class='selector']"));
		Select select = new Select(driver.findElement(By.id("id_contact")));
		select.selectByVisibleText("Webmaster");
		driver.findElement(By.id("email")).sendKeys("test@toptal.com");
		driver.findElement(By.id("id_order")).sendKeys("R108");
		//driver.findElement(By.xpath("//span[text()='Choose File']")).click();
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Complaint about order R108");
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		String SuccessMessage= driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		
		
		
		
		
		
		

	}

}
