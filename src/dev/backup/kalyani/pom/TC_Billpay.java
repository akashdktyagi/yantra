package dev.backup.kalyani.pom;

import org.testng.annotations.Test;


import dev.backup.kalyani.reusables.WebDriverManager;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



public class TC_Billpay
{
	 @Test
	  public void t_01_validate_billpayment() 
	  {
		 WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
		  
		  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		  PO_billpay  po_billpay= PageFactory.initElements(driver, PO_billpay.class);
		  PO_Generic  po_generic=PageFactory.initElements(driver, PO_Generic.class);
		  
		  po_login.loginintoapplication(driver);
	      po_generic.Click_On_Bill_Pay_Link();
	      
	      po_billpay.set_payee_name_text_box("kalyani");
	      po_billpay.Set_PyeeAddressTextBox("katraj");
	      po_billpay.Set_PayeeCityTextBox("pune");
	      po_billpay.Set_PyeeStateTextBox("maharashtra");
	      po_billpay.Set_PyeeZipcodeTextBox("410507");
	      po_billpay.Set_PyeePhoneNoTextBox("9604629206");
	      po_billpay.Set_PyeeAccountTextBox("12456");
	      po_billpay.Set_VarifyAccountTextBox("12456");
	      po_billpay.Set_AmountTextBox("500");
	      po_billpay.Select_from_Acc();
	      po_billpay.Click_On_SendPayment() ;
	  }
	 
	 @Test
	  public void t_02_validate_verify_Account_no() 
	  {
		 WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
		  
		  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		  PO_billpay  po_billpay= PageFactory.initElements(driver, PO_billpay.class);
		  PO_Generic  po_generic=PageFactory.initElements(driver, PO_Generic.class);
		  
		  po_login.loginintoapplication(driver);
	      po_generic.Click_On_Bill_Pay_Link();
	      
	      po_billpay.set_payee_name_text_box("kalyani");
	      po_billpay.Set_PyeeAddressTextBox("katraj");
	      po_billpay.Set_PayeeCityTextBox("pune");
	      po_billpay.Set_PyeeStateTextBox("maharashtra");
	      po_billpay.Set_PyeeZipcodeTextBox("410507");
	      po_billpay.Set_PyeePhoneNoTextBox("9604629206");
	      po_billpay.Set_PyeeAccountTextBox("12456");
	      po_billpay.Set_VarifyAccountTextBox("12345");
	      po_billpay.Set_AmountTextBox("500");
	      po_billpay.Select_from_Acc();
	      po_billpay.Click_On_SendPayment() ; 
	  }
	  }

	
	
