package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class TC_Account_Activity 
{
	WebDriver driver;
  @Test
  public void t_01_validate_account_activity()
  {
	     WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
		 
		 PO_Generic po_generic=PageFactory.initElements(driver, PO_Generic.class);
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		  
		
		 
		 po_login.loginintoapplication(driver);
         po_generic.Click_On_Account_No();
        
	    PO_Account_Activity po_account_activity=PageFactory.initElements(driver, PO_Account_Activity.class);
	    po_account_activity.Select_Activity_Periad();
	    po_account_activity.Select_transaction_Type();
	    po_account_activity.Click_On_Go();
	    
  }
}
