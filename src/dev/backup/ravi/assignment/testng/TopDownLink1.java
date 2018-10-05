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

public class TopDownLink1 
{
	WebDriver driver;
	WebElement Link_location;
	WebElement Link_services;
	WebElement Link_product;
	WebElement Link_admin_page;
		
  @Test
  public void verify_para_bank_app_login_succesfully() 
  {
		AppReusable.LoginInToTheApplication(driver, "john", "demo");
  }
  @Test
  public void verify_link_Location() 
  {
	  verify_para_bank_app_login_succesfully();
	  top_link_location(); 
	  Link_location.click();
  }
  @Test
  public void validate_top_link_app()
  {
	verify_para_bank_app_login_succesfully();
	top_link_location();
	Link_services.click();
	  
  }
   
  @Test
  public void verify_product_link()
  {
	verify_para_bank_app_login_succesfully();
	top_link_location();
	Link_product.click();  
  }
 
 @Test
  public void verify_admin_page_link()
  {
  verify_para_bank_app_login_succesfully();
  top_link_location();
  Link_admin_page.click();
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
  
  
  public void top_link_location()
  {
  Link_location = driver.findElement(By.xpath("//a[@href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));  
  Link_product=	  driver.findElement(By.xpath("//a[@href='http://www.parasoft.com/jsp/products.jsp']"));
  Link_admin_page=driver.findElement(By.xpath("//a[@href='admin.htm']"));
  Link_services=  driver.findElement(By.xpath("//a[@href='services.htm']"));  
  }

}
