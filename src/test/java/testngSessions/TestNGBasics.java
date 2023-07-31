package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

// global pre-condition
//pre-condition
//test steps + expected vs Actual result --> assertion-->pass/fail
//post steps

	@BeforeSuite
	public void connectWithDataBase() {
	System.out.println("Connect with database");	
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT - create USer");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launch Browser");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM - login To App");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Test - search Test");
	}
	
	@Test
	public void cartTest() {
		System.out.println("Test - cart Test");
	}
	
	@AfterMethod
	public void logoutfromApp() {
		System.out.println("AM - logoutfromApp");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - Close Browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - Delete User");
	}
	
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS - CloseDBConnection");
	}

}
