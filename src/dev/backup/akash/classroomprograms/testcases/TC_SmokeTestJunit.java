package dev.backup.akash.classroomprograms.testcases;


import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import dev.backup.akash.classroomprograms.pageobjects.PO_CmnPageObjects;
import dev.backup.akash.classroomprograms.pageobjects.PO_Login;
import junit.framework.Assert;
import dev.backup.akash.classroomprograms.pageobjects.*;

class TC_SmokeTestJunit {
	WebDriver driver;
	PO_CmnPageObjects PO_CmnPageObjects;
	PO_TransferFunds PO_TransferFunds;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
	}

	@BeforeEach
	void setUp() throws Exception {
		//1. Initialize the Browser
		driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		PO_CmnPageObjects = PageFactory.initElements(driver, dev.backup.akash.classroomprograms.pageobjects.PO_CmnPageObjects.class);
		PO_TransferFunds = PageFactory.initElements(driver, PO_TransferFunds.class);
		
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
		System.out.println("Driver quit");

	}

	@Test
	void t_login_into_parabank() {
		System.out.println("Test1");

		PO_Login o_login = PageFactory.initElements(driver, PO_Login.class);
		o_login.SetUserName("john");
		o_login.SetPassword("demo");
		o_login.ClickLoginBtn();
		
		String s_title_expected = "ParaBank | Accounts Overview";
		String s_title_actual = driver.getTitle();
		Assert.assertEquals(s_title_expected, s_title_actual);

		
		//fail("Not yet implemented");
	}
	@Test
	void t_check_transfer_funds() {

		//Login in to the application
		t_login_into_parabank();
		
		//Click on Transfer funds
		PO_CmnPageObjects.ClickTransferFunds();
		
		//Set Amount and perform Transfer Funds
		PO_TransferFunds.SetAmmount("1000");
		PO_TransferFunds.SelectFromAccount("12345");
		PO_TransferFunds.SelectToAccount("12346");
		PO_TransferFunds.ClickTransfer();
		
		//Validation
		PO_TransferFunds.ValidateTransferResults();
	}
	

	
}
