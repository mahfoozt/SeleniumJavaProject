package connectExcelWithDataProvider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;
  
public class CreateLead extends ProjectSpacificWrapper {

	@Test(dataProvider = "getData")
	public void createLead (String cName, String fName, String lName) throws InterruptedException, IOException {			
		
	//Click Create Leads Link
	driver.findElementByXPath("//a[text()='Create Lead']").click();		
	//Enter Company Name-----TCS
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(cName);
	//Enter First Name------Hema
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
	//Enter Last Name -------MaS
	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(lName);
	//Enter Title-----------Ms.  
	driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Ms");
	//Enter Description.....TCS
	driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");
	//Enter Country Code ----1
	driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("1");
	//Enter Department-----MKT
	driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("MKT");
	//Enter Number of Employee----100
	driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("100");
	//Enter Web Url ------------google.com
	driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("google.com");
	//Enter Zip Code ----------75061
	driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");
	//Enter Phone Number ------123456
	driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");
	//Enter Email Address ----abc@gmail.com
	driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");
	// Click Create lead
	driver.findElementByXPath("//input[@name='submitButton']").click();
	Thread.sleep(3000);

//Verify the First name	
	Thread.sleep(3000);
				System.out.println("******Parameters Create Lead Test NG HW*************************");
				String firstName1 = driver.findElementById("viewLead_firstName_sp").getText();
				System.out.println("Verify First Name is Hema");
				System.out.println("Hema");
				if ("Hema".equals(firstName1)) {
					System.out.println("First Name Hema is Matched");
				}else { System.out.println("First Name Hema is Not Matched");
				}
				System.out.println("******Parametrs Create Lead Test NG HW Done********************");
//Again take the Screen Shot 
	 File src = driver.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Snap/P_CreateLead_image.png");
	 FileUtils.copyFile(src, dest);
	}
}
