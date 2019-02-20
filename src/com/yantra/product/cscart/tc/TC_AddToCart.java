package com.yantra.product.cscart.tc;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.product.cscart.po.*;
import com.yantra.product.cscart.po.PO_MyAccount;

public class TC_AddToCart {

	@Test(groups="smoke",description="Validating Add to cart from Search page")
	public void t_01_add_to_cart_from_search_page() throws IOException {
		
	  //*****************************************************
	  //***************Pre-Requisite*************************
	  //*****************************************************
	  BrowserManager oBrowserManager = new BrowserManager();
	  WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	  //Navigate
	  oBrowserManager.NavigateToPage(driver, "https://demo.cs-cart.com"); 
	  PO_MyAccount PO_MyAccount = new PO_MyAccount(driver);
	  
	  PO_MyAccount.LoginInToApp();
	  
	  //*****************************************************
	  //***************Actual Steps**************************
	  //*****************************************************
	  PO_MenuAndHeader PO_MenuAndHeader = new PO_MenuAndHeader(driver);
	  PO_MenuAndHeader.KW_SearchProductFromSearchTextBox("Computer");
	  
	  PO_Search PO_Search = new PO_Search(driver);
	  PO_Search.KW_ClickAndValidateAddToCart(0);
	  
	  
	  

	}//end method
}//end class
