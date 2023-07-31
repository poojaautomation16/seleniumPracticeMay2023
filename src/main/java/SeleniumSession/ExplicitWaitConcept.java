package SeleniumSession;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
	//Explicit Wait:
		//1. WebdriverWait
		//2.Fluent wait
		
		//WebDriverWait(c)--> fluent wait(c)--> wait (I): until();
        // inherit from      //until(){} + other methods
		   //Fluentwait no indivisual method 
		
		//not a global wait. it will be applied for a specific element
		//can be applied for non webElements (title, url, alert, frames)
		//various conditions have been given, which are called expected condition
		
		//webdriver is the child of fluent wait. so webdriver wait is kind of fluent wait as it inheriting the properties of fluent wait
		
		              
	}

}
