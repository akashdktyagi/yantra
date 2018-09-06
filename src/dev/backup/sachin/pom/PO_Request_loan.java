package dev.backup.sachin.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;



public class PO_Request_loan 
{
	WebDriver driver;
	Select From_Account;
	
	@FindBy(how=How.ID,using="amount")
	WebElement txt_loan_amount;
	@FindBy(how=How.ID,using="downPayment")
	WebElement txt_downpayment;
	@FindBy(how=How.ID,using="fromAccountId")
	WebElement dd_from_account;
	@FindBy(how=How.CLASS_NAME,using="button")
	WebElement btn_applynow;
	
	 public void Set_Amount_TextBox(String amount)
		{
			try
			{
				//WebDriverWait wait =new WebDriverWait(driver, 20);
			   //wait.until(ExpectedConditions.visibilityOf(txtamount));
			    txt_loan_amount.sendKeys(amount);
			    
			    GunericReusable.WriteLogs("info", "Loan Amount enter succesfully:" + amount);			
						
			} 
			catch (NoSuchElementException e) 
			{
				GunericReusable.WriteLogs("fail","Loan Amount not enter :"+amount + "Due to Exception"+ e.toString());
				e.printStackTrace();
			   
			}
		}
	 public void Set_DownPayment_TextBox(String amount)
		{
			try
			{
				//WebDriverWait wait =new WebDriverWait(driver, 20);
			   //wait.until(ExpectedConditions.visibilityOf(txtamount));
			    txt_downpayment.sendKeys(amount);
			    
			    GunericReusable.WriteLogs("info", "DownPayment Amount enter succesfully:" + amount);			
						
			} 
			catch (NoSuchElementException e) 
			{
				GunericReusable.WriteLogs("fail","DownPayment Amount not enter :"+amount + "Due to Exception"+ e.toString());
				e.printStackTrace();
			   
			}
		}
	   public void Select_from_Acc()
		{
			try 
			{
			From_Account =new Select(dd_from_account);
			 From_Account.selectByValue("12345");
			 GunericReusable.WriteLogs("Pass", "Debit Account selected:"+From_Account);
				
				
			} catch (NoSuchElementException e) {
				GunericReusable.WriteLogs("Fail", "Unable Debit Account selected: "+From_Account);
			}
		}
	      public void Click_Apply_Now() 
		{
			btn_applynow.click();		
			GunericReusable.WriteLogs("info", "loan request Procced");
		}
	
	

}
