package dev.backup.ravi.assignment.testng.billpayment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.backup.ravi.assignment.testng.reusable.AppReusable;
import dev.backup.ravi.assignment.testng.reusable.GenericResuables;


public class Account 

{	
	WebDriver driver;
	
	@Test()
	public void validate_account_overview()
		
	{
		AppReusable.LoginInToTheApplication(driver, "john", "demo");
		 		
	}	
	
  @BeforeMethod
  
  public  void beforeMethod() 
  {
	  driver = GenericResuables.webDriverManager("chrome", "http://parabank.parasoft.com");
  }
  @BeforeClass
  public void beforeClass() 
  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }
}


