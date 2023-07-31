package SeleniumSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
   private WebDriver driver;
   Actions act;
   
   public ElementUtil(WebDriver driver){
	   this.driver = driver;
	   act =new Actions(driver);
   }
   
   public By getByMethod(String Selector, String LocatorType) {
		By locator = null;
		switch(LocatorType.toLowerCase()){
		case "id":
			locator = By.id(Selector);
			break;
		case "css":
			locator = By.cssSelector(Selector);
			break;
		case "name":
			locator = By.name(Selector);
			break;
		case "LinkText":
			locator = By.linkText(Selector);
			break;
		case "class":
			locator = By.className(LocatorType);
			break;
		case "xpath":
			locator = By.xpath(LocatorType);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(LocatorType);
			break;
		case "tagname":
			locator = By.tagName(LocatorType);
			break;
		
		default:
			break;
		}
	return locator;	
	}
	
    public void doclick(By Locator) {
		getElement(Locator).click();
	}
	
    public void doClick(String locatorType, String Selector) {
		By Locator =getByMethod(locatorType,Selector );
		getElement(Locator).click();
	}
	
	public void doSendKeys(By Locator, String value) {
		if (value ==null) {
			System.out.println("Value can not be null while using sendkeys method");
			throw new FrameworkException("ValueCanNotBeNUll");
		}
		getElement(Locator).sendKeys(value);
	}
	
	public void doSendKeys(String LocatorType, String Selector, String value) {
		By Locator = getByMethod(Selector, LocatorType);
		getElement(Locator).sendKeys(value);
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element =driver.findElement(locator);
		}
		catch (NoSuchElementException e) {
        	System.out.println("getting element exception: please check your locator");
            e.printStackTrace()	;
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
            element =driver.findElement(locator);
        }
		return element;
	}
	
	public String doElementGetText(By Locator) {
		String text= getElement(Locator).getText();
		System.out.println("Element Text is: " + text);
		return text;
	}

	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String getAttributes (By locator, String AttrName) {
		String Attributename = getElement(locator).getAttribute(AttrName);
		return Attributename;
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<WebElement> getElements(By locator) {
	return	driver.findElements(locator);
	}
	
	public WebElement getLinkElementbyText(String text) {
		return driver.findElement(By.linkText(text));
	}
	
	public List<String> getElementText(By locator) {
		List<WebElement> list = getElements(locator);
		List<String> textlist = new ArrayList<String>();
		for(WebElement e:list ) {
			String text =e.getText();
			if(!text.isEmpty()) {
				textlist.add(text);
			}
		}
		return textlist;
	}
	
	public void clickonElementfromList(By locator, String linkText) {
		List<WebElement> listofLinks = getElements(locator);
		System.out.println("total no of links: " + listofLinks.size());
		for(WebElement e:listofLinks ) {
			String text =e.getText();
			System.out.println(text);
			if(text.equals(linkText)) {
				e.click();
				break;
			}
		}
	}
//******************dropdwon Utils*******************************************
	public List<String> getDropdownTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList= select.getOptions();
		List<String> actualList = new ArrayList<>();
		System.out.println(optionsList.size());
		for (WebElement e : optionsList) {
			actualList.add(e.getText());
		}
		return actualList;
	}
	
	public int getDropdownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList= select.getOptions();
		return optionsList.size();
	}

	public void doSelectDropDownByIndex(By locator, int index) {
		if (index<0) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator, String value) {
		if (value == null) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByValue(value);
	}
	
	public void doSelectDropDownByVIsibleText(By locator, String text) {
		if (text == null) {
			System.out.println("please pass the right (+ve) index");
			return; //return nothing
		}
		WebElement e = getElement(locator);
		Select select = new Select (e);
		select.selectByVisibleText(text);
	}
	
	public void doSelectDropdownValue(By locator, String dropdownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList= select.getOptions();
		
		for (WebElement e: optionsList) {
			String listtext = e.getText();
			System.out.println(listtext);
			if (listtext.equals(dropdownValue)) {
				e.click();
				break;
			}
		}
	}

	public void doSelectDropdownValueUsingLocator(By locator, String dropdownValue) {
		List<WebElement> optionsList= driver.findElements(locator);
		for (WebElement e: optionsList) {
			String listtext = e.getText();
			System.out.println(listtext);
			if (listtext.equals(dropdownValue)) {
				e.click();
				break;
			}
		}

	}
	//******************Actions Utils*******************************************
	
	public void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}
	
	public void doActionsSendKeys(By locator, String Text) {
		act.sendKeys(getElement(locator),Text ).perform();
	}
	
	public void selectRightClickOption(By ContextMenuLocator, String Optiontext) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(ContextMenuLocator)).perform();
	    By locator = By.xpath("//*[text()='"+Optiontext+"']");
	    doclick(locator);  
	}
	
	public void twoLevelMenuHandling(By levelOneLocator, By LevelTwoLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(levelOneLocator)).perform();
		Thread.sleep(1500);
		doclick(LevelTwoLocator);	
	}
	
	public void multiLevelMenuHandling(By Lev1Locator, String lev2, String lev3, String lev4) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(Lev1Locator)).perform();
		Thread.sleep(2000);
		act.moveToElement(getLinkElementbyText(lev2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getLinkElementbyText(lev3)).perform();
		Thread.sleep(1000);
		getLinkElementbyText(lev4).click();
	}
	
	//**********************************wait utils************************************
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible. 
	 * 
	 */
	public WebElement waitforElementPresence(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}
	
	public WebElement waitforElementPresence(By Locator, int timeout, int pollingTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofSeconds(pollingTime) );
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a 
	 * page and visible. Visibility means that the element is not only displayed 
	 * but also has a height and width that is greater than 0.
	 */

	public WebElement waitforElementVisible(By Locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	public WebElement waitforElementVisible(By Locator, int timeout, int pollingtime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout),Duration.ofSeconds(pollingtime) );
		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	public boolean isPageLoaded(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		String flag =wait.until(ExpectedConditions.jsReturnsValue("return document.readyState =='complete'")).toString();
	    return Boolean.parseBoolean(flag);
	}
	
	public String waitForTitleContains(String titleFraction, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		 }
		 else {
			 System.out.println(titleFraction + " is not present in title");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(titleFraction + " is not present in title");
			e.printStackTrace();
			return null;
		 }
	}
	
	public String waitForTitleIs(String title, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		 }
		 else {
			 System.out.println(title + " is not present in title");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(title + " is not present in title");
			e.printStackTrace();
			return null;
		 }
	}
	
	public String waitForurlContains(String urlFraction, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		 }
		 else {
			 System.out.println(urlFraction + " is not present in URL");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(urlFraction + " is not present in URL");
			e.printStackTrace();
			return null;
		 }
	}
	
	public String waitForURLToBe(String url, int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 try {
		 if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getCurrentUrl();
		 }
		 else {
			 System.out.println(url + " is not present in URL");
			 return null;
		 }
		 }
		 catch (Exception e){
			System.out.println(url + " is not present in URL");
			e.printStackTrace();
			return null;
		 }
	}

	//*****************************Fluent wait***************************************
	public WebElement waitforElementVisibleWithFluentWait(By locator, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("---time out is done...Element is not found.." + locator);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitforElementPresenceWithFluentWait(By locator, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("---time out is done...Element is not found.." + locator);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public Alert waitforJSAlertWithFluentWait( int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...JS Alert is not found.." );
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public WebDriver waitforFrametWithFluentWait(String frameId, int timeout, int pollingtime ) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---time out is done...Frame is not found.." +frameId );
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
	}
	
//******************************Custom wait***************************
	
	public WebElement retryingElement(By locator, int totalAttempts, int pollingtime) {
		WebElement element = null;
		int attempts= 0;
		while (attempts<totalAttempts) {
			try {
			element=getElement(locator);
			System.out.println("Element is found..... " + locator + " in " +attempts + " attempts" );
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element is not found........" + locator + " in " +attempts + " attempts");
				try {
					Thread.sleep(pollingtime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				attempts++;
			}
			
		}
		if (element==null) {
			System.out.println("Element is not found........tried for  " + totalAttempts + " with the interval of "+ pollingtime  + " milliSec");
		}
		return element;
	}
	
	
	
	public WebElement retryingElement(By locator, int totalAttempts) {
		WebElement ele = null;
		int attempts =0;
		while (attempts<totalAttempts) {
			try {
			ele=getElement(locator);
			System.out.println("Element is found........" + ele + "in attempts " + attempts);
			break;
			}
			catch(NoSuchElementException e) {
				System.out.println("Element is not found........" + ele + "in attempts " + attempts);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if (ele==null) {
			System.out.println("Element is not found........in " +totalAttempts+ "attempts ");
		}
		return ele;
	}
	
}
