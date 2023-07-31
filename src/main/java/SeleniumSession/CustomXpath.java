package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        //Xapth: address of the element in htm dom
		//1.Absolute Xapth //html/body/div/div/div[2]/ui/li[4]/a :- not reliable xapth and if 
		//there is change in the dom structure or update.it can affect the absolute xpath.
		
		//2.relative xapth/custom xpath [-> using attributes, using xapth functions , using paratn sibling concept
		
		//htmltag[@attributename='value']
		
		
		//htmltag[@attribute1='value' and @attribute2='value']
		
		//htmltag[@attribute1 and @attribute2 and @attribute3]
		
		//contains() in xapth:
		//htmltag[contains(@attribute,'value')]
		//input[contains(@id,'username')]
		//if you have a long value:
		//dynamic attributes <input id='test_123'>
		//input[contains(@id,'test_')] as id is dyanmic for the above element
		//contains with attr1 and attr2 without contains:
		//htmltag[contains(@attribute,'value') and @attr2='value']
		//input[contains(@type,'email') and @id='username']
		
		//text in xapth:
		//htmltag[text()='value']
		//h1[text()='Register Account']
		//span[text()='Trusted by 60,000+ businesses of all sizes']
		
		
		//text with contains
		//htmaltag[contains(text(),'value')]
		//span[contains(text(),'businesses ')]
		
		//text() with @attr
		//htmltag[text()='' and @attr='value']
		//a[text()='Login' and @class='list-group-item']
		
		//text with contains and attr1 with contains and att without contains:
		//htmltag[contains(text(),'') and contains(@attr,'value') and @attr='value']
		//a[contains(text(),'Login')  and contains(@href,'') and @class='list-group-item']
		
		
		//index position in xapth: 
		//(//input[@class='form-control'])[1]
		//(//input[@class='form-control'])[position()=1] :->position() is a function wich can also be used for indexing
		//(//input[@class='form-control'])[last()] :-> last() is a function which takes us to the last element of the list.
		//(//input[@class='form-control'])[last()-1] it will take us to the 2nd last element
		
		//((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		//((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[last()]
	    //((//div[@class='navFooterLinkCol navAccessibility'])[1]//a)[1]
		
		//parent to child:
		//parent /child: direct child :- //select[@name='Country']/option
		//parent //child : direct + indirect child :-//div[@class='footer-main']//a
		  //form//input[@id='username']
		
		//child to parent
		//input[@id='username']/.. (/.. takes you to immediate parent)
		//input[@id='username']/../../../../../../../../../..
		//input[@id='username']/parent::div
		//option[contains(text(),'Country')]/parent::select
		
		//child to grandparent
		//input[@id='username']/ancestor::form
		//option[contains(text(),'Country')]/ancestor::div[@class='middleColumn']
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		//a[text()='Joe.Root']/ancestor::tr//input
		
		//a[text()='Joe.Root']/parent::td/following-sibling::td
		//label[text()='First Name']/following-sibling::div/input
		
		
	}

}
