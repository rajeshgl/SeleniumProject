package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet Sh;
	private static XSSFWorkbook Wb;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static Object[][] getExcelData(String FilePath, String SheetName)throws Exception{
		
		String[][] excelData = null;
		
		try{
			
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			//access the required test data sheet
			Wb = new XSSFWorkbook(ExcelFile);
			Sh = Wb.getSheet(SheetName);
			int startRow=1;
			int startCol=1;
			int ci, cj;
			int totalRows = Sh.getLastRowNum();
			//you can write a function as well to get column count
			
			int totalCols=2;
			excelData = new String[totalRows][totalCols];
			ci=0;
			for(int i=startRow;i<=totalRows;i++,ci++){
				
				cj=0;
				
				for(int j=startCol; j<=totalCols;j++,cj++){
					
				excelData[ci][cj]=getCellData(i,j);	
				System.out.println(excelData[ci][cj]);
				}
			}
			
		}
		
		catch (FileNotFoundException e){
			
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		
		catch (IOException e){
			
			System.out.println("Could not read the Excel sheet");
			e.printStackTrace();
		}
		
		return(excelData);
		
	}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{
		
		try {
			Cell = Sh.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
			
		}
		
		catch (Exception e){
			
			//System.out.println(e);
			return "";
		}
	}
	
}
