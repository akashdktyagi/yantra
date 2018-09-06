package dev.backup.sachin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManager
{
	public static  WebDriver InitilizeBrowser(String browser, String url) {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\sachin\\chromedriver.exe");	

			WebDriver driver = new ChromeDriver();
			//Navigate
			driver.get(url);
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			return driver;

}
}