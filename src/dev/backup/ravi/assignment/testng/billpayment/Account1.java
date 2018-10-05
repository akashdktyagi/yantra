package dev.backup.ravi.assignment.testng.billpayment;

import org.testng.annotations.Test;

import dev.backup.ravi.assignment.testng.reusable.AppReusable;
import dev.backup.ravi.assignment.testng.reusable.GenericResuables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Account1 
{
    WebDriver driver;
    WebElement  tbl_acc_overview_table;
	
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
  
  

  @BeforeTest
  public void beforeTest()
  {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

  }
  // step1: Login
  @Test
  public void validate_account_overview_screen() 
  {
	 AppReusable.LoginInToTheApplication(driver , "john", "demo");
	 
	 //step2: validate page content correctly display
	  
	  //a. validate title
	  String sPageTitleActual = driver.getTitle();
	  String sPageTitleExpected = "ParaBank | Accounts Overview";
	  
	  Assert.assertEquals(sPageTitleActual, sPageTitleExpected);
	  if(sPageTitleActual.equalsIgnoreCase(sPageTitleExpected))
	  {
	  GenericResuables.writeLogs("pass", "page title corectly display." + "Expected: " + sPageTitleExpected
			                                + "Actual is :" + sPageTitleActual);
	  }else {
  
	  GenericResuables.writeLogs("fail", "page title corectly display." + "Expected: " + sPageTitleExpected
              + "Actual is :" + "page title not correctly display");
  }
	  
	   initialize_locators();
	   String sTblText = tbl_acc_overview_table.getText();
	   if(tbl_acc_overview_table.isDisplayed()){
		   GenericResuables.writeLogs("pass", "table is displayed succefuly");
	   }else{
		   GenericResuables.writeLogs("fail", "table is not displayed");
	   }
	  	  
  }
  
	  //a:validate table info
	  
	  @Test
	  public void t_validate_account_balance_matching_with_total()
	  { 
	    AppReusable.LoginInToTheApplication(driver, "john", "demo");
     //validate table info.
	  
	   initialize_locators();
	  
	   String sTblText = tbl_acc_overview_table.getText();
	   List<WebElement> o_collection_tr =tbl_acc_overview_table.findElements(By.tagName("tr"));
	  
	   String temp;
	   ArrayList<String> arr_account_balance =new ArrayList<String>();
	   for(int i=1;i<o_collection_tr.size()-2;i++){
       temp = o_collection_tr.get(i).findElements(By.tagName("td")).get(1).getText();		 
	   arr_account_balance.add(temp);    	  
	  }
	   
	     //need further update in below statment
	      //Remove total and $sign
	      
	      int total_actual = Integer.parseInt(o_collection_tr.get(o_collection_tr.size()).getText().replace("$", ""));
	      
	      //add all the values
	      String temp1;
	      int temp2 ;
	      ArrayList<Integer> arr_acc_balance_formated =new ArrayList<Integer>();
	      for(int i=0; i<arr_account_balance.size();i++){
	    	  temp1 = arr_account_balance.get(i);
	    	  temp1 = temp1.replace("$", "");
	    	  temp2 = Integer.parseInt(temp1);
	    	  arr_acc_balance_formated.add(temp2);
	      }
	      int sum_expected =0;
	      for(int i=0;i<arr_acc_balance_formated.size();i++){
	    	  sum_expected = arr_acc_balance_formated.get(i)+sum_expected;
	      }
	      //Get actual from table
	      if(total_actual==sum_expected){
	    	  GenericResuables.writeLogs("pass", "account sum matching with total displayes");
	      }else{
	    	  GenericResuables.writeLogs("fail", "account sum not matching with total displayes");
	    	  
	      }
	     
	      
	      }
	  public void initialize_locators()
	  {
		  tbl_acc_overview_table = driver.findElement(By.id("accountTable"));
		  
	  }}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	 
   
  //initialize table
	 

  



    
    
    
    	
    
