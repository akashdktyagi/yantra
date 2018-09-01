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
	
	 @FindBy(how=How.CLASS_NAME,using="title")
	 private WebElement txt_account_overview_header;

	//*******************************************************************
	//*************************Elements Getter and Setters***************
	//*******************************************************************
	

	
	//*******************************************************************
	//*************************KW Level Methods**************************
	//*******************************************************************
	
}
