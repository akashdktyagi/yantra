package dev.backup.akash.classroomprograms.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_CmnPageObjects {
	WebDriver driver;
	public PO_CmnPageObjects(WebDriver driver) {
		this.driver  = driver;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Transfer Funds")
	private WebElement link_transfer_funds;
	
	public void ClickTransferFunds() {
		link_transfer_funds.click();
	}
}
