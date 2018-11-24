package com.yantra.product.cscart.tc;

import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.core.managers.CmnMethods;
import com.yantra.core.managers.ExcelManager;
import com.yantra.core.managers.UIManager;
import com.yantra.product.cscart.po.PO_MyAccount;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
//Akash made this chnage just now
public class TC_SmokeTest {
	
 @Test(groups="smoke",description="Smoke Test For Login",enabled=false)
  public void t_cs_cart_smoke_test_1_login() throws IOException {
	 try {

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
  
 @Test(dataProvider="SearchItem",groups="smoke",description="Smoke Test For Search funtionality")
 public void t_cs_cart_smoke_test_search_multiple_products(String product) throws IOException {
	 
	 System.out.println(product);
	 /*
	  BrowserManager oBrowserManager = new BrowserManager();
	  WebDriver driver = oBrowserManager.GetBrowser("chrome");

	  //Navigate
	  oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
	  PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);
	  
	  //Click on My Account Ticker
	  PO_MyAccount.ClickOnMyAccountTicker();
	  
	  //Sign in to the CS Cart
	  PO_MyAccount.SignInToCSCart();
	  */
 
 }
 
 @DataProvider(name = "SearchItem")
 public Object[][] ProductsSearchItems() throws Exception{
	 
	 String[][] products = new String[3][1];
	 String[][] products_poi = null;
	 
	 products[0][0] = "Computer";
	 products[1][0] = "Laptop";
	 products[2][0] = "Mobile";
	 
	 //Use Poi to etract data
	 products_poi = ExcelManager.getTableArray("E:\\_AkashStuff\\Automation\\EclipseWorkspace\\yantra\\data\\cscart\\CSCartProducts.xlsx", "Sheet1");
	 
	 //return products;
	 return products_poi;
	 
	 //using Poi
 }
 
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
