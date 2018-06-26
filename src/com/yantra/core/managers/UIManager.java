/**
 * 
 */
package com.yantra.core.managers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.yantra.core.interfaces.ILogAndReport;
import com.yantra.core.interfaces.IUIManager;


/**
 * @author akashtyagi
 *
 */
class UIManager implements IUIManager,ILogAndReport {
	
	WebElement _locator;
	final Logger logger = Logger.getLogger(UIManager.class);

	/**
	 * 
	 */
	public UIManager(WebElement sLocator) {
		// TODO Auto-generated constructor stub
		this._locator = sLocator;
		

	}

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#Click()
	 */
	@Override
	public void Click() {
		// TODO Auto-generated method stub
		_locator.click();
		WriteLogAndReport(logger, "info", "info", "Clicked on Locator:" + _locator.toString());
		//logger.info("Clicked on Locator:" + _locator.toString());

			
	}

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#SetText()
	 */
	@Override
	public void SetText(String text) {
		// TODO Auto-generated method stub
		_locator.sendKeys(text);
		WriteLogAndReport(logger, "info", "info", "Set Locator with Text. Locator: " + _locator.toString() + " with text as : " + text);

	}

	@Override
	public StringBuffer GetText() {
		// TODO Auto-generated method stub
		String temp1 = _locator.getText();
		StringBuffer temp2 =  new StringBuffer(temp1);
		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator: " + _locator.toString() + "  Text Fetched : " + temp1);
		return temp2;


	}

	@Override
	public StringBuffer GetAttribute(String s_att) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getAttribute(s_att);
		StringBuffer temp2 =  new StringBuffer(temp1);
		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator's attribute. Locator: " + _locator.toString() + "  Attribute Name : " + s_att + " Attribute Value: " + temp1 );
		return temp2;
	}





}
