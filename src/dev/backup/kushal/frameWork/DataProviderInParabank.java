/**
 * 
 */
package dev.backup.kushal.frameWork;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


/**
 * @author kushal
 *
 */

	class DataProviderInParabank {	
			WebDriver driver;

			@BeforeTest
			public void DriverDirectory() {
				System.setProperty("webdriver.chrome.driver", "G:\\vision_IT\\Material\\eclipse-jee-photon-R-win32-x86_64\\driver\\chromedriver.exe");
			}
			
			@BeforeMethod
			public void InitializeDriver() {
				driver = new ChromeDriver();
				String url ="http://parabank.parasoft.com";
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
			@Test(dataProvider="SearchProvider")
			public void testMethod(String author,String sendKey) throws InterruptedException{
				try {
					
					WebElement clickRegistrer = driver.findElement(By.linkText("Register"));
					if(clickRegistrer.isDisplayed()) {
						clickRegistrer.click();
						Thread.sleep(2000);
						for(int i =0; i<=10;i++) {
							String[] iter = {"firstName" , "lastName" , "address.street" , "address.city" , "address.state" , "address.zipCode" , "phoneNumber" , "ssn" , "username"  , "password"};
							WebElement sendData = driver.findElement(By.id("customer."+ iter[i]  ));
							((WebElement) sendData).sendKeys(sendKey);
							System.out.println("Welcome ->"+author+" Your search key is->"+sendKey);
							Thread.sleep(3000);
							//Enter value in register form....!......
							String testValue = ((WebElement) sendData).getAttribute("value");
							System.out.println(testValue +"::::"+sendKey);
							sendData.clear();
							//Verify if the value in google search box is correct
							Assert.assertTrue(testValue.equalsIgnoreCase(sendKey));	
						}
					}
				}catch(Exception obj) {
					System.out.println(obj.getMessage());
				}
			}
			@AfterTest
			public void closeAllMethod() {
				//driver.quit();
			}
			/**
			 * @return Object[][] where first column contains 'author'
			 * and second column contains 'sendKey'
			 */
			@DataProvider(name="SearchProvider")
			public Object[][] getDataFromDataprovider(){
				return new Object[][] {
					{ "Name", "Kushal Thadani" },
					{ "Address", "Sai mastic co-society pimple chouk" },
					{ "City", "Pune" },
					{ "State", "Maharashtra" },
					{ "pinCode", "465254" },
					{ "phone", "7415451755" },
					{ "Account", "12456" },
					{ "confirmAccount", "12456" },
					{ "Amount", "30000" },
					{ "sendAccount", "13011" }

				};
			}

		}
