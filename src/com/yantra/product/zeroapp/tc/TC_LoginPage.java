package com.yantra.product.zeroapp.tc;

import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.driver.Config;
import com.yantra.product.zeroapp.po.PO_HomePage;
import com.yantra.product.zeroapp.po.PO_LoginPage;

import dev.backup.akash.codesnippets.PO_Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TC_LoginPage {

	private Config Config;
	private HashMap<String,String> CONFIG_DATA;

	@BeforeClass
	public void TestSetUpBeforeEachTest() throws IOException {
		Config = new Config();
		CONFIG_DATA = Config.CONFIG_DATA();
	}


	@Parameters({"browser","url"})
	@Test(groups= {"smoke","regression"})	
	public void t_01_validate_login_in_zero_app(@Optional("chrome") String browser_name,@Optional("http://zero.webappsecurity.com")String url) throws IOException{
		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser(browser_name);
		oBrowserManager.NavigateToPage(driver, url);

		//Create Object of Home Page using Page Factory
		PO_HomePage PO_HomePage = PageFactory.initElements(driver, PO_HomePage.class);

		//Call the Method
		PO_HomePage.ClickOnSignInButton();

		//Create Object of PO Login page using Page Factory
		PO_LoginPage PO_LoginPage = PageFactory.initElements(driver, PO_LoginPage.class);
		String s_user = "username";
		String s_pass = "password";
		/*
		  PO_LoginPage.SetUserName(s_user);
		  PO_LoginPage.SetPassword(s_pass);
		  PO_LoginPage.ClickSingInButton();
		 */
		PO_LoginPage.kw_login_in_to_zero_app(s_user, s_pass);



	}


	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
