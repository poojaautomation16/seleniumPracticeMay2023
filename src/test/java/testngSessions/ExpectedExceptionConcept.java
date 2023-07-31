package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name ;
	
	@Test(expectedExceptions = {ArithmeticException.class , NullPointerException.class})
	public void searchTest() {
		System.out.println("Test - search Test");
		int i = 9/0; // AE
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj =null;
		obj.name = "naveen"; //NPE
	}
	
	@Test (priority =2)
	public void cartTest() {
		System.out.println("Test - cart Test");
	}
	
	@Test (priority =3)
	public void orderTest() {
		System.out.println("Test - Order Test");
	}
	
	
	

}
