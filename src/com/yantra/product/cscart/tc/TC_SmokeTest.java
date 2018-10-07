package com.yantra.product.cscart.tc;

import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.core.managers.CmnMethods;
import com.yantra.core.managers.UIManager;
import com.yantra.product.cscart.po.PO_MyAccount;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TC_SmokeTest {
	
 @Test(groups="smoke",description="Smoke Test For Login")
  public void t_cs_cart_smoke_test_1_login() throws IOException {
	 try {
		  
		  //Browser init
		  BrowserManager oBrowserManager = new BrowserManager();
		  WebDriver driver = oBrowserManager.GetBrowser("chrome");

		  //Navigate
		  oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
		  PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);
		  
		  //Click on My Account Ticker
		  PO_MyAccount.ClickOnMyAccountTicker();
		  
		  //Sign in to the CS Cart
		  PO_MyAccount.SignInToCSCart();
		  
	 }catch(Exception e) {
		 CmnMethods.WriteLog("fail", "Test Failed.");
		 Assert.fail("TC failed due to exception", e);
	 }

  
  }//end method
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
