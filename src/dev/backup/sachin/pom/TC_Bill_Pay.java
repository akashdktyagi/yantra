package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TC_Bill_Pay 
{
  @Test
  public void t_01_validate_billpayment() 
  {
	     WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
		 
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		 PO_Bill_Pay po_billpay=PageFactory.initElements(driver, PO_Bill_Pay.class);
		 PO_Generic po_generic=PageFactory.initElements(driver, PO_Generic.class);

		  
		 po_login.loginintoapplication(driver);
		 po_generic.Click_On_Bill_Pay_Link();
		 
		
		 po_billpay.Set_PyeeNameTextBox("sachin");
		 po_billpay.Set_PyeeAddressTextBox("shioor");
		 po_billpay.Set_PayeeCityTextBox("Aurangabad");
		 po_billpay.Set_PyeeStateTextBox("maharashtra");
		 po_billpay.Set_PyeeZipcodeTextBox("431116");
		 po_billpay.Set_PyeePhoneNoTextBox("9850124578");
		 po_billpay.Set_PyeeAccountTextBox("12456");
		 po_billpay.Set_VarifyAccountTextBox("12456");
		 po_billpay.Set_AmountTextBox("500");
		 po_billpay.Select_from_Acc();
		 po_billpay.Click_On_SendPayment();
		 
		
	
  }
  @Test
  public void t_02_validate_verify_Account_no() 
  {
	     WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
		 
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		 PO_Bill_Pay po_billpay=PageFactory.initElements(driver, PO_Bill_Pay.class);
		 PO_Generic po_generic=PageFactory.initElements(driver, PO_Generic.class);

		  
		 po_login.loginintoapplication(driver);
		 po_generic.Click_On_Bill_Pay_Link();
		 
		
		 po_billpay.Set_PyeeNameTextBox("sachin");
		 po_billpay.Set_PyeeAddressTextBox("shioor");
		 po_billpay.Set_PayeeCityTextBox("Aurangabad");
		 po_billpay.Set_PyeeStateTextBox("maharashtra");
		 po_billpay.Set_PyeeZipcodeTextBox("431116");
		 po_billpay.Set_PyeePhoneNoTextBox("9850124578");
		 po_billpay.Set_PyeeAccountTextBox("12456");
		 po_billpay.Set_VarifyAccountTextBox("12345");
		 po_billpay.Set_AmountTextBox("500");
		 po_billpay.Select_from_Acc();
		 po_billpay.Click_On_SendPayment();
		
}}
