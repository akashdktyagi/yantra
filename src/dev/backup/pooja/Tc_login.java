package dev.backup.pooja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.akash.codesnippets.WebDriverManager;
import dev.backup.kalyani.pom.PO_login;

public class Tc_login { 
	
  @Test
  public void  tc_01_validate_login() 
  {
	  WebDriver driver =WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/about.htm");
	String expected_url="http://parabank.parasoft.com/parabank/about.htm";
	 PO_login po_login =PageFactory.initElements(driver, PO_login.class);
	 
	 //PO_login.Loginintoapplication(driver);
	 po_login.set_username_text_box("john");
	 po_login.set_password_text_box("demo");
	 po_login.click_login_button();
  }
}
