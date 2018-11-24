/*
 * @author: Akash
 * Date: 7July2018
 */
package com.yantra.product.parabank.tc;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.driver.Config;
import com.yantra.product.parabank.po.PO_LoginPage;

//1/
public class TC_LoginPage {
	private Config Config;
	private HashMap<String,String> CONFIG_DATA;
	
	@BeforeClass
	public void TestSetUpBeforeEachTest() throws IOException {
		Config = new Config();
		CONFIG_DATA = Config.CONFIG_DATA();
	}
	
	
	/*
	 * @author: Akash
	 * Date: 7July2018
	 * Description: Test Script to test successfull Login
	 * Change History:
	 * 
	 */
	@Parameters({"browser","url"})
	@Test(groups= {"smoke","regression"})
	public void t_01_validate_parabank_login(@Optional("chrome") String browser_name,@Optional("http://parabank.parasoft.com")String url) throws IOException{
		
		//**********************************************************************************
		//*************************Intialization********************************************
		//**********************************************************************************
		BrowserManager oBrowserManager = new BrowserManager();
		WebDriver driver = oBrowserManager.GetBrowser(browser_name);
		oBrowserManager.NavigateToPage(driver, url);
		
		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		loginpage.SetUsername("john");
		loginpage.SetPassword("demo");
		loginpage.ClickSubmit();
		
		//**********************************************************************************
		//*************************TC Steps*************************************************
		//**********************************************************************************
		String username =  CONFIG_DATA.get("USERNAME");
		String password = CONFIG_DATA.get("PASSWORD");
		loginpage.kw_login_into_parabank(username,password,true);

	}
	
	/*
	 * @author: Akash
	 * Date: 7July2018
	 * Description: Test Script to test negative case for login right user name, wrong password
	 * Change History:
	 * 
	 */
	@Parameters({"browser","url"})
	@Test(groups= {"regression"})
	public void t_02_negative_enter_correct_user_name_wrong_password(@Optional("chrome")String browser_name,String url) throws IOException {
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser(browser_name);
			oBrowserManager.NavigateToPage(driver,url);
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("john","wrong",false);

			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//end method
	
	@Parameters({"browser","url"})
	@Test(groups= {"regression"})
	public void t_03_negative_enter_wrong_user_name_correct_passwor(@Optional("chrome")String browser_name,String url) throws IOException {
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser(browser_name);
			oBrowserManager.NavigateToPage(driver,url);
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("johnny","demo",false);

		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	@Parameters({"browser","url"})
	@Test(groups= {"regression"})
	public void t_04_negative_enter_wrong_user_name_wrong_password(@Optional("chrome")String browser_name,String url) throws IOException{
		try {
			
			//**********************************************************************************
			//*************************Intialization********************************************
			//**********************************************************************************
			BrowserManager oBrowserManager = new BrowserManager();
			WebDriver driver;	
			driver = oBrowserManager.GetBrowser(browser_name);
			oBrowserManager.NavigateToPage(driver,url);
			PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
			
			//**********************************************************************************
			//*************************TC Steps*************************************************
			//**********************************************************************************
			loginpage.kw_login_into_parabank("cena","john",false);

			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
}//end test class
