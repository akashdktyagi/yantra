package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTopLink {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com");
		driver.manage().window().maximize();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button = driver.findElement(By.xpath("//input[@class='button' and @type='submit']"));
		user_name.sendKeys("john");
		password.sendKeys("demo");	
		button.click();
		
		WebElement location= driver.findElement(By.xpath("//a[@href='http://www.parasoft.com/jsp/pr/contacts.jsp']"));
        location.click();
        driver.navigate().back();
        Thread.sleep(4000);
        
         
        WebElement solution = driver.findElement(By.xpath("//li[@class='Solutions']"));        
        solution.click();       
        Thread.sleep(3000);
       
	     WebElement services = driver.findElement(By.xpath("//a[@href='services.htm']"));
		 services.click();  
		 driver.navigate().back();
         
        WebElement product = driver.findElement(By.xpath("//a[@href='http://www.parasoft.com/jsp/products.jsp']"));
        product.click();
        
        driver.navigate().back();
        WebElement admin_page = driver.findElement(By.xpath("//a[@href='admin.htm']"));
        admin_page.click();
        
        driver.close();
        		
         
	}
	
}
