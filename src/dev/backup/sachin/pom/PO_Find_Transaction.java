package dev.backup.sachin.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PO_Find_Transaction 
{
	WebDriver driver;
	
	
	@FindBy(how=How.ID,using="accountId")
	WebElement account_no;
	
	@FindBy(how=How.ID,using="criteria.transactionId")
	WebElement txt_transaction_id;
	
	@FindBy(how=How.CLASS_NAME,using="button")
	WebElement btn_find_transaction;
	
	public void SelectAccountId() 
	{
		try
		{
		Select Account_id=new Select(account_no);
		Account_id.selectByValue("12345");
		GunericReusable.WriteLogs("info", "Account id Selected:"+Account_id);
		}
		catch(NoSuchElementException e)
		{
			GunericReusable.WriteLogs("info", "Account No not Selected:");
		}
	}
	public void SetTransactionIdTextbox(String transactionid) 
	{
		try
   		{
   			//WebDriverWait wait =new WebDriverWait(driver, 20);
   		    //wait.until(ExpectedConditions.visibilityOf(txt_transaction_id));
   		    txt_transaction_id.sendKeys(transactionid);
   		    
   		    GunericReusable.WriteLogs("pass", " Transaction id Enter successfully:" +transactionid);						
   		  } 
   		 catch (NoSuchElementException e) 
   		 {
   			GunericReusable.WriteLogs("fail","ATransaction id not Enter:"+transactionid + "Due to Exception"+ e.toString());
   			e.printStackTrace();
   		   
		}
    }
	 public void Click_On_Find_Transaction() 
	    {
		       btn_find_transaction.click();	
		}
	
}	
	
