package dev.backup.kalyani.reusables;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	

	
	

		public static WebDriver InitializeBrowser(String browsertype, String url) {
			//1 Create Driver object
			System.setProperty("webdriver.chrome.driver","F:\\VisionIT\\dependancy\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//Navigate
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//Thread.sleep
			return driver;
			
		}


		
	}


