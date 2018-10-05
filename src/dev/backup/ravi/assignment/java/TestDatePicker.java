package dev.backup.ravi.assignment.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDatePicker {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://jqueryui.com/datepicker/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//a[@href='http://jqueryui.com/datepicker/']"));
         driver.switchTo().frame(0);
         WebElement datepicker=  driver.findElement(By.id("datepicker"));
         datepicker.click();
         WebElement table=  driver.findElement(By.className("ui-datepicker-calendar"));
         

         
         
}}

