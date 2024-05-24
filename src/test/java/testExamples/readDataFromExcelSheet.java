package testExamples;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class readDataFromExcelSheet {

	
	@DataProvider(name = "LoginCode")
	public Object[][] getTutorialsNinjaExcelLoginData() throws Exception {
		
		Object[][] data = readDataFromExcelSheet.readFromExcelSheet("LoginTN");
		return data; 
		
	}
	
	public static Object[][] readFromExcelSheet(String sheetName) throws Exception {
		
		FileInputStream ip  = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\excelCode.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(ip);//passing the path here
		XSSFSheet sheet = workbook.getSheet(sheetName); // getting the sheet
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0;j<cols;j++) {
				XSSFCell cell = row.getCell(j);
				
				CellType celltype = cell.getCellType();
				
				switch(celltype) {
				case STRING: 
				data[i][j] = cell.getStringCellValue();
				break;
				
				case NUMERIC:
					data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN: 
					data[i][j] = cell.getBooleanCellValue();
				}
			}
		}
		return data;
		
	}
}
