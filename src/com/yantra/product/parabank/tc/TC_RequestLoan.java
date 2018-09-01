package com.yantra.product.parabank.tc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.yantra.core.managers.BrowserManager;
import com.yantra.product.parabank.po.PO_CommonObjects;
import com.yantra.product.parabank.po.PO_LoginPage;
import com.yantra.product.parabank.po.PO_OpenNewAccount;
import com.yantra.product.parabank.po.PO_RequestLoan;

public class TC_RequestLoan {
	/*
	 * @author: Sneha
	 * Date: 7July2018
	 * Description: Test Script to test successfull Open New Account
	 * Change History:
	 * 
	 */
public void t_01_validate_parabank_requestloan() throws IOException{
		
		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser("chrome");
		
		oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
		
		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		loginpage.kw_login_into_parabank("john","demo",true);
		
		//**********************************************************************************
		//*************************TC Steps*************************************************
		//**********************************************************************************
		PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
		o_po_cmn.click_Request_Loan();
		
		PO_RequestLoan req_loan = PageFactory.initElements(driver,PO_RequestLoan.class);
		req_loan.kw_request_loan("500","200","12900");

}

public void t_02_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan1 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan1.kw_request_loan("600","300","13011");
}
public void t_03_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan2 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan2.kw_request_loan("1000","250","12456");
}
public void t_04_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan3 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan3.kw_request_loan("800","150","12678");
}
public void t_05_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan4 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan4.kw_request_loan("500","200","12678");
}
public void t_06_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan5 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan5.kw_request_loan("600","300","12789");
}
public void t_07_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan6 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan6.kw_request_loan("1500","500","13122");
}
public void t_08_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan7 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan7.kw_request_loan("700","350","13233");
}
public void t_09_validate_parabank_requestloan() throws IOException{
	
	//**********************************************************************************
	//*************************Intialization********************************************
	//**********************************************************************************
	BrowserManager oBrowserManager = new BrowserManager();
	WebDriver driver = oBrowserManager.GetBrowser("chrome");
	
	oBrowserManager.NavigateToPage(driver, "http://parabank.parasoft.com/parabank/index.htm");
	
	PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
	loginpage.kw_login_into_parabank("john","demo",true);
	
	//**********************************************************************************
	//*************************TC Steps*************************************************
	//**********************************************************************************
	PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
	o_po_cmn.click_Request_Loan();
	
	PO_RequestLoan req_loan7 = PageFactory.initElements(driver,PO_RequestLoan.class);
	req_loan7.kw_request_loan("70000","35000","13233");

}
}