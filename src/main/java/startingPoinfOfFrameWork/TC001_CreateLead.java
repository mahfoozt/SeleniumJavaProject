package startingPoinfOfFrameWork;

import org.testng.annotations.Test;

public class TC001_CreateLead extends GenericWrapper{

	@Test	
	//public static void main(String[] args) {
	
	public void createLead() {
		launchBrowser("http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		
		
		
		
		


	}

}
