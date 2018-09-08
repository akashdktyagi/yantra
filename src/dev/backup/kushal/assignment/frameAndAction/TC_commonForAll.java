package dev.backup.kushal.assignment.frameAndAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

/**
 * @author Kushal Thadani
 *
 */
public class TC_commonForAll {
	static WebDriver driver;
	String browser;

	public static void chromeDriver(String path , String directory) {
		System.setProperty(path , directory);
	}
	public static void WriteLogs(String logtype, String msg) {
		System.out.println(logtype + "," + msg);
	}
//	public static WebDriver initializeChrome(String browsertype, String url) {
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		return driver;
//	}
}
