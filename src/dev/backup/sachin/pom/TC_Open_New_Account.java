package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC_Open_New_Account
{
  @Test
  public void t_01_validate_open_new_account() 
  {

	     WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
		 
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		 PO_Open_New_Account po_open_new_acc=PageFactory.initElements(driver, PO_Open_New_Account.class);
		 PO_Generic po_Generic=PageFactory.initElements(driver, PO_Generic.class);
		 
		
		
		 po_login.loginintoapplication(driver);
		 po_Generic.Click_On_Open_New_Account_link();
		 //po_open_new_acc.InitopenNewAccount(driver);
		 
		 po_open_new_acc.Select_Account_Type();
		 po_open_new_acc.Select_from_Acc();
		 po_open_new_acc.ClickOn_Open_New_Account();
		// po_open_new_acc.ClickOnNewAccountNo();
  }
  
  @Test
 public void t_02_validate_new_acc_details()
 {
	  WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
		 
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		 PO_Open_New_Account po_open_new_acc=PageFactory.initElements(driver, PO_Open_New_Account.class);
		 PO_Generic po_Generic=PageFactory.initElements(driver, PO_Generic.class);
		 
		 po_login.loginintoapplication(driver);
		 po_Generic.Click_On_Account_No();
 }
 
}



		 
	  
  

