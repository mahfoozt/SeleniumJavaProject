package readExcelPractice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException { 
//Open the Workbook
	XSSFWorkbook wbk= new XSSFWorkbook("./Data/ReadData.xlsx");
//Get Sheet
	XSSFSheet sheet = wbk.getSheet("Sheet1");
	System.out.println("Learning How to Read from Excel Sheet-------------- ");
//Row Count length
	int rowNumLength = sheet.getLastRowNum();
	System.out.println("Row Count Length is " + + rowNumLength);
//Cell Count Length
	int cellNumLength = sheet.getRow(0).getLastCellNum();
	System.out.println("Cell Count Length is " + + cellNumLength);

//Get Row
	XSSFRow rowCount = sheet.getRow(1);
	
//Get each Column from 1st row.
	XSSFCell cell = rowCount.getCell(0);
	XSSFCell cell1 = rowCount.getCell(1);
	XSSFCell cell2 = rowCount.getCell(2);
	XSSFCell cell3 = rowCount.getCell(3);
	
//Action------Read/Print particular Cell Value	
	String Svalue = cell.getStringCellValue();
	System.out.println(Svalue);
	String Svalue1 = cell1.getStringCellValue();
	System.out.println(Svalue1);
	String Svalue2 = cell2.getStringCellValue();
	System.out.println(Svalue2);
	String Svalue3 = cell3.getStringCellValue();
	System.out.println(Svalue3);
	
	}

}
