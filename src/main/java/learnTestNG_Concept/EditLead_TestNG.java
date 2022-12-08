package learnTestNG_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public class EditLead_TestNG {
	
	@Test
	public void editLead_TestNG() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//Launch chrome browser		//System.setProperty("webdriver.chrome.driver","C:\\seleniumsoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
		ChromeDriver driver = new ChromeDriver ();										// initiate the Google chrome browser.	
//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/login");						//Load Leaf taps web page 
		driver.manage().window().maximize();											//Maximize window 	                                               
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				//Implicit wait		                                             
//Enter the User name
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");	//Enter UserName by Attribute base XPath					                                             
//enter password by using Collections XPath
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");	//Enter password by Collections XPath
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");			//Enter password by Attribute base XPath
		Thread.sleep(3000);																	//Explicitly wait until 3 second		                                               
//Click Login		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click(); 		//Click login by Attribute base XPath		                                              	                                           
		Thread.sleep(3000);																//Explicitly wait until 3 second
//Click crm/sfa link		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();				//click crm/sfa by using Partial Text Base XPath
//Click Leads Link
		driver.findElementByXPath("//a[text()='Leads']").click();
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//Enter first name-----as Hema	
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hema");	//enter first name	
//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();      //click Find Leads Button
		Thread.sleep(4000);
		System.out.println("***********TestNG Edit Lead HW*************************");
//Click on first resulting lead	
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		
		String LeadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(LeadId);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();	
		Thread.sleep(4000);
//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View")) {
			System.out.println("View Lead----Title  is matched");
		} else {
			System.out.println("View Lead----Title  is Not Matches");
		}
//Click Edit
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(4000);
//Change the company name ---------CTS
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
		Thread.sleep(4000);
//Click Update
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
//Confirm the changed name appears
		String compName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(compName);	 
		  if(compName.contains("CTS")) {
		  System.out.println("Company Name is matched"); 	  
		  } else {
		 System.out.println("Company Name is Not matched");
		 }	
		  System.out.println("***********TestNG Edit Lead HW Done *************************");
//Close the browser (Do not log out)
		driver.close();   
		
	
	}

}
