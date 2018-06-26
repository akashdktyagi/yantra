package com.yantra.product.clidiem.testcases;

import org.testng.annotations.Test;

import com.yantra.core.managers.BrowserManager;
import com.yantra.product.clidiem.config.Global;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;



public class Module_Clidiem {
	
  final Logger logger = Logger.getLogger(Module_Clidiem.class);
  Properties prop_yantra = new Properties();
  Properties prop_clidiem = new Properties();

  /*
  @BeforeTest
  public void BeforeTestMethod() throws IOException{
	  InputStream input = new FileInputStream("clidiem_config.properties");
	  prop_clidiem.load(input);
	  
      InputStream input1 = new FileInputStream("yantra_config.properties");
	  prop_yantra.load(input1);  
  }
  
  */
  @Test
  public void TC_ValidateLogin() throws InterruptedException {
	  
	  BrowserManager oBM = new BrowserManager("Chrome");
	  WebDriver driver = oBM.GetBrowser();
	  oBM.NavigateToPage(driver, "http://cryptosurveystaging.clidiem.com//survey//sS3Ey1kKW7");
	  Thread.sleep(10000);
	  
	  
	  
	  
	  
	  
	  //oBM.NavigateToPage(driver, Global.sUrlNavigateTOSurveytemp);
	  //String temp = driver.findElement(By.id("aidsharesurveyweblink")).getText();
	  //System.out.println(temp);
	  
	  //Thread.sleep(10000);
	  
	  
	  	  
  }//End Test Method


}//end class
