package SeleniumSession;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingIOptions {

	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		//1. valid but not recommended
        SearchContext sc = new ChromeDriver();
     //2. valid but recommended
        WebDriver driver = new ChromeDriver();
     //3. valid but recommended
       RemoteWebDriver dr =new ChromeDriver();
       //3. valid only for chrome/edge
       ChromiumDriver dri =new ChromeDriver();
       dri = new EdgeDriver();
       
     //5. valid and recommended -- used for remote execution/selenium grid/cloud/docker-aws/browser stack/LT
     //  WebDriver driver1 = new RemoteWebDriver(remoteAddress, capabilities);
      
       //not valid coz both are interface
       //SearchContext sc1 = new WebDriver();
      
       //6.valid but not recommended.
      // SearchContext sc1 = new RemoteWebDriver(remoteAddress, capabilities);
       
       
	}

}
