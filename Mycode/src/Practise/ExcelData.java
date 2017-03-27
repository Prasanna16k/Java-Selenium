package Practise;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File src=new File("C:\\Users\\laxmiprasanna\\Sample.xls");
		System.out.println("Located Excel File");
		
		Workbook wb=Workbook.getWorkbook(src);
		System.out.println("Workbook loaded");
		
		String data00=wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println("Data Is "+data00);
		
		String data01=wb.getSheet(0).getCell(0, 1).getContents();
		System.out.println("Data Is "+data01);
		
		int rows=wb.getSheet(0).getRows();
		System.out.println("Number of rows is "+rows);
	}

}
