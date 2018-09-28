package dev.backup.sachin.assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup
{
	WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\sachin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows");
		
		 driver.findElement(By.id("button1")).click();
		
		Set<String> handels=driver.getWindowHandles(); // in this handels obj two windows id is avilabel and getwidowhandles() fetch that id
		
	    Iterator<String> it =handels.iterator(); // we can get values of set object by using iterator becouse set does not store the value by index so we can not use for loop
	    
	    String parentwin=it.next(); //  next() gives me firstvalue
	    
	    System.out.println("parent window id is:"+parentwin);
	    
	    String childwindow= it.next();
	    System.out.println("child window id="+childwindow);
	    driver.switchTo().window(childwindow);
	    System.out.println("child Window popup title:"+driver.getTitle());
	    driver.close();
	    driver.switchTo().window(parentwin);
	    System.out.println("title of parent window is:"+driver.getTitle());
   
		
	
	}

}
