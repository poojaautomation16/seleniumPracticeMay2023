package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropdwonWithSelectClass {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//selenium 4.0 feature
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		

	}

}
