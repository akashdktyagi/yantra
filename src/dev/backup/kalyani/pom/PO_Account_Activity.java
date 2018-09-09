package dev.backup.kalyani.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import dev.backup.sachin.pom.GunericReusable;

public class PO_Account_Activity 
{
	WebDriver driver;
	Select activity_peried;
	Select transaction_type;
	
	
	@FindBy(how=How.ID,using="month")
	WebElement Activity_Periad;
	@FindBy(how=How.ID,using="transactionType")
	WebElement Transaction_type;
	@FindBy(how=How.CLASS_NAME,using="button")
	WebElement btngo;
	
	public void Select_Activity_Periad()
	{
		try {
			 activity_peried=new Select(Activity_Periad);
			 activity_peried.selectByValue("August");
			 GunericReusable.WriteLogs("Pass", "Activity Periad selected:"+activity_peried);		
			} 
		catch (NoSuchElementException e) 
		    {
				GunericReusable.WriteLogs("Fail", "Activity Periad not selected: "+activity_peried);
			}
		}
	public void Select_transaction_Type()
	{
		try {
			 transaction_type=new Select(Transaction_type);
			 transaction_type.selectByValue("Debit");
			 GunericReusable.WriteLogs("Pass", "Transaction Type selected:"+transaction_type);		
			} 
		catch (NoSuchElementException e) 
		    {
				GunericReusable.WriteLogs("Fail", "Unable to Select Transaction Type: "+transaction_type);
			}
	}
	public void Click_On_Go() 
	{
		btngo.click();	
      		
	}
}
	




