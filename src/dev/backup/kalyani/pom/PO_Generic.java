package dev.backup.kalyani.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.sachin.pom.GunericReusable;

public class PO_Generic {
WebDriver driver;

@FindBy(how=How.LINK_TEXT,using="Open New Account")
WebElement link_open_Account;

@FindBy(how=How.LINK_TEXT,using="12345")
WebElement Account_no;

@FindBy(how=How.LINK_TEXT,using="Transfer Funds")
WebElement link_transfer_funds;

@FindBy(how=How.LINK_TEXT,using="Request Loan")
WebElement link_Request_Loan; 

@FindBy(how=How.LINK_TEXT,using="Bill Pay")
WebElement link_Billpay;

@FindBy(how=How.LINK_TEXT,using="Find Transactions")
WebElement link_find_transactions;



public void Click_On_Account_No() {
	try {
	
		Account_no.click();
		GunericReusable.WriteLogs("info","Click on Account no:"+Account_no);
		
	} 
	catch (NoSuchElementException e) 
	{
		GunericReusable.WriteLogs("fail", "Unable to click on Account no:"+Account_no+"Due to Exception"+ e.toString());
		e.printStackTrace();	
    }
	
}



public void Click_On_Open_New_Account_link()
{
	try {
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(link_open_Account));
		link_open_Account.click();
		GunericReusable.WriteLogs("info", "Click on Open new Account:"+link_open_Account);
		
	} 
	catch (NoSuchElementException e) 
	{
		GunericReusable.WriteLogs("fail","Unable to Click Open new Account:"+link_open_Account+"Due to exception" + e.toString());
		e.printStackTrace();
		
		
	}
}


public void Click_On_Transfer_Funds_link()
{
	try {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(link_transfer_funds));
		link_transfer_funds.click();
		GunericReusable.WriteLogs("info", "Click on Transfer funds link:"+link_transfer_funds);
		
	} 
	catch (NoSuchElementException e) 
	{
      GunericReusable.WriteLogs("fail","Transfer funds link is not clickable:"+link_transfer_funds+"Due to exception"  +e.toString());
		e.printStackTrace();			

 }
}
public void Click_On_Request_loan_link()
{
	try {
			//WebDriverWait wait= new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.visibilityOf(link_Request_Loan));
			link_Request_Loan.click();
			GunericReusable.WriteLogs("info", "Click on Request loan link:");
				
			} 
		catch (NoSuchElementException e) 
			{
		   GunericReusable.WriteLogs("fail"," Unable to Click on Request loan link:"+link_Request_Loan+"Due to exception"  +e.toString());
				e.printStackTrace();
				
       }
	}

public void Click_On_Bill_Pay_Link()
{
	try {
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(link_Billpay));
		link_Billpay.click();
		GunericReusable.WriteLogs("pass", "Click on Billapy:"+link_Billpay);			
	} 
	catch (NoSuchElementException e) 
	{
GunericReusable.WriteLogs("fail"," Unable Click on Billapy link:"+link_Billpay+"Due to exception"  +e.toString());
		e.printStackTrace();
				
	}
}

public void Click_On_find_Transaction_link()
{
	try {
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(link_find_transactions));
		link_find_transactions.click();
		GunericReusable.WriteLogs("info", "Click on find transaction link:"+link_find_transactions);			
	} 
	catch (NoSuchElementException e) 
	{
GunericReusable.WriteLogs("fail"," Unable Click on find transaction link:"+link_find_transactions+"Due to exception" +e.toString());
		e.printStackTrace();
				
	}
}}
	


