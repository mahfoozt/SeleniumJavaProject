package allLoop;

import java.io.IOException;

import utils.ReadExcel;

public class GetData_fromExcel {
	
	public String[][] getData() throws IOException{
		
		ReadExcel r1 = new ReadExcel();
		
		return r1.readExcel();
		
	}	
	
}
