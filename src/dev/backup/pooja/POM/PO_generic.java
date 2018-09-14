package dev.backup.pooja.POM;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PO_generic 
{
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using="Open New Account")
	WebElement link_open_Account;
	
	@FindBy(how=How.LINK_TEXT,using="12345")
	WebElement Account_no;
	
	@FindBy(how=How.LINK_TEXT,using="Transfer funds")
	WebElement link_Transfer_fund;
	
	@FindBy(how=How.LINK_TEXT,using="Request loan")
	WebElement link_Request_loan;
	
	
	@FindBy(how=How.LINK_TEXT,using="Bill Pay")
	WebElement link_BillPay;

	@FindBy(how=How.LINK_TEXT,using="find_Transaction")
	WebElement link_find_transaction;
	
	
	
	
	public void Click_On_Account_No() {
		try {
		
			Account_no.click();
		GenericReusable.WriteLogs("info","Click on Account_no:"+Account_no);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to click Open new Account:"+Account_no+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}
	
	public void Click_on_open_New_Account_Link() {
		try {
		
			link_open_Account.click();
		GenericReusable.WriteLogs("info","Click on Open new Account:"+link_open_Account);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to click Open new Account:"+link_open_Account+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}

	public void Click_on_Transfer_fund_Link() {
		try {
		
			link_Transfer_fund.click();
		GenericReusable.WriteLogs("info","Click on link_Transfer_fund:"+link_Transfer_fund);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to click link_Transfer_fund:"+link_Transfer_fund+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}

	public void Click_on_Request_Loan_Link() {
		try {
		
			link_Request_loan.click();
		GenericReusable.WriteLogs("info","Click on link_Request_loan:"+link_Request_loan);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to click link_Request_loan:"+link_Request_loan+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}

	public void Click_on_billpay_Link() {
		try {
		
			link_BillPay.click();
		GenericReusable.WriteLogs("info","Click on link_billpay:"+link_BillPay);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to click link_billpay:"+link_BillPay+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}
	public void Click_on_find_transaction_link() {
		try {
	
			link_find_transaction.click();
		GenericReusable.WriteLogs("info","Click on link_find_transaction:"+link_find_transaction);
			
		} 
		catch (NoSuchElementException e) 
		{
			GenericReusable.WriteLogs("fail", "Unable to  click link_find_transaction:"+link_find_transaction+"Due to Exception"+ e.toString());
			e.printStackTrace();	
	    }
		
	}






	


}
