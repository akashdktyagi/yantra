package com.yantra.product.parabank.po;

import org.testng.log4testng.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.yantra.core.interfaces.ILogAndReport;
import com.yantra.core.managers.BrowserManager;

public class PO_LoginPage{ //implements ILogAndReport{
	
	//final Logger logger = Logger.getLogger(BrowserManager.class);
	
	 WebDriver driver;
	 //WebElement o_username = driver.findElement(By.name("username"));
	 @FindBy(how=How.NAME,using="username") 
	 private WebElement txtbx_username;

	 @FindBy(how=How.XPATH,using="//input[@name='password']")
	 private WebElement txtbx_password;
	 
	 @FindBy(how=How.XPATH,using="//input[@class='button']")
	private WebElement btn_Login;
	 
	 public  PO_LoginPage(WebDriver d)
	 {
		 this.driver= d;
		 
	 }
	 
	 //**************************************************************************
	 //**********************Locators Header and Setters*************************
	 //**************************************************************************
	
	 public void SetUsername(String Username) {
		try {
			txtbx_username.sendKeys(Username);
			// WriteLogAndReport(logger, "info", "pass", "User name is set with user: "  + Username);	
		}catch(Exception e) {
			// WriteLogAndReport(logger, "warn", "fail", "Unable to set user name due to exception " + e.getMessage());
		}

	 }
	 public void SetPassword(String password) {
		 try {
			 txtbx_password.sendKeys(password);
			 WriteLogAndReport(logger, "info", "pass", "User name is set with user: "  + password);
		 }catch(Exception e) {
			 WriteLogAndReport(logger, "warn", "fail", "Unable to set password due to exception " + e.getMessage()); 
		 }


	 }
	 public void ClickSubmit() {
		 try {
			 btn_Login.click();
			 WriteLogAndReport(logger, "info", "pass", "Clicked on Login button");
		 }catch(Exception e) {
			 WriteLogAndReport(logger, "info", "fail", "Unable to click on Submit due to exception " + e.getMessage());
		 }


	 }

	 //**************************************************************************
	 //**********************KW level Methods-TO be called in TC*****************
	 //**************************************************************************
	 public void kw_login_into_parabank(String u, String p, boolean isSupposedToBeSuccess) {
		 try {
			 SetUsername(u);
			 SetPassword(p);
			 ClickSubmit();
			 kw_validate_login(isSupposedToBeSuccess);
			 
			 
	 
		 }catch(Exception e) {
			 WriteLogAndReport(logger, "info", "fail", "Unable to login in to the applicaiton due to exception " + e.getMessage());
		 }
	 }
	
	 public void kw_validate_login(boolean isSupposedToBeSuccess) {
		 if (driver.getTitle().contains("ParaBank | Accounts Overview")) {
			 
			 if (isSupposedToBeSuccess) {
				 WriteLogAndReport(logger, "info", "pass", "Login Successfull");
			 }else {
				 WriteLogAndReport(logger, "info", "fail", "Page title is not Account Overview. Login failed");
			 }
			 
		 }else {
			 if (isSupposedToBeSuccess) {
				 WriteLogAndReport(logger, "info", "pass", "Login failed after using incorrect user name.");
			 }else {
				 WriteLogAndReport(logger, "info", "fail", "Failed: Login success after using incorrect user name.");
			 }
		 }//end if
	 }//end method

}//end class


