package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static void main(String[] args) {
		
		try{
			//specify the path of the excel file from where data is to be read
			File src = new File("C:\\Users\\Rajesh\\Documents\\TestDataMarch6.xlsx"); 
			
			//load file
			FileInputStream fis=new FileInputStream(src);
			
			//load workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis); //as the excel file is saved in extension .xlsx
			
			// HSSFWorkbook is used in case excel file is saved in extension .xls
			
			//load sheet - here we are loading first sheet of the excel workbook only
			XSSFSheet sh1=wb.getSheetAt(0);
			
			//getRow() specify which row we want to read
			//getCell() specify which column to read
			//getStringCellValue() specify that we are reading string data
			//getRawValue() specify that we are reading numeric data 
			
			 
			System.out.println(sh1.getRow(1).getCell(0).getRawValue());          //getRawValue is used to read a numeric value
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());   //getStringCellValue is used to read a string
			System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(0).getRawValue());
			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(0).getRawValue());
			System.out.println(sh1.getRow(3).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(2).getStringCellValue());
			fis.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
