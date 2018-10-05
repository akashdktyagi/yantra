package dev.backup.ravi.assignment.testng.reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericResuables
{
	public static void writeLogs(String logtype ,String msg){
		
		
		System.out.println(logtype+  ","  +msg);
	}
	
	public static WebDriver webDriverManager(String browsertype,String url){
		
		//create driver object 
		WebDriver driver = new ChromeDriver();
		
		//navigate
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		return driver;

		
		
	}

}
