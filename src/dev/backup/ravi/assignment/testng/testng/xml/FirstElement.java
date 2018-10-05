package dev.backup.ravi.assignment.testng.testng.xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("india123");
	    System.out.println(driver.findElement(By.id("identifierId")).getAttribute("value"));
	
//handle image
	
	
	
		
		

	}

}
