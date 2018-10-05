package dev.backup.ravi.assignment.java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderApproch {
WebDriver driver;
	
	@Test(dataProvider = "inputdata")
	public static void testdata(String username ,String password){
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

         WebDriver  driver= new ChromeDriver();
	     driver.get("http://parabank.parasoft.com");
		
		// Maximize window 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@class='button' and @type='submit']")).click();
	
}
	
   @DataProvider(name="inputdata")

	    public Object[][] getcellData() throws IOException {
  //step1: Locate the path of excel file    	 
		 FileInputStream file = new FileInputStream("C:\\ReadFile\\visionit\\TC_Login.xlsx");
  //step2: create workbook instance from excel sheet. 		
		 XSSFWorkbook wb = new XSSFWorkbook(file);
  //step3: Get to the desired sheet.		
		 XSSFSheet s = wb.getSheet("sheet1");
  //step4: getrow() specify which row we want to read and getcell() specify which column.		
		 int rowcount = s.getLastRowNum()+1;
		 int cellcount = s.getRow(0).getLastCellNum();
		
		 Object data[][] = new Object[rowcount][cellcount];
		
		      for(int i=0;i<rowcount;i++){
			  Row r =s.getRow(i);
			
			  for(int j = 0;j<cellcount;j++){
				Cell c = r.getCell(j);
				data[i][j] = c.getStringCellValue();
			}
		}
		wb.close();
		return data;
		
	}

}
