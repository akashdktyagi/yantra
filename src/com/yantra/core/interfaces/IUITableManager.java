package com.yantra.core.interfaces;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public interface IUITableManager {

	public void GetUITableText();
	public void GetRowWithCellText();
	public List<WebElement> GetChildItemsWithRowAndClm(int row, int clm, By desc);
	
	
}
