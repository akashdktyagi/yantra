
package dev.backup.ravi.assignment.testng;

import org.testng.annotations.Test;

import dev.backup.ravi.assignment.testng.reusable.AppReusable;
import dev.backup.ravi.assignment.testng.reusable.GenericResuables;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class UpdateContactInfo1
{
	WebDriver driver;
	WebElement update_contact_info_link;
	
	WebElement First_Name;
	WebElement Last_name;
	WebElement Address;
	WebElement city;
	WebElement state;
	WebElement zip_code;
	WebElement phone_no;
	
	WebElement btn_submit;
		
  @Test  // Test case1
  public void validate_update_contact_link()
  {
		AppReusable.LoginInToTheApplication(driver, "john", "demo");
		contact_info_link();
		update_contact_info_link.click();		      
  }
  @Test//Test case2
  public void validat_contact_info() throws InterruptedException
  {
	
	  validate_update_contact_link();
	  update_contact_locators();
	  First_Name.clear();
	  First_Name.sendKeys("ravi");
	  Last_name.clear();
	  Last_name.sendKeys("kanherkar");
	  Address.clear();
	  Address.sendKeys("karve nagar");
	  city.clear();
	  city.sendKeys("pune");
	  state.clear();
	  state.sendKeys("maharastra");
	  zip_code.clear();
	  zip_code.sendKeys("444808");
	  phone_no.clear();
	  phone_no.sendKeys("9096378893");
	  Thread.sleep(4000);
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
  @Test//Test case3
  public void contact_info_link()
  
  {
	  update_contact_info_link=driver.findElement(By.xpath("//a[@href='/parabank/updateprofile.htm']"));
	    
  }
  public void update_contact_locators()
  { 
       First_Name =driver.findElement(By.xpath("//input[@id='customer.firstName']"));
       Last_name= driver.findElement(By.id("customer.lastName"));
       Address = driver.findElement(By.id("customer.address.street"));
       city = driver.findElement(By.id("customer.address.city"));
       state= driver.findElement(By.id("customer.address.state"));
       zip_code= driver.findElement(By.id("customer.address.zipCode"));
       phone_no = driver.findElement(By.id("customer.phoneNumber"));
       btn_submit=driver.findElement(By.xpath("//input[@class='button' and @type='submit']"));
  }
  
 
       		
       


	  
  

}
