/**
 * 
 */
package com.yantra.core.managers;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yantra.core.interfaces.ILogAndReport;

/**
 * @author akashtyagi
 *
 */
public class BrowserManager implements ILogAndReport {
	
	final Logger logger = Logger.getLogger(BrowserManager.class);
	String _sBrowserName=null;
	
	public BrowserManager(String sBrowserName){
		this._sBrowserName = sBrowserName;
	}

	public WebDriver GetBrowser(){
		
		WebDriver driver= null;
		
		switch(this._sBrowserName.toLowerCase()){
		case "chrome" :
			
			if (System.getProperty("os.name").equals("Mac OS X")){
				System.setProperty("webdriver.chrome.driver", "/Users/akashtyagi/Dropbox/AutoWorkspace/dependencies/chromedriver");
			}else{
				//System.setProperty("webdriver.chrome.driver", Global.CHROME_DRIVER+".exe");
			}  
			
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		case "firefox":
			//driver = new FirefoxDriver();
		}
		return driver;
	}//end method
	
	public boolean NavigateToPage(WebDriver driver, String url){
		driver.navigate().to(url);
		WriteLogAndReport(logger, "info", "pass", "Navigation to Url successfull : " + url);
		return true;
	}//end method
	
	
	
}//end class
