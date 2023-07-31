package com.qa.obero.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.obero.utils.Elementutils;


public class LoginPage {
	//1. Declare private driver
	private WebDriver driver;
	private Elementutils eleUtil;
	//2. create page constructor
	
	public LoginPage (WebDriver driver) {
		this.driver = driver; 
		eleUtil= new Elementutils(driver);
	}
	
	
	private By userId = By.name("uid");
	private By password = By.name("password");
	private By loginBtn =  By.xpath("//input[@name='btnLogin']");
//	private By registerLink =  By.linkText("Register");
	private By reset =  By.name("btnReset");
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
	}
	
	public boolean IsresetLinkPresent() {
		return eleUtil.doIsDisplayed(reset);
	}
	
//	public boolean IsregisterLinkPresent() {
//		return eleUtil.doIsDisplayed(registerLink);
//	}
	
	public AccountsPage doLogin (String un, String pwd) {
		System.out.println("Login with: " + un + " and : " + pwd);
		eleUtil.doSendKeys(userId, un);
		eleUtil.doSendKeys(password, un);
		eleUtil.doActionClick(loginBtn);
		return new AccountsPage(driver);
	}

}
