package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TC_Bill_Pay 
{
	WebDriver driver;
	
 @Test
  public void click_validate_bill_pay_link() 
  {
	        WebDriver driver = WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
			String expected_url = "http://parabank.parasoft.com/parabank/index.htm";
			
			//Create Page Factory object for Login page
			PO_Login po_login = PageFactory.initElements(driver, PO_Login.class);//defoult syntax
			
			po_login.SetUsernameTextBox("john");
			po_login.SetPasswordTextBox("demo");
			po_login.ClickLoginButton();
			
		    PO_Guneric po_guneric=PageFactory.initElements(driver,PO_Guneric.class);	 //generic object
	        po_guneric.click_on_bill_pay_link();                                      //generic link call
   
		
	     PO_Bill_Pay po_bill_pay=PageFactory.initElements(driver, PO_Bill_Pay.class);
         po_bill_pay.SetPayeeName("ravi");
	     po_bill_pay.SetPayeeAddress("karve nagar");
         po_bill_pay.SetPayeeCity("pune");
         po_bill_pay.SetPayeeState("maharastra");
         po_bill_pay.set_payee_zipcode("444806");
         po_bill_pay.set_payee_phone_no("9096378893");
         po_bill_pay.set_payee_account("12345");
         po_bill_pay.set_payee_verify_acc("12345");
        po_bill_pay.Set_Payee_Amount("500");
        po_bill_pay.select_from_acc();
        po_bill_pay.clickonBillpay();
        
         
  }
 public void validate_bill_pay_functionlity()
 {

	  
  }}

