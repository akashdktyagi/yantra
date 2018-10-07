package com.yantra.product.zeroapp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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
		String pageTitleActual = driver.getTitle();
		String pageTitleExpected = "Zero - Log in";
		Assert.assertEquals(pageTitleActual, pageTitleExpected,
				"Page is not able to navigate to Log in page after clicking in Sign In button");
	}
	
	
	
}
