package dev.backup.ravi.assignment.testng;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.ravi.assignment.testng.reusable.GenericResuables;

public class PO_Bill_Pay 
{
	WebDriver driver;
	Select From_Account;
	
	
	@FindBy(how=How.ID,using="payee.name")
	WebElement txtpayee_name;
	@FindBy(how=How.ID,using="payee.address.street")
	WebElement txtpayee_addreass;
	@FindBy(how=How.ID,using="payee.address.city")  
	WebElement txtpayee_city;
	@FindBy(how=How.ID,using="payee.address.state")
	WebElement txtpayee_state;
	@FindBy(how=How.ID,using="payee.address.zipCode")   
	WebElement payee_zipcode;
	@FindBy(how=How.ID,using="payee.phoneNumber")   
	WebElement payee_phone_no;
	@FindBy(how=How.ID,using="payee.accountNumber")   
	WebElement payee_account_no;
	@FindBy(how=How.ID,using="verifyAccount")   
	WebElement payee_verify_acc;
	@FindBy(how=How.ID,using="amount")   
	WebElement payee_amount;
	@FindBy(how=How.ID,using="fromAccountId")   
	WebElement from_acc;
	@FindBy(how=How.CLASS_NAME,using="button")   
	WebElement btnbillpay;
	
	
	
   public void SetPayeeName( String payeename)	
   {
	   try{
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			//wait.until(ExpectedConditions.visibilityOf(txtbx_username));
		   txtpayee_name.sendKeys(payeename);
			GenericResuables.writeLogs("info", "username set with text"+payeename);
		}catch(NoSuchElementException e){
			GenericResuables.writeLogs("fail", "username not set with text:"
					         +payeename + "due to exception" + e.toString()) ;
			             e.printStackTrace();	
		}
		
   } 
	public void SetPayeeAddress( String payeeaddress)
	{
		txtpayee_addreass.sendKeys(payeeaddress);
			
	}
	public void SetPayeeCity(String payeecity)
	{
	txtpayee_city.sendKeys(payeecity);
		
	}
	public void SetPayeeState(String payeestate)
	{
	txtpayee_state.sendKeys(payeestate);
		
	}
	public void set_payee_zipcode(String payeezipcode){
    payee_zipcode.sendKeys(payeezipcode);		
	}
	public void set_payee_phone_no(String phoneno)
	{
		payee_phone_no.sendKeys(phoneno);
	}
	public void set_payee_account(String payeeaccount)
	{
		payee_account_no.sendKeys(payeeaccount);
	}
	public void set_payee_verify_acc(String verifypayeeacc)
	{
		payee_verify_acc.sendKeys( verifypayeeacc);
	}
		
	public void Set_Payee_Amount(String Payeeamount)
	{
		payee_amount.sendKeys(Payeeamount);
	}
	public void select_from_acc()
	{
	 From_Account= new Select(from_acc);
	 From_Account.selectByValue("12345");

		
	}
	public void clickonBillpay()
	{
		btnbillpay.click();
		
	}

	
	
	
	
   
	

}
