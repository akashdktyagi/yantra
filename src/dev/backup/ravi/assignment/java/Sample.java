package dev.backup.ravi.assignment.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample 
{
	WebDriver driver;
	WebElement txt_user_name;
	WebElement txt_password;
	WebElement btn_submit;

	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

	}
	@BeforeMethod
	public void navigate_login_page()
	{
		 driver = new ChromeDriver();
		 driver.  get("http://parabank.parasoft.com");
		 driver.manage().window().maximize();
	}
	
	@Test
	public void init_locators()
	{
		txt_user_name = driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
			
		txt_password = driver.findElement(By.xpath("//input[@name='password'and @class='input']"));
				
		btn_submit = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
				
	}
	
	@Test
	public void valid_credntial()
	{
		init_locators();
		
		txt_user_name.sendKeys("john");
	    txt_password.sendKeys("demo");
	    btn_submit.click();
	    
	}
	@AfterMethod
	public void close_application()
	{
		driver.close();
	}
	}


