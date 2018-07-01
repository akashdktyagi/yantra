package com.yantra.product.parabank.tc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.yantra.product.parabank.po.PO_LoginPage;

public class TC_LoginPage {
	public void t_01_validate_parabank_login(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		
		String var = "Akash";
		
		PO_LoginPage loginpage=PageFactory.initElements(driver,PO_LoginPage.class);
		loginpage.SetUsername("john");
		loginpage.SetPassword("demo");
		loginpage.SetSubmit();
		
	}

}
