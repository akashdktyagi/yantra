package com.yantra.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class PO_MyAccount {

	WebDriver driver;
	@FindBy(how = How.XPATH,using="//*[@class = 'ty-icon-down-micro ty-account-info__user-arrow']")
	WebElement ticker_my_account_arrow;
	
	@FindBy(how = How.ID,using="account_info_4")
	WebElement txt_container_account_info_pop_up;

	//Click on the Element
	public PO_MyAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void ClickOnMyAccountTicker() {
		ticker_my_account_arrow.click();
		boolean actual = txt_container_account_info_pop_up.isDisplayed();
		boolean expected = true;
		Assert.assertEquals(actual,expected,
				"Pop Up did not Open after clicking on My Account Ticker");
		Reporter.log("My Account Pop Up is displayed."+ "<br>", true);	
	}
	
	
}
