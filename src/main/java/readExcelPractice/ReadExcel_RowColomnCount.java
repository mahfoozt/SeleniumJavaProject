package readExcelPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_RowColomnCount {

	public static void main(String[] args) throws IOException {
//open the work book 
		XSSFWorkbook wbk = new XSSFWorkbook("./Data/ReadData.xlsx");
		System.out.println("Learning How to Read from Excel Sheet------------------");
//Get Sheet
		XSSFSheet sheet = wbk.getSheet("Sheet1");
//Row Count Length measure and print Row length
		int rowNumLength = sheet.getLastRowNum();
		System.out.println("Row Count Length is "  + + rowNumLength);
//Cell Count Length measure and print cell length
		int cellNumLength = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell Count Length is "  + + cellNumLength);
		System.out.println("CompanyName    FirstName    LastName      State");
//using for loop we are printing each Cell value from one by one Row		
		for (int i = 1; i <= rowNumLength; i++) {
		//Get Row 
			XSSFRow Firstrow = sheet.getRow(i);
			
			for (int j = 0; j < cellNumLength; j++) {
		//Get each Column from 1st row.
				XSSFCell cell = Firstrow.getCell(j);
		//Action---Read/Print particular cell value 
				String Svalue = cell.getStringCellValue();
				System.out.println(Svalue);
			}
		}	
		System.out.println("Done Printing after Read from Excel Sheet-------------- ");

	}

}
