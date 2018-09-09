package dev.backup.kalyani.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.kalyani.reusables.WebDriverManager;

public class TC_Find_Transaction 
{
	WebDriver driver;
	  @Test
	  public void t_01_validate_find_transaction_by_id()
	  {
		  WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
		  
		  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		  PO_Find_Transaction  po_find_transaction= PageFactory.initElements(driver, PO_Find_Transaction .class);
		  PO_Generic  po_generic=PageFactory.initElements(driver, PO_Generic.class);
		  
		  
		  PO_login.loginintoapplication(driver);
		  
		  po_generic.Click_On_find_Transaction_link();
		  po_find_transaction.SelectAccountId();
		  po_find_transaction.SetTransactionIdTextbox("12589");
		  po_find_transaction.Click_On_Find_Transaction();
	  }
	  
	  @Test
	  public void t_02_validate_invalid_transaction_id()
	  {
		  WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
		  
		  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		  PO_Find_Transaction  po_find_transaction= PageFactory.initElements(driver, PO_Find_Transaction .class);
		  PO_Generic  po_generic=PageFactory.initElements(driver, PO_Generic.class);
		  
		  
		  PO_login.loginintoapplication(driver);
		  
		  po_generic.Click_On_find_Transaction_link();
		  po_find_transaction.SelectAccountId();
		  po_find_transaction.SetTransactionIdTextbox("114");
		  po_find_transaction.Click_On_Find_Transaction();
	  
		   
	  }

}
