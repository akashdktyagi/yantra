package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PO_OpenNewAccount {
	WebDriver driver;
	@FindBy(xpath= "//a[@href='/parabank/openaccount.htm']")
	WebElement newaccount;
	@FindBy(id="type")
	WebElement accounttype;
	@FindBy(id="fromAccountId")
	WebElement minamount;
	@FindBy(xpath="Open New Account")
	WebElement submit;
	 private void clickopennewaccount()
	 {
		 newaccount.click();
		 
	 }
	 private void selectaccounttype()
	 {
		 Select actype= new Select(accounttype);
		 actype.selectByValue("1"); 
	 }
	 private void selectminamount()
	 {
		 Select amount= new Select(minamount);
		 amount.selectByValue("12900");
	 }
	 private void clicksubmit()
	 {
		 submit.click();
	 }
	 public void kw_open_new_account() 
	 {
		 clickopennewaccount();
		 selectaccounttype();
		 clicksubmit();
		 
		 
	 }
	 public  PO_OpenNewAccount(WebDriver d)
	 {
		 this.driver= d;
	 }
	
	
	
	
	
	
	
		
	
		
		

	}


