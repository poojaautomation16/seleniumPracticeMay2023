package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScore {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.get("https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-1377006/full-scorecard");
		Thread.sleep(5000);
		System.out.println(findWicketTakerName("Johnson Charles"));
		System.out.println(findScroeCardofBatsman("Johnson Charles"));
		System.out.println(findWicketTakerName("Shamarh Brooks"));
		System.out.println(findScroeCardofBatsman("Shamarh Brooks"));
		System.out.println(findWicketTakerName("Keacy Carty"));
		System.out.println(findScroeCardofBatsman("Keacy Carty"));
		System.out.println(findWicketTakerName("Roston Chase"));
		System.out.println(findScroeCardofBatsman("Roston Chase"));
	
	
	}
	
	public static String findWicketTakerName(String BatsmanName) {
		String xapth= "//span[text()='"+BatsmanName+"']/ancestor::td/following-sibling::td//span/span";
		String WicketTakerName = driver.findElement(By.xpath(xapth)).getText();
		return WicketTakerName;
	}
	
	public static List<String> findScroeCardofBatsman(String BatsmanName) {
	String scoreList_xapth = "//span[text()='"+BatsmanName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]";
	List<WebElement> ListofScrore= driver.findElements(By.xpath(scoreList_xapth));
	List<String> actulList = new ArrayList<>();
	System.out.println(ListofScrore.size());
	for (WebElement e: ListofScrore) {
		String score= e.getText();
		actulList.add(score);	
	}
	return actulList;
	}

}
