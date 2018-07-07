/*
 * @author: Akash
 * Date: 7July2018
 */
package com.yantra.product.parabank.tc;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import com.yantra.core.managers.BrowserManager;
import com.yantra.product.parabank.po.PO_LoginPage;

public class TC_LoginPage {
	
	/*
	 * @author: Akash
	 * Date: 7July2018
	 * Description: Test Script to test successfull Login
	 * Change History:
	 * 
	 */
	public void t_01_validate_parabank_login() throws IOException{
		
		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser("chrome");
		
		oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
		
		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		
		//**********************************************************************************
		//*************************TC Steps*************************************************
		//**********************************************************************************
		loginpage.kw_login_into_parabank("john","demo");
			
	}
	
	/*
	 * @author: Akash
	 * Date: 7July2018
	 * Description: Test Script to test negative case for login right user name, wrong password
	 * Change History:
	 * 
	 */
	public void t_02_negative_enter_correct_user_name_wrong_password() {
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser("chrome");
			oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("john","wrong");
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end method
	 
	public void t_02_negative_enter_wrong_user_name_correct_password() {
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser("chrome");
			oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("johnny","demo");
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	public void t_02_negative_enter_wrong_user_name_wrong_password() {
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser("chrome");
			oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("cena","john");
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
}//end test class
