package com.yantra.product.zeroapp.tc;

import org.testng.annotations.Test;

import com.yantra.product.zeroapp.po.PO_TransferFunds;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class TC_TransferFunds {
  @Test
  public void t_01_validate_transfer_funds_from_1_saving_acc_to_other_saving_account() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  //Write Login Code here
	  
	  PO_TransferFunds PO_TransferFunds = PageFactory.initElements(driver, PO_TransferFunds.class);
	  PO_TransferFunds.SelectFromAccount("1");
	  PO_TransferFunds.SelectToAccount("3");
	  PO_TransferFunds.SetAmountTextBox("100");
	  PO_TransferFunds.SetDescriptionTextBox("Temp");
	  PO_TransferFunds.ClickSubmitButton();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
