//write a code using properties file to login para_bank application.
package dev.backup.ravi.assignment.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

// Read properties File:
public class ReadSeleniumFile {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = null;
 //step1: how to read properties file:
 Properties prop = new Properties();
 //step2 :create file I/p class: and load file path.
 FileInputStream ip = new FileInputStream("E:/GIT_workspace/yantra/src/dev/backup/ravi/assignment/java/config1.properties");
 //step3: load this file I/p class reference loaded.
// FileInputStream ip = new FileInputStream("config1.properties");
 prop.load(ip);
 //step4: access browser.(establish connection)
 System.out.println(prop.getProperty("username"));
 System.out.println(prop.getProperty("password"));
  
 System.out.println(prop.getProperty("browser")); 
 String browserName = prop.getProperty("browser");
 
 if(browserName.equals("chrome")){
     System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
     driver = new ChromeDriver();
 }
 else if(browserName.equals("FF")){
	 driver = new FirefoxDriver();
 }
 else if(browserName.equals("safari")){
     driver = new SafariDriver();
 }
 else if(browserName.equals("IE")){
	 driver = new InternetExplorerDriver();
	 }
 else {
	 System.out.println("no browser value is given");
 }
 driver.get(prop.getProperty("url"));
 driver.findElement(By.name(prop.getProperty("user_name"))).sendKeys(prop.getProperty("username"));
 driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
 driver.findElement(By.xpath("//input[@type='submit']")).click();
 
 
 
 
 
 
 
	 
 }
 
 

	}


