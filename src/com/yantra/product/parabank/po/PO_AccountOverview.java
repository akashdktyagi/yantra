package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * @author: Akash
 * Date: 7/11/2018
 */
public class PO_AccountOverview {

	WebDriver driver;
	
	public PO_AccountOverview(WebDriver driver) {
		this.driver = driver;
	}
	
	//*******************************************************************
	//*************************Locators**********************************
	//*******************************************************************
	@FindBy(how=How.ID,using="accountTable")
	private WebElement tbl_account_overview;

	//*******************************************************************
	//*************************Elements Getter and Setters***************
	//*******************************************************************
	private WebElement getAccountOverViewTableContentInMap() {
		
		return tbl_account_overview;
	}

	
	//*******************************************************************
	//*************************KW Level Methods**************************
	//*******************************************************************
	
}
