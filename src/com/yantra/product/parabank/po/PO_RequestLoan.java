package com.yantra.product.parabank.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_RequestLoan {
	WebDriver driver;
	@FindBy(id="amount")
	private WebElement  loanamount;
	@FindBy(id="downPayment")
	private WebElement downpayment;
	@FindBy(id="fromAccountId")
	private WebElement fromaccount;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement apply;
	
	private void Setloanamount(String a)
	{
		 loanamount.sendKeys("loanamount");
	 }
	
	private void Setdownpayment(String a)
	{
		 downpayment.sendKeys("downpayment");
	 }
	private void Setdfromaccount(String accountno)
	{
		 fromaccount.sendKeys("accountno");
	 }

}
