/**
 * 
 */
package com.yantra.core.managers;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.testng.Reporter;
import org.testng.log4testng.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yantra.core.interfaces.ILogAndReport;
import com.yantra.core.interfaces.IUIManager;


/**
 * @author akashtyagi
 *
 */
public class UIManager implements IUIManager,ILogAndReport {
	
	final Logger logger = Logger.getLogger(UIManager.class);

	/**
	 * 
	 */

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#Click()
	 */
	@Override
	public void ClickElement(WebElement _locator) {
		// TODO Auto-generated method stub
		//WebDriver wait
		_locator.click();
		WriteLogAndReport(logger, "info", "info", "Clicked on Locator:" + _locator.toString());
		//logger.info("Clicked on Locator:" + _locator.toString());

			
	}

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#SetText()
	 */
	@Override
	public void SetElementText(WebElement _locator,String text) {
		// TODO Auto-generated method stub
		_locator.sendKeys(text);
		WriteLogAndReport(logger, "info", "info", "Set Locator with Text. Locator: " + _locator.toString() + " with text as : " + text);

	}

	@Override
	public String GetElementText(WebElement _locator) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getText();

		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator: " + _locator.toString() + "  Text Fetched : " + temp1);
		return temp1;


	}

	@Override
	public String GetElementAttribute(WebElement _locator,String s_att) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getAttribute(s_att);

		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator's attribute. Locator: " + _locator.toString() + "  Attribute Name : " + s_att + " Attribute Value: " + temp1 );
		return temp1;
	}


	@Override
	public HashMap<Integer, HashMap<Integer, String>> GetUITableText(WebElement _locator) {
		return null;
		// TODO Auto-generated method stub
		
		/*HashMap<Integer, HashMap<Integer, String>> result= new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer,String> clm_temp;
		List<WebElement> o_col_rows = _locator.findElements(By.tagName("tr"));
		if (o_col_rows.size()==0) {
			WriteLogAndReport(logger, "info", "warn", "Text Could not be fetched since table row size is 0 for Locator: " + _locator.toString());
		}else {
			//List<WebElement> o_col_clm
			for(int i=0;i<o_col_rows.size();i++) {
				o_col_clm = o_col_rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<o_col_clm.size();j++){
					
				}
				clm_temp = o_col_clm.get(i)
			}

		}
		
		*/
		
	}



	@Override
	public List<WebElement> GetUITableChildItemsWithRowAndClm(WebElement _locator,int row, int clm, By desc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] GetUITableRowClmWithCellText(WebElement _locator, String s_expected_text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String TakeScreenShot(WebDriver driver)  {
		
		try {
			//Get the random number for the file
			Random rand = new Random();
			long random = (int )(Math.random() * 999999999 + 1000000);
			String result = Long.toString(random);
			  
			String path = System.getProperty("user.dir") + "//" +"ScreenShots";
			String nameFileName = result + ".png";
			String filePathName = path + "//" + nameFileName;
			
			//to create new folder
			new File(path).mkdirs();

			// TODO Auto-generated method stub
			TakesScreenshot  scrShot = (TakesScreenshot)driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File destFile  = new File(filePathName);
			FileUtils.copyFile(srcFile, destFile);
			//WriteLogAndReport(logger, "info", "info", "Screen Shot taken at location: " + path);
			//Reporter.log("Screen shot taken and kept at path: " + filePathName );
			return filePathName;

			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	

	}

}//end class
