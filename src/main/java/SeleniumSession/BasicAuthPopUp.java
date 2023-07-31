package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String username ="admin";
		String password ="admin";
		
		driver = new ChromeDriver();
		//give both username and password separated by : then followed by @url
		driver.get("https://"+"username"+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//basic auth??
		//username: password --> encoded String
		//btoa("username:password")--> 
		//if your password has @ in it. this will not work. so we will have to create a dummy
		//username and password without @
		
	}

}
