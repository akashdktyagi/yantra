package dev.backup.akash.codesnippets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_AccountOverview {
	WebDriver driver;
	

	public PO_AccountOverview(WebDriver d) {
		this.driver = d;
	}
	
	//Locators
	@CacheLookup
	@FindBy(how = How.ID,using="accountTable")
	WebElement tbl_account_overview;
	
	public boolean ValidateAccountOverviewTableIsDisplayed() {
		boolean result = false;
		try {
			result = tbl_account_overview.isDisplayed();
			if (result==true) {
				GenericReusables.WriteLogs("pass", "Account overview table is  found");
			}else {
				GenericReusables.WriteLogs("fail", "Account overview table is not found");
			}
		}catch(Exception e) {
			GenericReusables.WriteLogs("fail", "Exception while trying to find account overview table due to exception: " 
					+ e.toString() );
		}


		
		return result;
	}
	

}//end class
