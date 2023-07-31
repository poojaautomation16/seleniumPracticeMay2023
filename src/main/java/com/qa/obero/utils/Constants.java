package com.qa.obero.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
	public final static String LOGIN_PAGE_TITLE = "Guru99 Bank Home Page";
	public final static String ACCOUNT_PAGE_TITLE = "My Account";
	public final static String LOGIN_PAGE_URL_FRACTION = "guru99";
	public final static int Default_TIME_OUT = 5;
	
	public static List<String> GetExpectedList() {
		List<String> expList = new ArrayList<String>();
		expList.add("My Account");
		expList.add("My Orders");
		expList.add("My Affiliate Account");
		expList.add("NewsLetter");
		return expList;
	}

}
