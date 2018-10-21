package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_ParaBankTestNG {

	WebDriver driver ;
	
	@Test
	public void t_01_validating_login() {
/*
		//Login
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
*/
		Reporter.log("Test Case :t_01_validating_login. Started", true);
		List<WebElement> col = driver.findElements(By.xpath("//input"));
		col.get(0).sendKeys("john");
		col.get(1).sendKeys("demo");
		col.get(2).click();
		
		
		
		String s_title_expected = "ParaBank | Accounts Overview";
		String s_title_actual = driver.getTitle();
		
		//Waiting for title to appear
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.titleContains(s_title_expected));
		
		Assert.assertEquals(s_title_expected, s_title_actual);
		Reporter.log("Test Case:t_01_validating_login: compelted with user name and password as : john and demo ", true);

	}

	//@Test
	public void t_02_account_overview_validate_account_balance() {

		t_01_validating_login();

		//Sync
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("accountTable")));
		
		
		//Validate Account Overview Table
		WebElement tbl_account_table = driver.findElement(By.id("accountTable"));
		boolean s_table_expected = true;
		boolean s_table_actual = tbl_account_table.isDisplayed();
		Assert.assertEquals(s_table_expected, s_table_actual);
		
		//Fetch the content of the Web Table
		List<WebElement> rows_col = tbl_account_table.findElements(By.tagName("tr"));

		for (int i=0;i<rows_col.size();i++) {//will iterate through all rows
			
			List<WebElement> clm_col = rows_col.get(i).findElements(By.tagName("td"));
			for(int j=0;j<clm_col.size();j++) {
				System.out.println(clm_col.get(j).getText());
				
			}
		}//outer loop
		
		//Fetch all the available Balance
		ArrayList<String> arr_balance = new ArrayList();
		for (int i=1;i<rows_col.size()-1;i++) {//will iterate through all rows
			List<WebElement> clm_col = rows_col.get(i).findElements(By.tagName("td"));
			
			arr_balance.add(clm_col.get(2).getText());
		}//outer loop
		
		//trim $ sign and convert to integer
		String temp;
		ArrayList<Integer> arr_balance_integer = new ArrayList();
		for (int i=0;i<arr_balance.size();i++) {
			temp = arr_balance.get(i).replaceAll("$", "");
			arr_balance_integer.add(Integer.parseInt(temp));
		}
		
		//addition of all the items of array list
		int i_addition_result=0;
		for (int i=0;i<arr_balance_integer.size();i++) {
			i_addition_result = i_addition_result  + arr_balance_integer.get(i);
		}
		
		System.out.println(i_addition_result);

	}
	
	
	//@Test
	public void t_02_validate_open_new_account() {
		
		
		//*************************************************************
		//***************************TEST STEPS************************
		//*************************************************************
		t_01_validating_login();

		//Clicking on the Open New Account
		driver.findElement(By.linkText("Open New Account")).click();
		
		//Select account Type
		WebElement type_drop_down = driver.findElement(By.id("type"));
		Select list_type = new Select(type_drop_down);
		list_type.selectByVisibleText("SAVINGS");
		
		//Select account number 
		WebElement acc_num_drop_down = driver.findElement(By.id("fromAccountId"));
		Select list_acc_num = new Select(acc_num_drop_down);
		list_acc_num.selectByVisibleText("12456");
		
		//Click on Open New Accont
		driver.findElement(By.xpath("//input[@value = 'Open New Account']")).click();
		
		//*************************************************************
		//***************************VALIDATION************************
		//*************************************************************
		//1. Validation: Fetch the new Account number
		WebElement link_new_account_num = 
				driver.findElement(By.xpath("//div[@ng-if = 'showResult']//a"));
		String txt_new_acc_num = link_new_account_num.getText();
		
		//Clicking on the Open New Account
		driver.findElement(By.linkText("Accounts Overview")).click();
		
		//Fetch the links inside Accounts Overview Table
		List<WebElement> col_link_acc_num = 
				driver.findElements(By.xpath("//table[@id='accountTable']//a"));
		
		String temp;
		boolean b_result = false;
		for (int i=0;i<col_link_acc_num.size();i++) {
			temp = col_link_acc_num.get(i).getText();
			if (temp.equals(txt_new_acc_num)) {
				b_result = true;
				break;
			}
		}

		Assert.assertTrue(b_result);


		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver = Utilities.WebDriverFactory("http://parabank.parasoft.com");

	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		Utilities.ChromeExePathSetUp();
	}


	/*
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
	 */
}
