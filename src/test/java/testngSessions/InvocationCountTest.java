package testngSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 3)
	public void searchTest() {
		System.out.println("Test - search Test");
	}
	
	@Test ()
	public void cartTest() {
		System.out.println("Test - cart Test");
	}
	
	@Test ()
	public void orderTest() {
		System.out.println("Test - Order Test");
	}
	
}
