package com.qa.obero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
	private WebDriver driver ;
	private By registerLink= By.linkText("Register");
	private By firstName = By.id("input-firstname");
	private By LastName = By.id("input-lastname");
	private By email = By.id("input-email");
	private By telephone = By.id("input-telephone");
	private By password = By.id("input-password");
	private By confirmPassword= By.id("input-confirm");
	private By newLetterYes = By.xpath("//input[@Name='newsletter' and @value='1']");
	private By newLetterNo = By.xpath("//input[@Name='newsletter' and @value='0']");
	private By checkbox = By.xpath("//input[@type='checkbox' and @value='1']");
	private By cotinue = By.xpath("//input[@type='submit']");
	
	
	
	public RegisterPage (WebDriver driver){
		this.driver = driver;
	}
	
	public void ClickOnRegisterLink() {
		driver.findElement(registerLink).click();
	}

	public void registerAccount () {
		driver.findElement(firstName).sendKeys("pooja");
		driver.findElement(LastName).sendKeys("Agrawal");
		driver.findElement(email).sendKeys("Poojaa1253@gmail.com");
		driver.findElement(telephone).sendKeys("9412345678");
		driver.findElement(password).sendKeys("Pooz1234");
		driver.findElement(confirmPassword).sendKeys("Pooz1234");
		driver.findElement(newLetterNo).click();
		driver.findElement(checkbox).click();
		driver.findElement(cotinue).click();	
	}

}
