package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//String xapth_checkbox = "//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input";
		//String xapth_Rowvalue = "//a[text()='Joe.Root']/parent::td/following-sibling::td";
		//a[text()='Joe.Root']/ancestor::tr//input
		 //driver.findElement(By.xpath(xapth_checkbox)).click();
//		 selectEmp("Joe.Root");
//		 System.out.println(getEmpInfo("Joe.Root"));
//		 selectEmp("Jordan.Mathews");
//		 System.out.println(getEmpInfo("Jordan.Mathews"));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//td[text()='windows']/parent::tr[@class='row-2 even']//input")).click();
		 
	}
	
	public static void selectEmp(String EmpName) {
	String xapth_ChkBox = "//a[text()='"+EmpName+"']/ancestor::tr//input";
	driver.findElement(By.xpath(xapth_ChkBox)).click();
	}
	
	public static List<String> getEmpInfo(String EmpName) {
		String xpath_EmpInfo= "//a[text()='"+EmpName+"']/parent::td/following-sibling::td";
		List<WebElement> empInfo = driver.findElements(By.xpath(xpath_EmpInfo));
		List<String> actualInfo = new ArrayList<>();
		for (WebElement e:empInfo ) {
			actualInfo.add(e.getText()) ;
		}
	return actualInfo;
	}

}
