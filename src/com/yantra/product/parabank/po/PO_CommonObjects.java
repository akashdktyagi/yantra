package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_CommonObjects 
{
        WebDriver driver;
   	 @FindBy(how=How.LINK_TEXT,using="Open New Account")
   	 private WebElement Link_open_new_account;;
   	 @FindBy(how=How.LINK_TEXT,using="Accounts Overview")
   	 private WebElement Link_accounts_overview;;
  	 @FindBy(how=How.LINK_TEXT,using="Transfer Funds")
   	 private WebElement Link_transfer_funds;;
	 @FindBy(how=How.LINK_TEXT,using="Bill Pay")
   	 private WebElement Link_bill_pay;;
	 @FindBy(how=How.LINK_TEXT,using="Find Transactions")
   	 private WebElement Link_find_transactions;;
	 @FindBy(how=How.LINK_TEXT,using="Update Contact Info")
   	 private WebElement Link_update_contact_info;;
	 @FindBy(how=How.LINK_TEXT,using="Request Loan")
   	 private WebElement Link_request_loan;;
	 @FindBy(how=How.LINK_TEXT,using="Log Out")
   	 private WebElement Link_log_out;;
   	 
   	 
	 public void click_Open_New_Account()
	 {
		 Link_open_new_account.click();
	 }
		 
	 public void click_Accounts_Overview()
	 {
		 Link_accounts_overview.click();
	 }
	 
    public void click_Transfer_Funds()
     {
	 Link_transfer_funds.click();
     }
    
    public void click_Bill_Pay()
     {
    	Link_bill_pay.click();
     }
      public void click_Find_Transactions()
    {
    	  Link_find_transactions.click();
    }
      public void click_Update_Contact_Info()
      {
    	  Link_update_contact_info.click();
      }
      public void click_Request_Loan()
      {
    	  Link_request_loan.click();
      }
      public void click_Log_Out()
      {
    	  Link_log_out.click();
      }
 	 public void kw_common_object() {
 		click_Open_New_Account();
 		click_Accounts_Overview();
 		click_Transfer_Funds();
 		click_Bill_Pay();
 		click_Find_Transactions();
 		click_Update_Contact_Info();
 		click_Request_Loan();
 		click_Log_Out();
 	 }
	 public  PO_CommonObjects(WebDriver d)
	 {
		 this.driver= d;
	 }

	 
}
