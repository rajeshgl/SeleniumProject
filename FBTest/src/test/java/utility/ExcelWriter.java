package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) {
		
		try{
			//specify the path of the file
			File src = new File("C:\\Users\\Rajesh\\Documents\\TestDataMarch6.xlsx");
			
			//load file
			FileInputStream fis=new FileInputStream(src);
			
			//load workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//load sheet - here we are loading first sheet of the excel workbook only
			XSSFSheet sh1=wb.getSheetAt(0);
			
			//getRow specify which row we want to read and getCell with column
			
			/*System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(1).getRawValue());*/
			
			//here createCell will create column
			//and setCellValue will set the value
			
			sh1.getRow(0).createCell(3).setCellValue("Result");
			sh1.getRow(1).createCell(3).setCellValue("Passed");
			sh1.getRow(2).createCell(3).setCellValue("Passed");
			sh1.getRow(3).createCell(3).setCellValue("Failed");
			
			//here we need to specify where you want to save the file
		    FileOutputStream fout=new FileOutputStream("C:\\Users\\Rajesh\\Documents\\TestDataMarch6.xlsx");
			
			//finally write content
			wb.write(fout);
			
			//close the file
			fout.close();
			fis.close();

	}

		catch (Exception e){
		System.out.println(e.getMessage());	
		}
		}
	
}
