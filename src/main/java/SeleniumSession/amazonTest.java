package SeleniumSession;

public class amazonTest {

	public static void main(String[] args) {
		
		BrowserUtils utils = new BrowserUtils();
		utils.initDriver("chrome");
		utils.launchUrl("https://www.amazon.com");
		if(utils.isURlFractionEsist("amazon")){
			System.out.println("url is correct");
		}
		else {
			System.out.println("url is incorrect");
		}
		utils.getTitle();
		if(utils.isInfoExistINPageSource("https://completion.amazon.com")){
			System.out.println("page source conatins the link: " + "https://completion.amazon.com" );
		}
		else {
			System.out.println("fail");
		}
		utils.closeBrowser();
		
		
		
		
		
		
	}

}
