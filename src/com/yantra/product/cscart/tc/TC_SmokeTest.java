package com.yantra.product.cscart.tc;

import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
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
		 
		  BrowserManager oBrowserManager = new BrowserManager();
		  WebDriver driver = oBrowserManager.GetBrowser("chrome");
		  oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
		  PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);
		  PO_MyAccount.ClickOnMyAccountTicker();
		  UIManager oUIManager = new UIManager();
		  
		  //Taking Screen shot and attaching it to the Test NG report
		  String filePath = oUIManager.TakeScreenShot(driver);
		  Reporter.log("<a href='" + filePath + "'> Click Here for Screen shot</a>");
	 }catch(Exception e) {
		 Assert.fail("TC failed due to exception", e);
	 }

  
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
