package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PO_OpenNewAccount {

	WebDriver driver;
	//@FindBy(xpath= "//a[@href='/parabank/openaccount.htm']")
	//private WebElement newaccount;
	@FindBy(id="type")
	private WebElement accounttype;
	@FindBy(id="fromAccountId")
	private WebElement minamount;
	@FindBy(xpath="Open New Account")
	private WebElement submit;
	// private void clickopennewaccount()
	 
	 private void selectaccounttype(String visibletext )
	 {
		 Select actype= new Select(accounttype);
		 actype.selectByVisibleText(visibletext);
	 }
	 private void selectminamount(String val)
	 {
		 Select amount= new Select(minamount);
		 amount.selectByValue(val);
	 }
	 private void clicksubmit()
	 {
		 submit.click();
		 
		 
	 }
	 public void kw_open_new_account(String visibletext1, String val ) 
	 {
		// clickopennewaccount();
		 selectaccounttype(visibletext1);
		 selectminamount(val);
		 clicksubmit();
		 
		 
	 }
	 public  PO_OpenNewAccount(WebDriver d)
	 {
		 this.driver= d;
	 }
	
	
	
	
	
	
	
		
	
		
		

	}


