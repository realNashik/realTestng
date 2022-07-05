package seleniumforpractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	
	Test
	file f=new file("C:\\Users\\Suraj\\Desktop\\DATA DESKTOP");
	FileInputStream fis ;
	XSSFWorkbook workbook;
	XSSFSheet sheets;
	public ExcelReader (String Excelpath) {
	//File f =new File(Excelpath);	
	try {
		fis=new FileInputStream(Excelpath);
		workbook=new XSSFWorkbook(fis);
	}catch (Exception e) {
	   e.printStackTrace();
	}
	   
}
public String getData(int sheetIndex, int rows, int columns) {
		
		sheets =workbook.getSheetAt(sheetIndex);
		String data =sheets.getRow(rows).getCell(columns).getStringCellValue();
		return data;
	}
	
	public int rowsCount(int sheetIndex) {
		XSSFSheet sheet =workbook.getSheetAt(sheetIndex);
		
		int rows =sheet.getLastRowNum();
		rows =rows +1;
		return rows;
	}
	
	
	
	
}
