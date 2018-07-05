package com.yantra.product.parabank.po;

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
	 
	 private void SetUsername(String Username) {
		 txtbx_UserName.sendKeys("john");
	 }
	 private void SetPassword(String password) 
	 {txtbx_Password.sendKeys("demo");
		 
	 }
	 private void clickSubmit()
	 {btn_Login.click();
		 
	 }
	 
	 public void kw_login_into_parabank(String u, String p) {
		 SetUsername(u);
		 SetPassword(p);
		 clickSubmit();
		 
	 }
	 public  PO_LoginPage(WebDriver d)
	 {
		 this.driver= d;
	 }


		}


