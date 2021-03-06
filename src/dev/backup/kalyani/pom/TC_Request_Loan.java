package dev.backup.kalyani.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.kalyani.reusables.WebDriverManager;

public class TC_Request_Loan 
{
	@Test
	  public void t_01_validate_request_loan() 
	  {
		 WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
		  
		  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		  PO_Request_Loan  po_request_loan  = PageFactory.initElements(driver, PO_Request_Loan.class);
		  PO_Generic  po_generic=PageFactory.initElements(driver, PO_Generic.class);
		  
		  po_login.loginintoapplication(driver);
		  
		  
		  // po_login.SetUserNameTextBox("john");
			// po_login.SetPasswordTextBox("demo");
			// po_login.Click_Login_Button();
			 po_generic.Click_On_Request_loan_link();
			 po_request_loan.Set_Amount_TextBox("30000");
			 po_request_loan.Set_DownPayment_TextBox("200");
			 po_request_loan.Select_from_Acc();
			 po_request_loan.Click_Apply_Now();
	  }
}
