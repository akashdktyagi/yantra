
package dev.backup.ravi.assignment.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
		//create driver object
		
    	WebDriver driver = new ChromeDriver();
    	//Navigate
    	driver.get("http://parabank.parasoft.com");
    	driver.manage().window().maximize();
    	
    	//Locators for login
    WebElement username =driver.findElement(By.xpath("//input[@name='username' and @class='input']"));
    WebElement password =driver.findElement(By.xpath("//input[@name='password'and @class='input']"));
    WebElement button =driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
    
    System.out.println(username.isDisplayed());
    System.out.println(password.isDisplayed());

    //operation on login into application
    username.sendKeys("john");
    password.sendKeys("demo");
    button.click();
    
    
   
  // click update contact info.
   WebElement Link_update_contact_info =driver.findElement(By.linkText("Bill Pay"));
   Link_update_contact_info.click();
   
//locators for all the field contact information
   
   WebElement payee_name = driver.findElement(By.xpath("//input[@name='payee.name']"));
   payee_name.sendKeys("Ravi");
   WebElement payee_address = driver.findElement(By.xpath("//input[@name='payee.address.street' and @type='text']"));

   payee_address.sendKeys("karve Nagar");
   WebElement city = driver.findElement(By.id("payee.address.city"));
   city.sendKeys("pune");
   WebElement state = driver.findElement(By.xpath("//input[@name='payee.address.state']"));
   state.sendKeys("Maharastra");
   WebElement zipcode = driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
   zipcode.sendKeys("444123");
   WebElement phone_No = driver.findElement(By.id("payee.phoneNumber"));
   phone_No.sendKeys("9096378893");
   WebElement account_no = driver.findElement(By.id("payee.accountNumber"));
   account_no.sendKeys("12456");
   WebElement verrify_acc = driver.findElement(By.id("verifyAccount"));
   verrify_acc.sendKeys("12456");
   WebElement Amount = driver.findElement(By.id("amount"));
   Amount.sendKeys("$5000");
   
   

   

   

   

   


   

    

    	
    	
    	
    	

    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
    	
    	
    	
    	

    	
    	
    	
    	

    	
  
    	
    	

	}

}
