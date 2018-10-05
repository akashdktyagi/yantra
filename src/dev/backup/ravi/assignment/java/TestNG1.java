package dev.backup.ravi.assignment.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG1 {
	
	WebDriver driver;
	WebElement txt_user_name;
	WebElement txt_password;
	WebElement btn_submit;
	
	
	@Test()
	public void valid_credntial()
	{
		init_login_locators();// locator method called here to find xpath
		
		txt_user_name.sendKeys("john");
	    txt_password.sendKeys("demo");
	    btn_submit.click();
	     		
	}	
	
	@Test()
	public void invalid_credntial()
	{
		init_login_locators();// locator method called here to find xpath

		txt_user_name.sendKeys("john");
		txt_password.sendKeys("1234");
	    btn_submit.click();
	       	    	
	}
	
	@Test()
  public void init_login_locators() 
  {
	  txt_user_name = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		
	  txt_password = driver.findElement(By.xpath("//input[@name='password'and @class='input']"));
			
	  btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
	  
  }
  @BeforeMethod
  public  void beforeMethod() 
  {
	    driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		driver.manage().window().maximize();
	}
  

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() 
  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }

 /* @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  
*/
}
