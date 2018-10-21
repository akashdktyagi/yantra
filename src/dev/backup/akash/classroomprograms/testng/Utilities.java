package dev.backup.akash.classroomprograms.testng;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Utilities {

	
	//Driver intialization
	//path setting
	//
	
	public static void ChromeExePathSetUp() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		Reporter.log("Chrome Exe path Set up", true);
	}
	
	public static WebDriver WebDriverFactory(String url) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Navigate
		driver.get(url);
		Reporter.log("WebDriver Initilaized and navigated to: " + url, true);
		return driver;
	}
	
	
}
