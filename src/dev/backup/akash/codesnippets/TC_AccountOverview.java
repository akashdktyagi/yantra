package dev.backup.akash.codesnippets;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Test cases in this Pack.
 * TC1: Validate account table is displayed
 * TC2: Validate the sum of all the account balance is equal to total amount displayed.
 * TC3: Validate account information is displayed correctly after clicking
 * TC4: Validate Account activity Filter is working correctly
 * 		-Validate if no month-entry
 * 		-Validate if month-entry is there
 * TC5: Validate Transaction Details
 */

public class TC_AccountOverview {
	
	WebDriver driver;
	WebElement tbl_acc_overview_table;

	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
	}

	//@Test
	public void t_validate_account_overview_screen() {
		//Step1: Login
		AppReusables.LoginInToTheApplication(driver, "john", "demo");
		
		//Step2: Validate Page Content is correctly displayed
		// a. Validate Title
		String sPageTitleActual = driver.getTitle();
		String sPageTitleExpected = "ParaBank | Accounts Overview";
		
		Assert.assertEquals(sPageTitleActual, sPageTitleExpected);
		if (sPageTitleActual.equalsIgnoreCase(sPageTitleExpected)) {
			GenericReusables.WriteLogs("pass", "Page title correctly displayed. "
					+ "Expected: " + sPageTitleExpected + " Actual is: " + sPageTitleActual  );
		}else {
			GenericReusables.WriteLogs("fail", "Page title not correctly displayed. "
					+ "Expected: " + sPageTitleExpected + " Actual is: " + sPageTitleActual  );
		}
		
		//b. Validate Table Info
		initialize_locators();
		String sTblText = tbl_acc_overview_table.getText();
		if (tbl_acc_overview_table.isDisplayed()) {
			GenericReusables.WriteLogs("pass", "Table is displayed successfully with text as " + sTblText);
		}else {
			GenericReusables.WriteLogs("fail", "Table is not displayed");
		}
		


	}
	
	@Test
	public void t_validate_accounts_balance_matchinng_with_total() {
		//Step1: Login
		AppReusables.LoginInToTheApplication(driver, "john", "demo");
		
		//b. Validate Table Info
		initialize_locators();
		String sTblText = tbl_acc_overview_table.getText();

		List<WebElement> o_collection_tr = 
				tbl_acc_overview_table.findElements(By.tagName("tr"));
		
		String temp;
		ArrayList<String> arr_account_balance = new ArrayList<String>();
		for (int i=1;i<o_collection_tr.size()-2;i++) {
			temp = o_collection_tr.get(i).findElements(By.tagName("td")).get(1).getText();
			arr_account_balance.add(temp);
		}
		
		//Need further update in below statement:
		//Remove total and $ sign
		int total_actual = Integer.parseInt(o_collection_tr.get(o_collection_tr.size()).getText().replace("$", ""));
		
		//Add all the values
		String temp1;
		int temp2;
		ArrayList<Integer> arr_account_balance_formated = new ArrayList<Integer>();
		for(int i=0;i<arr_account_balance.size();i++) {
			temp1 = arr_account_balance.get(i);
			temp1 = temp1.replaceAll("$", "");
			temp2 = Integer.parseInt(temp1);
			arr_account_balance_formated.add(temp2);
			
//			arr_account_balance_formated.add(Integer.parseInt(arr_account_balance.get(i).replaceAll("$", "")));
		}
		
		int sum_expected=0;
		for(int i=0;i<arr_account_balance_formated.size();i++) {
			sum_expected = arr_account_balance_formated.get(i) + sum_expected;
		}
		
		//Get Actual from Table
		if (total_actual==sum_expected) {
			GenericReusables.WriteLogs("pass", "Account Sum matching with total displayed");
		}else {
			GenericReusables.WriteLogs("fail", "Account Sum not matching with total displayed");
		}
		

	}
	

	@BeforeMethod
	public void beforeMethod() {
		driver = GenericReusables.WebDriverManager("chrome", "http://parabank.parasoft.com");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}



	@AfterTest
	public void afterTest() {
	}
	
	public void initialize_locators() {
		tbl_acc_overview_table = 
				driver.findElement(By.id("accountTable"));
	}

}
