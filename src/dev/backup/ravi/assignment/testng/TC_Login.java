package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TC_Login 
{
	WebDriver driver;
	

	@Test
	public void t_01_validate_login() {
		WebDriver driver = WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		String expected_url = "http://parabank.parasoft.com/parabank/index.htm";
		
		//Create Page Factory object for Login page
		PO_Login po_login = PageFactory.initElements(driver, PO_Login.class);//defoult syntax
		PO_Account_Overview po_account_overview = 
				PageFactory.initElements(driver, PO_Account_Overview.class);
		po_login.SetUsernameTextBox("john");
		po_login.SetPasswordTextBox("demo");
		po_login.ClickLoginButton();
				
	}}	
		
		