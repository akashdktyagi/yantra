package dev.backup.pragati;
import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main() throws IOException, InvalidFormatException 
	{
		File f = new File("C:\\ReadFile\\Ravi1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		 
		for (int i=0;i<rowcount+1;i++){
			Row row = sheet1.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++){
				
				System.out.println(row.getCell(j).getStringCellValue()+"");
			}
			wb.close();
			
		}
		
		
		}
		
			
	}


