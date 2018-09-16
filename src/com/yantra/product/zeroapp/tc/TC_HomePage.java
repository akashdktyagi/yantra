package com.yantra.product.zeroapp.tc;

import org.testng.annotations.Test;

import com.yantra.product.zeroapp.po.PO_HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TC_HomePage {
  
	
  @Test
  public void t_01_validate_landing_page_and_sign_in_link() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/");
	 
	  PO_HomePage o_home_page = PageFactory.initElements(driver, PO_HomePage.class);
	  o_home_page.ClickOnSignInButton();
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
