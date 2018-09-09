package dev.backup.kalyani.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import dev.backup.kalyani.reusables.GenericReusables;



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
		GenericReusables.Writelogs("info", "Account id Selected:"+Account_id);
		}
		catch(NoSuchElementException e)
		{
			GenericReusables.Writelogs("info", "Account No not Selected:");
		}
	}
	public void SetTransactionIdTextbox(String transactionid) 
	{
		try
   		{
   			//WebDriverWait wait =new WebDriverWait(driver, 20);
   		    //wait.until(ExpectedConditions.visibilityOf(txt_transaction_id));
   		    txt_transaction_id.sendKeys(transactionid);
   		    
   		 GenericReusables.Writelogs("pass", " Transaction id Enter successfully:" +transactionid);						
   		  } 
   		 catch (NoSuchElementException e) 
   		 {
   			GenericReusables.Writelogs("fail","ATransaction id not Enter:"+transactionid + "Due to Exception"+ e.toString());
   			e.printStackTrace();
   		   
		}
    }
	 public void Click_On_Find_Transaction() 
	    {
		       btn_find_transaction.click();	
		}
	
}	
	


