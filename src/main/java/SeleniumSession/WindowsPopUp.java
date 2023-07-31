package SeleniumSession;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it= windowHandles.iterator();
		
		String	Praentwindow = it.next();
		String	childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		driver.close();
		driver.switchTo().window(Praentwindow);

	}

}
