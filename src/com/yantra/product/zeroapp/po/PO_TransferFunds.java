/**
 * 
 */
package com.yantra.product.zeroapp.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Akash Tyagi
 *
 */
public class PO_TransferFunds {

	//1
	WebDriver driver;
	
	//2
	public PO_TransferFunds(WebDriver d) {
		
		//3
		this.driver = d;
	}

	//Locators
	@FindBy(how = How.ID,using = "tf_fromAccountId")
	WebElement list_from;
	
	@FindBy(how = How.ID,using = "tf_toAccountId")
	WebElement list_to;
	
	@FindBy(how = How.ID,using = "tf_amount")
	WebElement txtbox_amount;
	
	@FindBy(how = How.ID,using = "tf_description")
	WebElement txtbox_descp;
	
	@FindBy(how = How.ID,using = "btn_submit")
	WebElement btn_submit;
	
	
	//Methods
	public void SelectFromAccount(String arg) {
		Select obj = new Select(list_from);
		obj.selectByVisibleText(arg);
	}
	
	public void SelectToAccount(String arg) {
		
	}
	
	public void SetAmountTextBox(String arg) {
		txtbox_amount.sendKeys(arg);
	}
	
	public void SetDescriptionTextBox(String arg) {
		txtbox_descp.sendKeys(arg);
	}
	
	public void ClickSubmitButton() {
		btn_submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
