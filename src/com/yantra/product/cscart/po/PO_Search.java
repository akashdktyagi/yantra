package com.yantra.product.cscart.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yantra.driver.ExtentReportBase;

import junit.framework.Assert;

public class PO_Search extends UIman{

	WebDriver driver;
	//com.yantra.core.managers.UIManager UIManager = new com.yantra.core.managers.UIManager();

	public PO_Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PO_Search.class);
		
	}

	
	@FindBy(how=How.XPATH,using = "//form[@name ='search_form']/input[@id = 'search_input']" )
	WebElement input_search_view_change;
	
	@FindBy(how=How.XPATH,using = "//button[text()='Add to cart']" )
	List<WebElement> col_list_of_add_to_cart_button;
	
	@FindBy(how=How.XPATH,using = "//span[@class = 'ty-price-num']" )
	List<WebElement> col_list_of_product_prices;
	
	@FindBy(how=How.XPATH,using = "//span[@class='ty-minicart-title ty-hand']/span[2]/bdi/span" )
	WebElement txt_my_cart_price;
	
	
	

	public void ClickOnBtnToChangeSearchViewToList() {
		input_search_view_change.click();
		
		UIManager.ClickElement(input_search_view_change);
	
	}
	
	
	public void KW_ClickAndValidateAddToCart(int index) {
		  col_list_of_add_to_cart_button.get(index).click();
		  int price_exp = Integer.parseInt(col_list_of_product_prices.get(index).getText());
		  String total_my_cart_actaul = txt_my_cart_price.getText();
		  
		  Assert.assertEquals(price_exp, total_my_cart_actaul);
		  
	}//end method
	
	public void KW_ClickAndValidateAddToCart(String product_name) {
			  
	}//end method
	
	public void KW_IncreaseCountProductInSearch(String product_name, int quantity) {
		
	}
	
	public void KW_SelectSortCondition(String name) {
		
	}

	  

	  
	  /*
	  //Check point
	  Assert.assertEquals(my_cart_total_price_actual, total_price_expected);
	  
	  //  Fetch All the product Codes and compare them with 
	  // Items displayed in the view Cart Section
	  
	  List<WebElement> col_prod_code_expected = driver.findElements(By.xpath("//span[@class='ty-control-group__item']"));
	  
	  
	  //Click on the Cart Icon
	  driver.findElement(By.xpath("//i[@class='ty-minicart__icon ty-icon-moon-commerce filled")).click();
	  
	  //Click on View Cart
	  driver.findElement(By.linkText("View cart")).click();
	  
	  List<WebElement> col_prod_code_actual = 
			  driver.findElements(By.xpath("//span[contains(@class,'product_code_update_')]"));
			  */
	  
}//end class

/*
 * We can use these annotations in those cases when we have more than a single criteria to to identify one or more WebElement objects.

@FindBys : When the required WebElement objects need to match all of the given criteria use @FindBys annotation

@FindAll : When required WebElement objects need to match at least one of the given criteria use @FindAll annotation

Usage:

@FindBys( {
   @FindBy(className = "class1")
   @FindBy(className = "class2")
} )
private List<WebElement> elementsWithBoth_class1ANDclass2;
Here List elementsWithBothclass1ANDclass2 will contain any WebElement which satisfies both criteria.

@FindAll({
   @FindBy(className = "class1")
   @FindBy(className = "class2")
})
private List<WebElement> elementsWithEither_class1ORclass2  
Here List elementsWithEither_class1ORclass2 will contain all those WebElement that satisfies any one of the criteria.
*/
