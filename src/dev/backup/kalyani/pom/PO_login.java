package dev.backup.kalyani.pom;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.kalyani.reusables.GenericReusables;




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
	
	GenericReusables.Writelogs("info","username set with text:" +username);
	}
	catch(NoSuchElementException e)
	{
		GenericReusables.Writelogs("fail","username not set with text:" +username+"Due to Exception"+e.toString());
		e.printStackTrace();
	}
	
}

public void set_password_text_box(String password){
	try
	{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(txtpassword));
	txtpassword.sendKeys(password);
	
	GenericReusables.Writelogs("info","password set with :" +password);
	}
	catch(NoSuchElementException e)
	{
		GenericReusables.Writelogs("fail","password is not set with text:" +password+"Due to Exception"+e.toString());
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
	GenericReusables.Writelogs("info","click on log_in button :" +btn_login);
	}
	catch(NoSuchElementException e)
	{
		GenericReusables.Writelogs("fail","unabe to click on log_in button:" +btn_login+"Due to Exception"+e.toString());
		e.printStackTrace();
	}
}
	public static void loginintoapplication(WebDriver driver)
	{
		
		PO_login po_login=PageFactory.initElements(driver, PO_login.class);
		po_login.set_username_text_box("john");
		po_login.set_password_text_box("demo");
		po_login.click_login_button();
	}

}




	


