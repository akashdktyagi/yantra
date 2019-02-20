package com.yantra.product.cscart.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PO_MenuAndHeader {
	
	WebDriver driver;
	public PO_MenuAndHeader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PO_MenuAndHeader.class);
		
	}
	
	@FindBy(how=How.ID,using = "search_input" )
	WebElement txtbx_search_bx;
	
	@FindBy(how=How.XPATH,using = "//button[@class = 'ty-search-magnifier']" )
	WebElement btn_search_magni;
	
	@FindBy(how=How.ID,using = "//form[@name ='search_form']/input[@id = 'search_input']" )
	WebElement input_search_view_change;
	
	private void SetTextInSearchBox(String text) {
		txtbx_search_bx.sendKeys(text);
	}

	private void ClickOnSearchMagnifyingLink() {
		btn_search_magni.click();
	}

	public void ClickOnBtnToChangeSearchViewToList(String text) {
		input_search_view_change.click();
	}
	
	public void KW_SearchProductFromSearchTextBox(String text) {
		SetTextInSearchBox(text);
		ClickOnSearchMagnifyingLink();
		
	}
	

	

	  

}
