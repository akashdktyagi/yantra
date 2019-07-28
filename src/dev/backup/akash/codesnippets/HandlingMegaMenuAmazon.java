package dev.backup.akash.codesnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HandlingMegaMenuAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Devina\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//1 Create Driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Navigate and click on the link
		driver.get("https://www.amazon.in/");
		
		HandleMegaMenu_SelectItems(driver,"Mobiles, Computers","Tablets");
	}
	
	public static void HandleMegaMenu_SelectItems(WebDriver driver, String category, String sub_category) {
		//Get shop-all element and hover on it by using Actions Class
		WebElement shop_all = driver.findElement(By.id("nav-link-shopall"));
		
		//Use Actions class for mouse over
		Actions action = new Actions(driver);
		action.moveToElement(shop_all).build().perform();
		
		//Find the Category element and mouse over it
		//WebElement category_element = driver.findElement(By.xpath("//span[@class='nav-text' and text()='Fire TV Stick']"));
		WebElement category_element = driver.findElement(By.xpath("//span[@class='nav-text' and text()='" + category + "']"));
		action.moveToElement(category_element).build().perform();
		
		//Find the Sub Category element and click
		//WebElement category_element = driver.findElement(By.xpath("//span[@class='nav-text' and text()='Fire TV Stick']"));
		WebElement sub_category_element = driver.findElement(By.xpath("//span[@class='nav-text' and text()='"+ sub_category +"']"));
		sub_category_element.click();
		
		//Valdiation here using page titles or some page header

	}

}
