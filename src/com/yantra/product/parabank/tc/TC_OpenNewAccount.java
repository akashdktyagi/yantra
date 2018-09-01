package com.yantra.product.parabank.tc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
	@Parameters({"browser","url"})
	@Test
	public void t_01_validate_parabank_opennewaccount(String browser_name, String url) throws IOException{

		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser(browser_name);
		oBrowserManager.NavigateToPage(driver, url);

		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		loginpage.kw_login_into_parabank("john","demo",true);

		//**********************************************************************************
		//*************************TC Steps*************************************************
		//**********************************************************************************
		PO_CommonObjects o_po_cmn= PageFactory.initElements(driver,PO_CommonObjects.class);
		o_po_cmn.click_Open_New_Account();

		PO_OpenNewAccount o_open_new_acc = PageFactory.initElements(driver,PO_OpenNewAccount.class);
		o_open_new_acc.kw_open_new_account("SAVING","12345");
	}


}
