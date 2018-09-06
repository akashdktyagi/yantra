package dev.backup.sachin.pom;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PO_login {
	WebDriver driver;
	public PO_login(WebDriver Driver1)
	{
		this.driver=Driver1;
		
	}
	@FindBy(how=How.NAME,using="username")
	WebElement txtusername;
	//@FindBy(how=H)
	
	@FindBy(how=How.NAME,using="password")
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	WebElement btn_login;
	
	
	public void	SetUserNameTextBox(String username)
	{
		try
		{
			WebDriverWait wait =new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOf(txtusername));
		    txtusername.sendKeys(username);
		    
		    GunericReusable.WriteLogs("info", "UserName Set with Text:" + username);			
					
		} 
		catch (NoSuchElementException e) 
		{
		GunericReusable.WriteLogs ("fail","UserName not Set with text:"+username + "Due to Exception"+ e.toString());
			e.printStackTrace();
		   
		}
		
	}
	public void SetPasswordTextBox(String password)
	{
		try{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(txtpassword));
		txtpassword.sendKeys(password);
		 GunericReusable.WriteLogs("info", "Password Set with:"+password);
		}
		catch (NoSuchElementException e)
		{
		  GunericReusable.WriteLogs("fail", "Password not set with text:"+password +"Due to Exception"+ e.toString());
		  e.printStackTrace();
		
		}
		
	}
	public void Click_Login_Button()
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(btn_login));
			btn_login.click();
			GunericReusable.WriteLogs("info","Click on log_in Button:"+btn_login);
			
		} catch (NoSuchElementException e) {
			GunericReusable.WriteLogs("fail", "Unable to click login Button:"+btn_login +"Due to Exception"+ e.toString());
			e.printStackTrace();
			
		}
		
	}
	public static void loginintoapplication(WebDriver driver)
	{
		
		PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		po_login.SetUserNameTextBox("john");
		po_login.SetPasswordTextBox("demo");
		po_login.Click_Login_Button();
	}

}



