package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Guneric 
{
	@FindBy(how=How.LINK_TEXT,using="Bill Pay")
	WebElement link_bill_pay;

    @FindBy(how=How.LINK_TEXT,using="Open New Account")
    WebElement link_open_new_account;

    @FindBy(how=How.LINK_TEXT,using="Find Transactions")
    WebElement link_find_trasaction;

    @FindBy(how=How.LINK_TEXT,using="Update Contact Info")
    WebElement link_update_contact_info;


	public void click_on_open_new_account_link() 
	{
		link_open_new_account.click();
		
	}
	public void click_on_bill_pay_link() 
	{
		link_bill_pay.click();
		
	}
	public void click_find_trasaction_link() {
		link_find_trasaction.click();
		
	}
	public void click_on_update_contact_info__link() {
		link_update_contact_info.click();
	}
}
