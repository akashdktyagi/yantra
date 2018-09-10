package dev.backup.pooja.POM;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.pooja.reusable.GenericReusable;


public class PO_login 
{
WebDriver driver;
public PO_login (WebDriver Driver1)
{
this.driver=Driver1;
}
@FindBy(how=How.NAME,using="username")
WebElement txtusername;
@FindBy(how=How.NAME,using="password")
WebElement txtpassword;
@FindBy(how=How.XPATH,using="//input[@value='Log In']")
WebElement btn_login;


public void set_username_text_box(String username){
	try
	{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(txtusername));
	txtusername.sendKeys(username);
	
	GenericReusable.WriteLogs("info","username set with text:" +username);
	}
	catch(NoSuchElementException e)
	{
		GenericReusable.WriteLogs("fail","username not set with text:" +username+"Due to Exception"+e.toString());
		e.printStackTrace();
	}
	
}

public void set_password_text_box(String password){
	try
	{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(txtpassword));
	txtpassword.sendKeys(password);
	
	GenericReusable.WriteLogs("info","password set with :" +password);
	}
	catch(NoSuchElementException e)
	{
		GenericReusable.WriteLogs("fail","password is not set with text:" +password+"Due to Exception"+e.toString());
		e.printStackTrace();
	}
	
}


public void click_login_button()
{
	try
	{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(btn_login));
	btn_login.click();
	GenericReusable.WriteLogs("info","click on log_in button :" +btn_login);
	}
	catch(NoSuchElementException e)
	{
		GenericReusable.WriteLogs("fail","unabe to click on log_in button:" +btn_login+"Due to Exception"+e.toString());
		e.printStackTrace();
	}
	
}
}

 