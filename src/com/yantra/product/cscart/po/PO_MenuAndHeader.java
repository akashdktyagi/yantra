package com.yantra.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PO_MenuAndHeader {
	
	WebDriver driver;
	public PO_MenuAndHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PO_MenuAndHeader.class);
		
	}

}
