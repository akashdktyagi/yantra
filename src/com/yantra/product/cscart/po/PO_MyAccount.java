package com.yantra.product.cscart.po;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.yantra.core.managers.CmnMethods;
import com.yantra.core.managers.UIManager;

public class PO_MyAccount {

	WebDriver driver;
	UIManager oUIManager = new UIManager();
	@FindBy(how = How.XPATH,using="//*[@class = 'ty-icon-down-micro ty-account-info__user-arrow']")
	WebElement ticker_my_account_arrow;
	
	@FindBy(how = How.ID,using="account_info_4")
	WebElement txt_container_account_info_pop_up;
	
	@FindBy(how = How.LINK_TEXT,using="Sign in")
	WebElement link_my_account_sign_in;
	
	@FindBy(how = How.ID,using="ty-login-popup")
	WebElement txt_container_login_pop_up;
	
	@FindBy(how = How.XPATH,using="//button[@class='ty-btn__login ty-btn__secondary ty-btn']")
	List<WebElement> btn_sign_in_from_sign_in_pop_up;
	
	@FindBy(how = How.XPATH,using="//div[@class='cm-notification-container notification-container']")
	WebElement txt_notification_container;

	
	

	//Click on the Element
	public PO_MyAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void ClickOnMyAccountTicker() {
		oUIManager.ClickElement(ticker_my_account_arrow);
		boolean actual = txt_container_account_info_pop_up.isDisplayed();
		boolean expected = true;
		Assert.assertEquals(actual,expected,
				"Pop Up did not Open after clicking on My Account Ticker");
		CmnMethods.WriteLog("info"," My Account Pop Up is displayed.");	
	}
	
	
	public void SignInToCSCart() {
		CmnMethods.WriteLog("info","Trying to Sign in ");
		oUIManager.ClickElement(link_my_account_sign_in);
		//boolean actual = txt_container_login_pop_up.isDisplayed();
		//boolean expected = true;
		//Assert.assertEquals(actual,expected,
		//		"Pop Up did not Open after clicking on Sign In Button");
		//Reporter.log("INFO: Sign In Pop up is displayed."+ "<br>", true);


		oUIManager.ClickElement(btn_sign_in_from_sign_in_pop_up.get(1));
		
		WebDriverWait wait = new WebDriverWait(driver,20000);
		//wait.until(ExpectedConditions.textToBePresentInElement(txt_notification_container, "You have been successfully logged in"));
	
		
		String actual1 = oUIManager.GetElementText(txt_notification_container);
		String expected1  = "You have been successfully logged in.";
	
		if (actual1.contains(expected1)) {
			CmnMethods.WriteLog("Pass","Sign In Successfull.");
		}else {
			CmnMethods.WriteLog("Fail","Login Failed.Actual: " + actual1 + " Expected: "+ expected1 );
			Assert.fail("Fail: Login not succuessfull");
			String filepath = oUIManager.TakeScreenShot(driver);
			CmnMethods.WriteLog("fail", "<a href='" + filepath + "'> Click Here for Screen shot</a>");

		}

	}//end method
	
}//end class
