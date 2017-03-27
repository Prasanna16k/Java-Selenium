package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\laxmiprasanna\\Sample.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//If we use .xls file we use HSSFWorkbook
		
		XSSFSheet Sht1=wb.getSheetAt(0);
		String data0=Sht1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is "+data0);
		String data1=Sht1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is "+data1);
		wb.close();
	}

}
