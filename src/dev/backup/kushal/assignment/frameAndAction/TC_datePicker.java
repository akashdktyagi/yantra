/**
 * 
 */
package dev.backup.kushal.assignment.frameAndAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

/**
 * @author Kushal Thadani
 *
 */
public class TC_datePicker {
	String  url = "https://jqueryui.com/";
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		TC_commonForAll.chromeDriver("webdriver.chrome.driver","G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
	}
	@BeforeMethod
public void beforeMethod() {
//		String PROXY ="199.201.125.147:808";
//		org.openqa.grid.selenium.Proxy prox = new org.openqa.grid.selenium.Proxy();
//		prox.
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void datePicker() {
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/datepicker/']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker' or class='hasDatepicker']")).click();
		//	Date String declaration to compare with GUI dte..........
		String date = "10-June 2018";
		String spilter[] = date.split("-");
		String day = spilter[0];
		String month = spilter[1];
		//			System.out.println(day);
		//			System.out.println(month);
		//			System.out.println(year);
		//	Defining WebElement by using locator........ 
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span"));
		for(int i = 0 ; i<element.size();i++) {
		
				System.out.println(element.get(i).getText());
				
				List<WebElement> dates = driver.findElements(By.xpath("//class[@ui-state-default]"));
				System.out.println("*******************************************");
				System.out.println(dates);
				System.out.println("*******************************************");
//				for(int j = 1 ; j<dates.size();j++) {
//					System.out.println(dates.get(j).getAttribute(day));
//				}
			
			}
		}
	}

