package com.yantra.product.parabank.tc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.yantra.core.managers.BrowserManager;
import com.yantra.product.parabank.po.PO_CommonObjects;
import com.yantra.product.parabank.po.PO_LoginPage;
import com.yantra.product.parabank.po.PO_OpenNewAccount;

public class TC_OpenNewAccount {


/*
	 * @author: Sneha
	 * Date: 7July2018
	 * Description: Test Script to test successfull Open New Account
	 * Change History:
	 * 
	 */
public void t_01_validate_parabank_opennewaccount() throws IOException{
		
		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser("chrome");
		
		oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
		
		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		loginpage.kw_login_into_parabank("john","demo");
		
		//**********************************************************************************
		//*************************TC Steps*************************************************
		//**********************************************************************************
		PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
		o_po_cmn.click_Open_New_Account();
		
		PO_OpenNewAccount o_open_new_acc = PageFactory.initElements(driver,PO_OpenNewAccount.class);
		o_open_new_acc.kw_open_new_account("SAVING","12345");
}
public void t_02_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc1 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc1.kw_open_new_account("SAVING","12456");
}
public void t_03_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc2 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc2.kw_open_new_account("SAVING","12567");
}
public void t_04_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc3 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc3.kw_open_new_account("CHECKING","12345");
}
public void t_05_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc4 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc4.kw_open_new_account("CHECKING","12456");
}
public void t_06_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc5 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc5.kw_open_new_account("CHECKING","12567");
}
public void t_07_validate_parabank_opennewaccount() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo");
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Open_New_Account();
	
	PO_OpenNewAccount o_open_new_acc6 = PageFactory.initElements(driver,PO_OpenNewAccount.class);
	o_open_new_acc6.kw_open_new_account("CHECKING","12678");

	
			
	}
	

}
