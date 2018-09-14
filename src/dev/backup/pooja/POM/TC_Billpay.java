package dev.backup.pooja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dev.backup.pooja.reusable.WebdriverManager;


public class TC_Billpay 
{
  @Test
  public void t_01_Validate_Billpay()
  {
	  WebDriver driver=WebdriverManager.InitializeBrowser("chrome", "http://parabank.parasoft.com/parabank/about.htm") ;
		 String expected_url= "http://parabank.parasoft.com/parabank/about.htm";
	
		 PO_login po_login= PageFactory.initElements(driver, PO_login.class);
		 PO_billpay po_billpay=(PO_billpay) PageFactory.initElements(driver, PO_billpay.class);
		 PO_generic po_generic=(PO_generic) PageFactory.initElements(driver, PO_generic.class);

 

 po_login.loginintoapplication(driver);
 po_generic.Click_on_billpay_Link();
 
 
 
po_billpay.set_payee_name_text_box("pooja"); 
po_billpay.Set_PyeeAddressTextBox("ganjward");
po_billpay.Set_PayeeCityTextBox("nagpur"); 
po_billpay.Set_PyeeStateTextBox("maharashtra"); 
po_billpay.Set_PyeeZipcodeTextBox("442402");
po_billpay.Set_PyeePhoneNoTextBox("7767974967");
po_billpay.Set_VarifyAccountTextBox("30956133");
po_billpay.Set_AmountTextBox("100");
po_billpay.Select_from_Acc();
po_billpay.Click_On_SendPayment();
}
}


