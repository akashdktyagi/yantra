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
import org.testng.annotations.BeforeTest;

public class BillPayment {
	WebDriver driver;
	WebElement payee_name;
	WebElement payee_address;
	WebElement city;
    WebElement state;
    WebElement zipcode;
    WebElement phone_No;
    WebElement account_no;
    WebElement verrify_acc;
	WebElement Link_update_contact_info;
	WebElement Amount;
	Select from_Acc;
	WebElement btn_submit;
	
  @Test
  public void validate_bill_payment_link()//Test case1
  {
		AppReusable.LoginInToTheApplication(driver, "john", "demo");
		init_bill_pay_locators();
		Link_update_contact_info.click();
 	  
  }
  @Test//Test case2
  public void validate_bill_payment() throws InterruptedException
  {
	  validate_bill_payment_link();
	  Bill_payment_loc();
	   payee_name.sendKeys("Ravi"); 
	   payee_address.sendKeys("karve Nagar");
	   city.sendKeys("pune");
	   state.sendKeys("maharastra");
	   zipcode.sendKeys("123456");
	   phone_No.sendKeys("9096378893");
	   account_no.sendKeys("12345");
	   verrify_acc.sendKeys("12345");
	   Amount.sendKeys("500");
	   from_Acc.selectByValue("12900");
	  
	 Thread.sleep(3000);
	  btn_submit.click();
	  
	  
  }

  @BeforeMethod
  public void beforeMethod() 
  {
	  driver = GenericResuables.webDriverManager("chrome", "http://parabank.parasoft.com");

  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }

  @BeforeTest
  public void beforeTest() {
  }
  @Test// Test case3
  public void init_bill_pay_locators()
  {
	
	Link_update_contact_info =driver.findElement(By.linkText("Bill Pay"));   
  }
  public void Bill_payment_loc ()
  {
	    payee_name =   driver.findElement(By.xpath("//input[@name='payee.name']"));
		payee_address = driver.findElement(By.xpath("//input[@name='payee.address.street' and @type='text']"));
		city    = driver.findElement(By.id("payee.address.city"));
		state = driver.findElement(By.xpath("//input[@name='payee.address.state']"));
	    zipcode = driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
		phone_No = driver.findElement(By.id("payee.phoneNumber"));
		account_no = driver.findElement(By.id("payee.accountNumber"));
	    verrify_acc = driver.findElement(By.id("verifyAccount"));
	    Amount = driver.findElement(By.id("amount"));
	    from_Acc = new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
	    btn_submit = driver.findElement(By.xpath(("//input[@type='submit']")));

}

}
