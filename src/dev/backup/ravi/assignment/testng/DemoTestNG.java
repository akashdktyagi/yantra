package dev.backup.ravi.assignment.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class DemoTestNG 

{
	WebDriver driver;
	WebElement txt_username;
	WebElement txt_password;
	WebElement btn_submit;
	
		
  @Test
  public void verify_valide_credntial() 
  {
	    init_locators();
	    txt_username.sendKeys("john");
	    txt_password.sendKeys("demo");
	    btn_submit.click();	         	  	  
  }
  @Test
  public void init_locators()
  {
	    txt_username = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
		
		txt_password = driver.findElement(By.xpath("//input[@name='password'and @class='input']"));
				
		btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
  }  
  @BeforeMethod
  public void navigate_to_login_page() 
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
  public void open_application() 
  {
   System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }
  {
	  
  }

}
