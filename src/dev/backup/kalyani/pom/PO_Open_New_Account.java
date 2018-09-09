package dev.backup.kalyani.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.sachin.pom.GunericReusable;

public class PO_Open_New_Account 
{
	WebDriver driver;
	Select acc_type;
	Select from_account;
	
	
	
	@FindBy(how=How.ID,using="type")
	 WebElement Account_Type;
	
	@FindBy(how=How.ID,using="fromAccountId")
	WebElement from_Acc;
	
	@FindBy(how=How.XPATH,using="//input[@class='button']")
	WebElement btn_open_new_account;
	
	@FindBy(how=How.XPATH,using="//a[@id='newAccountId']")
	WebElement linknewAccountNo;
	
	public void Select_Account_Type()
	{
	 try {
		 acc_type=new Select(Account_Type);
		 acc_type.selectByIndex(0);
		 
	     GunericReusable.WriteLogs("pass", "Account type seleted:"+acc_type);
		
	} catch (NoSuchElementException e) {
		GunericReusable.WriteLogs("fail", "unable to select:"+acc_type);
		
	}
	
	 }
	
	public void Select_from_Acc()
	{
		try {
		 from_account=new Select(from_Acc);
		 from_account.selectByValue("13344");
		 GunericReusable.WriteLogs("Pass", "Account no selected");
			
			
		} catch (NoSuchElementException e) {
			GunericReusable.WriteLogs("Fail", "Account not selected: "+from_account);
		}
	}
	public void ClickOn_Open_New_Account() 
	{
		btn_open_new_account.click();
			
	}
	public void ClickOnNewAccountNo() 
	{

		WebDriverWait wait =new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(linknewAccountNo));
		linknewAccountNo.click();
			
	}
	
	/*public static void InitopenNewAccount(WebDriver driver) 
	{
		PO_Open_New_Account po_Open_New_Account=PageFactory.initElements(driver, PO_Open_New_Account.class);
		po_Open_New_Account.Select_Account_Type();
		po_Open_New_Account.Select_from_Acc();
		po_Open_New_Account.ClickOn_Open_New_Account();
		po_Open_New_Account.ClickOnNewAccountNo();*/
		
	}
	




