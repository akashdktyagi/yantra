package dev.backup.kalyani.pom;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.kalyani.reusables.GenericReusables;
import dev.backup.sachin.pom.GunericReusable;



public class PO_billpay 
{
	WebDriver driver;
	Select From_Account;
	
	

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
	
	
	
	
	public void set_payee_name_text_box(String payee_name){
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(txt_payee_name));
		txt_payee_name.sendKeys(payee_name);
		
		GenericReusables.Writelogs("info","payee_name set with text:" +payee_name);
		}
		catch(NoSuchElementException e)
		{
			GenericReusables.Writelogs("fail","payee_name not set with text:" +payee_name+"Due to Exception"+e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "Enter Address:" + payeeaddress);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","Address not Enter:"+payeeaddress + "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "Enter city name:" + payeecity);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","City name Enter:"+payeecity + "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("pass", "State :" + payeestate);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","State is not enter :"+payeestate + "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "zipcode enter:" + payeezipcode);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","zipcode not enter:"+payeezipcode+ "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "Phone no enter:" + phoneno);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","Phone no not enter:"+phoneno + "Due to Exception"+ e.toString());
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
	   	 
	   		    GunericReusable.WriteLogs("info", "Account no enter:" + payeeaccount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","Account no not enter:"+payeeaccount + "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "Account no varified:" + varifyaccount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","Account no not varified:"+varifyaccount + "Due to Exception"+ e.toString());
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
	   		    
	   		    GunericReusable.WriteLogs("info", "Amount enter succesfully:" + amount);						
	   		  } 
	   		 catch (NoSuchElementException e) 
	   		 {
	   			GunericReusable.WriteLogs("fail","Amount not enter succesfully:"+amount + "Due to Exception"+ e.toString());
	   			e.printStackTrace();
	   		   
	   		}
	   	}
	    public void Select_from_Acc()
	   	{
	   		try
	   		{
	           From_Account=new Select(from_account);
	   	       From_Account.selectByValue("12345");
	   		   GunericReusable.WriteLogs("Pass", "Debit Account selected:"+From_Account);
	   			
	   			
	   		} catch (NoSuchElementException e) {
	   			GunericReusable.WriteLogs("Fail", "Unable Debit Account selected: "+From_Account);
	   		}
	   	}
	   public void Click_On_SendPayment() 
	    {
		       btn_Sendpayment.click();	
		}
		
		
}
