package com.qa.obero.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public Properties prop;
	/**
	 * This method is used to initilize the webdriver
	 * @param BrowserName
	 * @return this will return the driver
	 */
	public WebDriver init_driver(String browser) {
		
		System.out.println("Browser Name is: " +browser );
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();}
			else {
				System.out.println("Please pass on the correct browser");}
			
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("http://www.demo.guru99.com/V4/");
	return driver;
	}
/**
 * This method is used to initilize the property 
 * @return this method will return properties prop reference.
 */
	
	public Properties init_property() {
		prop = new Properties ();
		try {
			FileInputStream ip = new FileInputStream("./Resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
		return prop;
	}
		

}
