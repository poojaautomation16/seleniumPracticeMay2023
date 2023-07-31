package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpnew {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		//give both username and password separated by : then followed by @url
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//inspect the button which is responsible to upload the file
		//it should have type=file
		driver.findElement(By.name("upfile")).sendKeys("filepath");
		
		//what if file=type is not available
		//1- ask dev team to add this attribute
		//2. robot class- not recommend --only for windows. won't work for linux , mac , docker, cloud, jenkis, headless
		//3. auto it is a tool whoch can be integratd with selenium.but it is not recommended as it will not works on cloud, jenkins, grid,headless.
		//4.sikuli- sikuli has one jar which can be added but not recommended as it is based on image.
		
	}

}
