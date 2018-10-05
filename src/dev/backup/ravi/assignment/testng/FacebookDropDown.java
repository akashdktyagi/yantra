package dev.backup.ravi.assignment.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();//launch chrome
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 WebElement month_dropdown = driver.findElement(By.id("month"));
		 Select month_dd = new Select(month_dropdown);
		 
		 WebElement selected_value= month_dd.getFirstSelectedOption();
		 System.out.println("before selection selected value is"+selected_value.getText());
		 
		 month_dd.selectByIndex(2);
		 WebElement selected_value1 = month_dd.getFirstSelectedOption();
		 System.out.println("After selection selected value is "+selected_value1.getText());
		 
		 //It will select Aug
		 Thread.sleep(3000);
		 month_dd.selectByVisibleText("Aug");
		 
		 //It will select sep
		 Thread.sleep(3000);
		 month_dd.selectByValue("9");	 
		 
		 
		 


	}

}
