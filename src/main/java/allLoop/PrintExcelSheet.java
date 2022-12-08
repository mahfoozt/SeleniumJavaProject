package allLoop;

import java.io.IOException;

import org.testng.annotations.Test;

import utils.ReadExcel;
@Test
public class PrintExcelSheet {

	//public static String[][] main(String[] args) {
		
	public static String[][] getData() throws IOException {
		ReadExcel r1 = new ReadExcel();	
		return r1.readExcel();
	
	}
	

}
