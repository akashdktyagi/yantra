package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.yantra.core.managers.UIManager;

public class PO_RequestLoan  {
	WebDriver driver;
	UIManager o_ui_action=null;
	@FindBy(id="amount")
	private WebElement Loanamount;
	@FindBy(id="downPayment")
	private WebElement Downpayment;
	@FindBy(id="fromAccountId")
	private WebElement Fromaccount;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Apply;
	@FindBy(id="loanStatus")
	private WebElement Status;
	
	public PO_RequestLoan(WebDriver d){
		driver = d;

		o_ui_action = new UIManager();
	}
	private void Setloanamount(String amount)
	{
		 //loanamount.sendKeys(amount);
		 o_ui_action.SetElementText(Loanamount, amount);

	 }
	
	private void SetDownpayment(String payment)
	{
		// Downpayment.sendKeys("payment");
		o_ui_action.SetElementText(Downpayment, payment);
		
	 }
	private void SelectdFromaccount(String accountno)
	{
		Select frm_acc= new Select(Fromaccount);
		frm_acc.selectByVisibleText(accountno);
	 }
	private void ClickApply()
	{
		//Apply.click();
		o_ui_action.ClickElement(Apply);
	}
	private String Successfull() 
	{
		return Status.getText();
		//o_ui_action.GetElementAttribute(Status, loanstatus);
		
	}
	public void kw_request_loan(String amount, String payment, String accountno) 
	{
		Setloanamount(amount);
		SetDownpayment(payment);
		SelectdFromaccount(accountno);
		ClickApply();
		Successfull();
		
		
	}
}
