package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelWorkbook;
	private static XSSFCell cell;
	private static XSSFRow row;
	
	public static void setExcelPath(String path, String SheetName) throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ExcelWorkbook = new XSSFWorkbook(fis);
			ExcelSheet = ExcelWorkbook.getSheet(SheetName);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String getCellData(int rownum,int colnum) {
		cell = ExcelSheet.getRow(rownum).getCell(colnum);
		String cellData = cell.getStringCellValue();
		return cellData;
		
	}
	

}
