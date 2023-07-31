package SeleniumSession;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.lib.util.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test123");
		userMap.put("doctor", "peter@gmail.com_test2345");
		
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys(userMap.get("admin").split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(userMap.get("admin").split("_")[1]);
		String key = getkeyfromExcel(0,2);
		System.out.println(key);
		String cradential = getCredentialsfromExcel(0,2);
		System.out.println(cradential);
		

	}
	
	public static String getkeyfromExcel(int column, int row) {
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/TestingData.xlsx");
        String sheetName ="login";
        String key = reader.getCellData(sheetName, column, row);
        System.out.println("key is: " + key);
        return key;
	}
	
	public static String getCredentialsfromExcel(int column, int row) {
		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/TestingData.xlsx");
        String sheetName ="login";
        String value = reader.getCellData(sheetName, column+1, row);
        System.out.println("value is: " + value);
        return value;
	}
	
	public Map<String, String> getUserMap() {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin_admin");
		userMap.put("patient", "tom@gmail.com_test123");
		userMap.put("doctor", "peter@gmail.com_test2345");
		return userMap;
	}

}
