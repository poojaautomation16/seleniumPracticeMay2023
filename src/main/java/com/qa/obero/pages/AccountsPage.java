package com.qa.obero.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.obero.utils.Constants;
import com.qa.obero.utils.Elementutils;

public class AccountsPage {
        private WebDriver driver;
        private Elementutils eleUtil;
		private By header = By.cssSelector("div#logo a");
		private By accountsSactions = By.cssSelector("div#content h2");
		private By searchField = By.name("search");
		private By searchButton = By.cssSelector("div#search button");
		private By logoutLink = By.linkText("logout");
		
		public AccountsPage(WebDriver driver) {
			this.driver = driver;
			eleUtil = new Elementutils(driver);
		}
		
		public String getAccountPageTitle() {
			return eleUtil.doGetTitle(Constants.ACCOUNT_PAGE_TITLE, Constants.Default_TIME_OUT);
		}
		
		public String getAccountsPageHeader() {
			return eleUtil.doGetText(header);
		}
		
		public List<String> eleUtil() {
			List<WebElement> accSecList = eleUtil.waitForElementsToBeVisible(accountsSactions, 10);
			List<String> accSecValList = new ArrayList<String>();
			for (WebElement e:accSecList) {
				String text =e.getText();
				accSecValList.add(text);
			}
			return accSecValList;
		}
		
		public boolean isSearchExist() {
		return	eleUtil.doIsDisplayed(searchField);
		}

		public SearchResultPage doSearch(String ProductName) {
			System.out.println("Searching the Product:  " + ProductName );
			eleUtil.doSendKeys(searchField, ProductName);
			eleUtil.doClick(searchButton);
			return new SearchResultPage(driver);
		}
	

}
