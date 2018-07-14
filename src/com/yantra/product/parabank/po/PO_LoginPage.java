package com.yantra.product.parabank.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_LoginPage {
	WebDriver driver;
	 @FindBy(how=How.XPATH,using="//input[@name='username']")
	 private WebElement txtbx_UserName;

	 @FindBy(how=How.XPATH,using="//input[@name='password']")
	 private WebElement txtbx_Password;
	 
	 @FindBy(how=How.XPATH,using="//input[@class='button']")
	private WebElement btn_Login;
	
	 @FindBy(how=How.CLASS_NAME,using="title")
	 private WebElement txt;
	
	 private void SetUsername(String Username) {
		 txtbx_UserName.sendKeys(Username);
	 }
	 private void SetPassword(String password) 
	 {txtbx_Password.sendKeys(password);
		 
	 }
	 private void clickSubmit()
	 {btn_Login.click();
		 
	 }
	 private String Gettext()
	 {
		 return txt.getText();
	 }
	 
	 public void kw_login_into_parabank(String u, String p) {
		 SetUsername(u);
		 SetPassword(p);
		 clickSubmit();
		 Gettext();
	 }
	 
	 public  PO_LoginPage(WebDriver d)
	 {
		 this.driver= d;
		 
	 }
	 
	 public void kw_validate_login_success()
	 {
		
		  String a=Gettext();
		 if(a.equalsIgnoreCase("Accounts Overview"))
		 {
			 System.out.println("We are in login page");
		 }
		 else
		 {
			 System.out.println("Invalid Username or Password");
		 }
	 }


		}


