/**
 * 
 */
package com.yantra.core.managers;


import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


import org.testng.log4testng.Logger;

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
		CmnMethods.WriteLog("info","Clicked on Element: " + _locator.toString());
		//WriteLogAndReport(logger, "info", "info", "Clicked on Locator:" + _locator.toString());
		//logger.info("Clicked on Locator:" + _locator.toString());

			
	}

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#SetText()
	 */
	@Override
	public void SetElementText(WebElement _locator,String text) {
		// TODO Auto-generated method stub
		_locator.sendKeys(text);
		CmnMethods.WriteLog("info","Set Elementwith Text: " + text + " on Locator: " + _locator.toString());
		//WriteLogAndReport(logger, "info", "info", "Set Locator with Text. Locator: " + _locator.toString() + " with text as : " + text);

	}

	@Override
	public String GetElementText(WebElement _locator) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getText();
		CmnMethods.WriteLog("info","Element text retrieved: " + temp1 + " from locator: " + _locator.toString());
		//WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator: " + _locator.toString() + "  Text Fetched : " + temp1);
		return temp1;
	}

	@Override
	public String GetElementAttribute(WebElement _locator,String s_att) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getAttribute(s_att);
		CmnMethods.WriteLog("info","Element attribute fetched from locator: " +  _locator.toString() + " attribute: " + s_att + " attribute value: " + temp1);
		//WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator's attribute. Locator: " + _locator.toString() + "  Attribute Name : " + s_att + " Attribute Value: " + temp1 );
		return temp1;
	}


	@Override
	public HashMap<Integer, HashMap<Integer, String>> GetUITableText(WebElement _locator) {

		// TODO Auto-generated method stub
		
		List<WebElement> o_col_rows = _locator.findElements(By.tagName("tr"));
		int i_row_count = o_col_rows.size();
		List<WebElement> o_col_clms;
		int i_clm_count;
		String cell_text;
		//HashMap<Integer,HashMap<Integer,String>> o = new 
		
		HashMap<Integer, HashMap<Integer, String>> result_map= new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer, String> o_col_map=null;;
	
		for (int i=0;i<i_row_count;i++) {
			o_col_clms = o_col_rows.get(i).findElements(By.tagName("td"));
			i_clm_count = o_col_clms.size();
			for(int j=0;j<i_clm_count;j++) {
				cell_text = o_col_clms.get(j).getText();
				//System.out.println(cell_text);
				o_col_map.put(j, cell_text);
			}
			result_map.put(i, o_col_map);
		}
		return result_map;

		
		
	}//end method



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
			Files.copy(srcFile.toPath(), destFile.toPath());
			//WriteLogAndReport(logger, "info", "info", "Screen Shot taken at location: " + path);
			//Reporter.log("Screen shot taken and kept at path: " + filePathName );
			return filePathName;

			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	

	}

}//end class
