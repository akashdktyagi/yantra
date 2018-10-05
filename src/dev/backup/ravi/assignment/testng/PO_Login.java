package dev.backup.ravi.assignment.testng;

import java.beans.Visibility;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.backup.ravi.assignment.testng.reusable.GenericResuables;

public class PO_Login {
	//step1: define the driver
	WebDriver driver;
	//step2: paramatrize constructor
	public PO_Login(WebDriver driver1){
	this.driver=driver1;

}
//step3: declare the locators
//two ways to declare locator
@FindBy(how=How.NAME,using="username")
WebElement txtbx_username;

@FindBy(how=How.NAME,using="password")
WebElement txtbx_password;

@FindBy(how=How.XPATH,using="//input[@type='submit']")
WebElement btn_login;


//set username
public void SetUsernameTextBox(String username){
	try{
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(txtbx_username));
		txtbx_username.sendKeys(username);
		GenericResuables.writeLogs("info", "username set with text"+username);
	}catch(NoSuchElementException e){
		GenericResuables.writeLogs("fail", "username not set with text:"
				         +username + "due to exception" + e.toString()); 
		             e.printStackTrace();

	}}
//set password
public void SetPasswordTextBox(String password){
	try{
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(txtbx_password));
		txtbx_password.sendKeys(password);
		GenericResuables.writeLogs("info", "password set with text"+txtbx_password);
	}catch(NoSuchElementException e){
		GenericResuables.writeLogs("fail", "password not set with text:"
				         +password + "due to exception" + e.toString()); 
		             e.printStackTrace();

	}}
//click login button
public void ClickLoginButton(){
	
	try{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(btn_login));
		btn_login.click();
		GenericResuables.writeLogs("info", "clicked on Login Button");
	}catch(NoSuchElementException e){
		GenericResuables.writeLogs("fail", "unable to click on login button"
				                 + "due to exception" + e.toString()); 
		             e.printStackTrace();
	}//end method
	}//end class

	
	
	
	
	
}

		             
		             
		             
		             
		             
		             














