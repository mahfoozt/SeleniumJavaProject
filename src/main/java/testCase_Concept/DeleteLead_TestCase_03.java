package testCase_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead_TestCase_03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
		ChromeDriver driver = new ChromeDriver ();										// initiate the Google chrome browser.	
//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/login");						//Load Leaf taps web page 
		//driver.manage().window().maximize();											//Maximize window 	                                               
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);				//Implicit wait		                                             
//Enter the User name
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");	//Enter UserName by Attribute base XPath					                                             
//enter password 
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");	//Enter password by Collections XPath
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");			//Enter password by Attribute base XPath
		Thread.sleep(3000);																	//Explicitly wait until 3 second		                                               
//Click Login		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click(); 			//Click login by Attribute base XPath		                                              	                                           
		Thread.sleep(3000);																		//Explicitly wait until 3 second
//Click crm/sfa link		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();  						//click crm/sfa by using Partial Text Base XPath
//Click leads Link
		driver.findElementByXPath("//a[text()='Leads']").click();
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
/*//Click on Phone
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
//Enter phone number
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");	*/
//Enter first name-----as Hema	
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hema");	//enter first name	
//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);	
		System.out.println("*********** Delete Lead HW *************************");
//Capture lead ID of First Resulting lead
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);	 
//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();		
//Click Delete
		//driver.findElementByXPath("//a[text()='Delete']").click();
	
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10056");
//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//Verify error message  -----------
		String errorMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(errorMsg);
		
		if(errorMsg.contains("No records")) { 
			System.out.println("ErrorMsg is matched");
		}
		else {
			System.out.println("ErrorMsg is Not Matched");
		}
		 System.out.println("*********** Delete Lead HW Done *************************");
//Close the browser (Do not log out)
		 driver.close();
	}

}  
