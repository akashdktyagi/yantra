package dev.backup.kalyani.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.kalyani.reusables.WebDriverManager;




public class TC_Login {
 
@Test
  public void t_01_validate_login() 
  {
	  WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
	  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
	  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
	  
	  PO_login.loginintoapplication(driver);
	  
  }
  @Test
  public void t_02_validate_login_with_wrong_password()
  {
	  WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
	  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
	  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
	  
	  po_login.set_username_text_box("john");
		po_login.set_password_text_box("wxyz");
		po_login.click_login_button();
  }
  @Test
  public void t_03_validate_login_with_wrong_username()
  {
	  WebDriver driver=WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
	  String expected_url="http://parabank.parasoft.com/parabank/index.htm";
	  PO_login po_login=PageFactory.initElements(driver, PO_login.class);
	  
	  po_login.set_username_text_box("kalyani");
		po_login.set_password_text_box("demo");
		po_login.click_login_button();
	  
  }
 
 
}
