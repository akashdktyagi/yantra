package dev.backup.ravi.assignment.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://jqueryui.com/selectmenu/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 

	}

}
