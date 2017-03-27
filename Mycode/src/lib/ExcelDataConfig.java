package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet Sht1;
	public ExcelDataConfig(String ExcelPath){
		
		try {
			File src=new File(ExcelPath);
			FileInputStream fis=new FileInputStream(src);
			
			 wb=new XSSFWorkbook(fis);
			
			//If we use .xls file we use HSSFWorkbook
			
			
		}  
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public String getData(int SheetNumber, int row, int column){
		Sht1=wb.getSheetAt(SheetNumber);
		String Data=Sht1.getRow(row).getCell(column).getStringCellValue();
		return Data;
	}	
}


