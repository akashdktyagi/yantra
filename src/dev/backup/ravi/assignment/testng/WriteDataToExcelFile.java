package dev.backup.ravi.assignment.testng;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcelFile {

	public static void main(String[] args) throws IOException 
	
	{
//step1: Define the path of output excel file.
		FileOutputStream fos = new FileOutputStream("C:\\WriteData\\LearnAutomation.xlsx");
//step2: create workbook instance holding reference to .xlsx file.		
		XSSFWorkbook wb = new XSSFWorkbook();
//step3: create a sheet.		
		XSSFSheet s = wb.createSheet("shhet1");
//step4: create row in sheet		
		Row row = s.createRow(0);
//step5: Add cell in sheet.		
		row.createCell(0).setCellValue("ravi kanherkar");
//step6: write data into excel		   
		   wb.write(fos);
//step7: close the file.		   
		   wb.close();
		
		

	}

}
