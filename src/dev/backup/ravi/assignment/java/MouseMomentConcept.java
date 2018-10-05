package dev.backup.ravi.assignment.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMomentConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
		 
		     driver.get("http://mrbool.com");	
		     driver.manage().window().maximize();
		     Actions action = new Actions(driver);
		 
	        action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
            Thread.sleep(3000);
            WebElement element = driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Courses']"));
            element.click();
            driver.close();
		 
		 
		 

	}

}
