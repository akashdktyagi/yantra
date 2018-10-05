package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	WebDriver driver;

	

	public static WebDriver InitializeBrowser(String Browser , String url)
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
		return  driver;
	}

}
