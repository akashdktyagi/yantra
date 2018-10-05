package dev.backup.ravi.assignment.testng.billpayment;

import org.testng.annotations.Test;

import dev.backup.ravi.assignment.testng.reusable.AppReusable;
import dev.backup.ravi.assignment.testng.reusable.GenericResuables;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class OpenNewAccount1 
{
	WebDriver driver;
    WebElement New_acc_link;
    Select acc_type;
    Select from_Account;
    WebElement btn_Open_New_acc;
    
    
    
  @Test
  public void verify_new_account_link()       //test case 1
  {
		AppReusable.LoginInToTheApplication(driver, "john", "demo");
		  open_New_acc_loc();
		  New_acc_link.click();
			
  }
  @Test
  public void valiadte_new_Account()     // test case 2
  {
	  verify_new_account_link();
	  validate_new_acount_link();
	  from_Account.selectByValue("12345");
	  acc_type.selectByIndex(1);
	  
	  btn_Open_New_acc.click();
  
  }
  public void  validate_new_acount_link() {
	  
	  
	  from_Account = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
	  acc_type = new Select(driver.findElement(By.xpath("//select[@id='type']")));
	  btn_Open_New_acc= driver.findElement(By.xpath("//input[@type='submit']"));
		 
}
  
 
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = GenericResuables.webDriverManager("chrome", "http://parabank.parasoft.com");

  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() 
  {
	   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }
  
  public void open_New_acc_loc()
  {
	   New_acc_link = driver.findElement(By.xpath("//a[@href='/parabank/openaccount.htm']"));
       
				
        
  }

}
