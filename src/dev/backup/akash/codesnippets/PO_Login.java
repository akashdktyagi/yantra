package dev.backup.akash.codesnippets;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_Login {
	//Step1 : Define the driver
	WebDriver driver;

	//Step 2: Paramatrize the constructor
	public PO_Login(WebDriver driver1) {
		this.driver = driver1;
	}

	//Step 3: Declare the Locators
	// Two ways to declare Locators
	@FindBy(how=How.NAME,using="username") 
	WebElement txtbx_username;

	@FindBy(how=How.NAME,using="password") 
	WebElement txtbx_password;

	@FindBy(how=How.XPATH,using="//input[@type='submit']") 
	WebElement btn_login;

	/*
	@FindBy(id = "dsf") 
	WebElement sdfds;
	 */

	//Set user name
	public void SetUserNameTextBox(String username) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(txtbx_username));

			txtbx_username.sendKeys(username);	

			GenericReusables.WriteLogs("info", "User Name set with text: " + username);

		}catch(NoSuchElementException e) {
			GenericReusables.WriteLogs("fail", "User Name not set with text: "
					+ username + " due to exception " + e.toString());
			e.printStackTrace();
		}
	}

	//Set user name
	public void SetPasswordTextBox(String password) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(txtbx_password));

			txtbx_password.sendKeys(password);	

			GenericReusables.WriteLogs("info", "Password set with text: " + txtbx_password);

		}catch(NoSuchElementException e) {
			GenericReusables.WriteLogs("fail", "Password not set with text: "
					+ password + " due to exception " + e.toString());
			e.printStackTrace();
		}

	}//end Method

	//Set user name
	public void ClickLoginButton() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(txtbx_password));

			btn_login.click();

			GenericReusables.WriteLogs("info", "Clicked on Login Button");

		}catch(NoSuchElementException e) {
			GenericReusables.WriteLogs("fail", "Unable to click on login button"
					+ " due to exception " + e.toString());
			e.printStackTrace();
		}

	}//end Method

}//end class
