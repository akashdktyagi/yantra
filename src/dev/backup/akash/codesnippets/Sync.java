package dev.backup.akash.codesnippets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public Sync() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\VisionITWorkspace\\dependencies\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		
		
		
		
		/*
		 * Explicit Wait Example
		 * wait for the amount of time defined in the 
			"WebDriverWait" class or the "ExpectedConditions" to occur whichever occurs first.
		 */

		/*
		 * List of Expected Conditions:
		 * alertIsPresent()
			elementSelectionStateToBe()
			elementToBeClickable()
			elementToBeSelected()
			frameToBeAvaliableAndSwitchToIt()
			invisibilityOfTheElementLocated()
			invisibilityOfElementWithText()
			presenceOfAllElementsLocatedBy()
			presenceOfElementLocated()
			textToBePresentInElement()
			textToBePresentInElementLocated()
			textToBePresentInElementValue()
			titleIs()
			titleContains()
			visibilityOf()
			visibilityOfAllElements()
			visibilityOfAllElementsLocatedBy()
			visibilityOfElementLocated()
		 */
		WebDriverWait wait = new WebDriverWait(driver,20);
		//WebElement element = driver.findElement(By.id("df"));
		//WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
		

		/*
		 * Fluent Wait Example:
		 * 
		 */
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);

		akash();
	}
	
	@Deprecated
	public static void akash() {
		
	}
}
