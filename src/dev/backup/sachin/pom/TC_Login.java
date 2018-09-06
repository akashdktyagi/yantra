package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class TC_Login {
	
  @Test
  public void t_01_validate_login()
  {
	
	 WebDriver driver=WebdriverManager.InitilizeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
	 String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
	 
	 PO_login.loginintoapplication(driver);
  }
  @Test
  public void t_02_validate_login_with_wrong_password()
  {
	  WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
	  String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
	  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
	  
	  po_login.SetUserNameTextBox("john");
	  po_login.SetPasswordTextBox("wxyz");
	  po_login.Click_Login_Button();
	  
  }
  @Test
  public void t_03_validate_login_with_wrong_username()
  {
	  WebDriver driver=WebdriverManager.InitilizeBrowser("chrome","http://parabank.parasoft.com/parabank/index.htm") ;
	  String expected_url= "http://parabank.parasoft.com/parabank/index.htm";
	  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
	  
	  po_login.SetUserNameTextBox("sachin");
	  po_login.SetPasswordTextBox("demo");
	  po_login.Click_Login_Button();
	  
  }
 
 
}
