package dev.backup.pooja.POM;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import dev.backup.pooja.reusable.GenericReusable;


public class PO_billpay {
	@FindBy(how=How.ID,using="payee.name")
	WebElement txt_payee_name;
	@FindBy(how=How.NAME,using="payee.address.street")
	WebElement txt_address;
	@FindBy(how=How.NAME,using="payee.address.city")
	WebElement txt_city;
	@FindBy(how=How.NAME,using="payee.address.state")
	WebElement txt_state;
	@FindBy(how=How.NAME,using="payee.address.zipCode")
	WebElement txt_zipCode;
	@FindBy(how=How.NAME,using="payee.phoneNumber")
	WebElement txt_phoneNumber;
	@FindBy(how=How.NAME,using="payee.accountNumber")
	WebElement txt_account;
	@FindBy(how=How.NAME,using="verifyAccount")
	WebElement txt_verifyAccount;
	@FindBy(how=How.NAME,using="amount")
	WebElement txt_amount;
	@FindBy(how=How.ID,using="fromAccountId")
	WebElement from_account;
    @FindBy(how=How.CLASS_NAME,using="button")
    WebElement btn_Sendpayment;
	private Select From_account;
	private Select From_Account;
	
	
	
	
	public void set_payee_name_text_box(String payee_name){
		try
		{
		
		txt_payee_name.sendKeys(payee_name);
		
		GenericReusable.WriteLogs("info","payee_name set with text:" +payee_name);
		}
		catch(NoSuchElementException e)
		{
			GenericReusable.WriteLogs("fail","payee_name not set with text:" +payee_name+"Due to Exception"+e.toString());
			e.printStackTrace();
		}
		
	}
	
	 public void Set_PyeeAddressTextBox(String payeeaddress)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_address));
	   		    txt_address.sendKeys(payeeaddress);
	   		    
	   		    GenericReusable.WriteLogs("info", "Enter Address:" + payeeaddress);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","Address not Enter:"+payeeaddress + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_PayeeCityTextBox(String payeecity)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_city));
	   		    txt_city.sendKeys(payeecity);
	   		    
	   		    GenericReusable.WriteLogs("info", "Enter city name:" + payeecity);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","City name Enter:"+payeecity + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_PyeeStateTextBox(String payeestate)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		    //wait.until(ExpectedConditions.visibilityOf(txt_state));
	   		    txt_state.sendKeys(payeestate);
	   		    
	   		    GenericReusable.WriteLogs("pass", "State :" + payeestate);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","State is not enter :"+payeestate + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_PyeeZipcodeTextBox(String payeezipcode)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_zipcode));
	   		    txt_zipCode.sendKeys(payeezipcode);
	   		    
	   		    GenericReusable.WriteLogs("info", "zipcode enter:" + payeezipcode);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","zipcode not enter:"+payeezipcode+ "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_PyeePhoneNoTextBox(String phoneno)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		    //wait.until(ExpectedConditions.visibilityOf(txt_phone_no));
	   		    txt_phoneNumber.sendKeys(phoneno);
	   		    
	   		    GenericReusable.WriteLogs("info", "Phone no enter:" + phoneno);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","Phone no not enter:"+phoneno + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_PyeeAccountTextBox(String payeeaccount)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_account));
	   		    txt_account.sendKeys(payeeaccount);
	   	 
	   		    GenericReusable.WriteLogs("info", "Account no enter:" + payeeaccount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","Account no not enter:"+payeeaccount + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_VarifyAccountTextBox(String varifyaccount)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_varify_aacount));
	   		    txt_account.sendKeys(varifyaccount);
	   		    
	   		    GenericReusable.WriteLogs("info", "Account no varified:" + varifyaccount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","Account no not varified:"+varifyaccount + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Set_AmountTextBox(String amount)
	   	{
	   		try
	   		{
	   			//WebDriverWait wait =new WebDriverWait(driver, 20);
	   		   // wait.until(ExpectedConditions.visibilityOf(txt_amount));
	   		    txt_amount.sendKeys(amount);
	   		    
	   		    GenericReusable.WriteLogs("info", "Amount enter succesfully:" + amount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GenericReusable.WriteLogs("fail","Amount not enter succesfully:"+amount + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Select_from_Acc()
	   	{
	   		try
	   		{
	            From_Account = new Select(from_account);
	   	        From_Account.selectByValue("12345");
	   		   GenericReusable.WriteLogs("Pass", "Debit Account selected:"+from_account);
	   			
	   			
	   		} catch (NoSuchElementException e) {
	   			GenericReusable.WriteLogs("Fail", "Unable Debit Account selected: "+from_account);
	   		}
	   	}
	   public void Click_On_SendPayment() 
	    {
		       btn_Sendpayment.click();	
		}
		
		
}
