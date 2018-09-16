package com.yantra.product.zeroapp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_HomePage {
	//**************************************************************
	//***********************INITIALIZE*****************************
	//**************************************************************
	WebDriver driver;
	
	public PO_HomePage(WebDriver d) {
		this.driver = d;
	}
	
	//**************************************************************
	//***********************LOCATORS INFO**************************
	//**************************************************************
	@FindBy(how = How.ID, using = "signin_button")
	WebElement btn_signin;
	
	
	//**************************************************************
	//***********************METHODS INFO**************************
	//**************************************************************
	public void ClickOnSignInButton() {
		btn_signin.click();
	}
	
	
	
}
