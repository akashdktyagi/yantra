package dev.backup.akash.classroomprograms.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dev.backup.akash.classroomprograms.pageobjects.PO_Login;



public class TC_SmokeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		//1. Initialize the Browser
		WebDriver driver = new ChromeDriver();
		
		//2 Navigate
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		PO_Login o_login = PageFactory.initElements(driver, PO_Login.class);
		o_login.SetUserName("john");
		o_login.SetPassword("demo");
		o_login.ClickLoginBtn();
		

	}

}
