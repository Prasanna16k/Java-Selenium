package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Specify the path of file
		File src=new File("C:\\Users\\laxmiprasanna\\Sample.xlsx");
		// load file
		FileInputStream fis=new FileInputStream(src);
		//load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//If we use .xls file we use HSSFWorkbook
		// Load sheet- Here we are loading first sheetonly
		XSSFSheet Sht1=wb.getSheetAt(0);
		int RowV=Sht1.getLastRowNum();
		System.out.println("Total number of rows is "+RowV+1);
		// getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		for(int i=0;i<RowV;i++){
			String data=Sht1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data in the row is "+data);
		}
		
		wb.close();
	}

}
