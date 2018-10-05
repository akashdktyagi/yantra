package dev.backup.ravi.assignment.testng;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement element =driver.findElement(By.xpath("//button[@onclick='newMsgWin()']"));
		 element.click();//click on pop_up link.
		 
//set object not stored value in the form of index so it is used to iterator obj:-iterator pointing top of the set object.
             Set<String> handler = driver.getWindowHandles();
             Iterator<String> it  = handler.iterator();//handler:-we have give one iterator object.
             String parentWindowId = it.next();
             System.out.println("parent window id:"+parentWindowId);
             
            String childWindowId = it.next();
            System.out.println("child window id:"+childWindowId);
            driver.switchTo().window(childWindowId);
            System.out.println("child window pop up tittle:"+driver.getTitle());
            
            driver.close();
            driver.switchTo().window(parentWindowId);
            
            System.out.println("parent window tittle:"+driver.getTitle());
            
            
            
            
            
            


             
             
             
             
             
             
             
             
             
             
             
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
