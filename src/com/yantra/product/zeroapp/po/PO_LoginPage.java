package com.yantra.product.zeroapp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

/*	lnk_
list_
chkbx_
tbl_
*/
public class PO_LoginPage {

	WebDriver driver;
	
	public PO_LoginPage(WebDriver d) {
		this.driver = d;
	}
	
	//Locators
	@FindBy(how = How.ID, using = "user_login") 
	WebElement txtbox_username;
	
	@FindBy(how = How.ID, using = "user_password") 
	WebElement txtbox_password;
	
	@FindBy(how = How.XPATH, using = "//input[@name = 'submit']") 
	WebElement btn_singin;
	
	//Methods
	private void SetUserName(String arg) {
		txtbox_username.sendKeys(arg);
	}
	
	private void SetPassword(String arg) {
		txtbox_password.sendKeys(arg);
	}
	
	private void ClickSignInButton() {
		btn_singin.click();
	}
	
	public void kw_login_in_to_zero_app(String u, String p) {
		SetUserName(u);
		SetPassword(p);
		ClickSignInButton();
		//Reporter.log(z);

		String pageTitleExpected = "Zero - Account Summary";
		String pageTitleActual = driver.getTitle();
		Assert.assertEquals(pageTitleExpected, pageTitleActual,"Log in is not successfull with username as : " 
				+ u + " password: " + p);

	}


}//end class
