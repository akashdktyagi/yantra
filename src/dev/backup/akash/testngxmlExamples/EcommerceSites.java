package dev.backup.akash.testngxmlExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EcommerceSites extends TestNGBaseClass{

  
  @Test
  public void t_01_check_parabank() {
	  driver.get("http://parabank.parasoft.com/parabank/index.htm");
  }

  @Test
  public void t_02_check_zeroapp() {
	  driver.get("http://zero.webappsecurity.com/login.html");
  }

  @Test
  public void t_03_check_icici() {
	  driver.get("https://www.icicibank.com/");
  }


}
