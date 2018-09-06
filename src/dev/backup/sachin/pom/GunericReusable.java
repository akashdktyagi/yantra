package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GunericReusable {
	public static void WriteLogs(String logtype, String msg)
	{
		System.out.println(logtype + "," + msg);
	}
		
		public static WebDriver WebDriverManager(String browsertype, String url) {
			//1 Create Driver object
			WebDriver driver = new ChromeDriver();
			//Navigate
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			return driver;
			
		}

	

}
