package testngSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority =-1)
	public void searchTest() {
		System.out.println("Test - search Test");
	}
	
	@Test (priority =2)
	public void cartTest() {
		System.out.println("Test - cart Test");
	}
	
	@Test (priority =3)
	public void orderTest() {
		System.out.println("Test - Order Test");
	}
	
	@Test 
	public void paymentTest() {
		System.out.println("Test - payment Test");
	}
	
	@Test 
	public void emailTest() {
		System.out.println("Test - email Test");
	}
	
	

}
