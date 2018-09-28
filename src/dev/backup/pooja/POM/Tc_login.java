package dev.backup.pooja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.pooja.reusable.WebdriverManager;


public class Tc_login { 
	
  @Test
  public void  tc_01_validate_login() 
  {
	  WebDriver driver =WebdriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/about.htm");
	@SuppressWarnings("unused")
	String expected_url="http://parabank.parasoft.com/parabank/about.htm";
	 PO_login po_login =PageFactory.initElements(driver, PO_login.class);
	 
	 //PO_login.Loginintoapplication(driver);
	 po_login.set_username_text_box("john");
	 po_login.set_password_text_box("demo");
	 po_login.click_login_button();
  }
  @Test
  public void  tc_01_validate_login_with_wrong_user_name() 
  {
	  WebDriver driver =WebdriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/about.htm");
	@SuppressWarnings("unused")
	String expected_url="http://parabank.parasoft.com/parabank/about.htm";
	 PO_login po_login =PageFactory.initElements(driver, PO_login.class);
	 
	 //PO_login.Loginintoapplication(driver);
	 po_login.set_username_text_box("pooja");
	 po_login.set_password_text_box("demo");
	 po_login.click_login_button();
  }
  @Test
  public void  tc_01_validate_login_with_wrong_password() 
  {
	  WebDriver driver =WebdriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/about.htm");
	@SuppressWarnings("unused")
	String expected_url="http://parabank.parasoft.com/parabank/about.htm";
	 PO_login po_login =PageFactory.initElements(driver, PO_login.class);
	 
	 //PO_login.Loginintoapplication(driver);
	 po_login.set_username_text_box("pooja");
	 po_login.set_password_text_box("1234");
	 po_login.click_login_button();
  }
  
  
}
