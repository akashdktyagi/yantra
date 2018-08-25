package dev.backup.akash.codesnippets;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//tc login
public class TC_Login{

	@Test
	public void t_01_validate_login() {
		WebDriver driver = WebDriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/index.htm");
		String expected_url = "http://parabank.parasoft.com/parabank/index.htm";
		
		//Create Page Factory object for Login page
		PO_Login PO_Login = PageFactory.initElements(driver, PO_Login.class);
		PO_AccountOverview PO_AccountOverview = 
				PageFactory.initElements(driver, PO_AccountOverview.class);
		PO_Login.SetUserNameTextBox("john");
		PO_Login.SetPasswordTextBox("demo");
		PO_Login.ClickLoginButton();
		
		//Create Page Factory object for Account Overview
		PO_AccountOverview.ValidateAccountOverviewTableIsDisplayed();
		
		/*
		List<WebElement> collection = driver.findElements(By.xpath("//input[@type='text']"));
		int total = collection.size();
		for(int i=0;i<total;i++) {
			collection.get(i).clear();
		}
		*/
	}//end method
	
	@BeforeMethod
	public void beforeMethod() {
		/*
		WebDriver driv
		for(int i=0;i<=10;i++) {
			try {
				element = driver.findElements("");
				
				element.click();
			}catch(StaleElementReferenceException e) {
				//do thing
			}
		}
		*/



	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
