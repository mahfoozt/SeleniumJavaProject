package testNg_Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLead_TestNg {

	@Test
	public void mergeLead() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\seleniumsoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
				ChromeDriver driver = new ChromeDriver ();										// initiate the Google chrome browser.	
		//Launch the Browser
				driver.get("http://leaftaps.com/opentaps/control/login");						//Load Leaf taps web page 
				driver.manage().window().maximize();											//Maximize window 	                                               
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Implicit wait		                                             
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
				driver.findElementByXPath("//a[contains(text(),'CRM')]").click();						//click crm/sfa by using Partial Text Base XPath
		//Click leads Link
				driver.findElementByXPath("//a[text()='Leads']").click();
				Thread.sleep(3000);	
		//Click Merge leads  
				driver.findElementByXPath("//a[text()='Merge Leads']").click();		
		//Click on Icon near From Lead
				Thread.sleep(3000);		
				driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
				System.out.println("***********  Merge Lead Test NG HW  *******************");
		//Get First Window Reference 
				String FirstWin1 = driver.getWindowHandle();
				System.out.println(driver.getTitle());
		//Move to new window -------------------1st Window
				Set <String> TotalWin =driver.getWindowHandles();
				System.out.println(TotalWin);		
			for (String eachWin : TotalWin) {
				driver.switchTo().window(eachWin);
				System.out.println(driver.getTitle());
			}   Thread.sleep(3000);	 
		//Enter Lead ID
				driver.findElementByXPath("//input[@type='text']").sendKeys("10188");
		//Click Find Leads button
				Thread.sleep(3000);	
				driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Click First Resulting lead
				Thread.sleep(3000);	
				String elefirstname1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
				System.out.println(elefirstname1);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//Switch back to parent window----------1st window	
				driver.switchTo().window(FirstWin1);
		//Click on Icon near To Lead  
				Thread.sleep(3000);		
				driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//Move to new window
				Set <String> TotalWin1 =driver.getWindowHandles();
				System.out.println(TotalWin1);		
			for (String eachWin1 : TotalWin1) {
				driver.switchTo().window(eachWin1); 
				System.out.println(driver.getTitle());
			}   Thread.sleep(3000);	
		//Enter Lead ID 10058 to merge
				driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10187");
		//Click Find Leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Click First Resulting lead
				Thread.sleep(3000);
				String elefirstName2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").getText();
				System.out.println(elefirstName2);
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();		
				Thread.sleep(3000);
		//Switch back to primary window ---------1st Window
				driver.switchTo().window(FirstWin1);
		//Click  on Merge
			driver.findElementByXPath("//a[text()='Merge']").click();	
		//Accept Alert
			String simpleAlert = driver.switchTo().alert().getText();
			System.out.println(simpleAlert);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();	
		//Click Find Leads
			driver.findElementByXPath("//a[text()='Find Leads']").click();	
		//Enter From Lead ID
			Thread.sleep(3000);
			driver.findElementByXPath("//input[@name='id']").sendKeys("10006");
		//Click Find Leads
			Thread.sleep(3000);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify error message  -------
			Thread.sleep(3000);
			String errMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
			System.out.println(errMsg);  
			if(errMsg.contains("No records")) {
				System.out.println("ErrMsg is matched");	
			}else {
				System.out.println("ErrMsg not matched");  
			}
			System.out.println("***********Merge Lead Test NG HW Done *******************");
		//Close the browser (Do not log out)
			driver.close();


	}

}

