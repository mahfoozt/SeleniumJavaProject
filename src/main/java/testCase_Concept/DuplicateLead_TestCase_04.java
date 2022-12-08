package testCase_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead_TestCase_04 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
		ChromeDriver driver = new ChromeDriver ();										// initiate the Google chrome browser.	
//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/login");						//Load Leaf taps web page 
		driver.manage().window().maximize();											//Maximize window 	                                               
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
//Click crm / sfa link		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();						//click crm/sfa by using Partial Text Base XPath
//Click leads Link
		driver.findElementByXPath("//a[text()='Leads']").click();
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//Click on Email
		driver.findElementByXPath("//span[text()='Email']").click();
//Enter Email
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
		Thread.sleep(3000);	
//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("***********Duplicate Lead HW*******************");

//Capture name of First Resulting lead
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));		
		String FirstResultingLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();	
		System.out.println("First Resulting Lead ID");
		System.out.println(FirstResultingLead);
//Click First Resulting lead
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
//Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
//Verify the title as 'Duplicate Lead' ---------------
		
		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		if (Title.contains("Duplicate Lead")) {
			System.out.println("Title---Duplicate Lead---- Matched");

		} else {
			System.out.println("Title---Duplicate Lead---- not matched");
		}
//Click Create Lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();
//Confirm the duplicated lead name is same as captured name--------------Not Covered
		String DuplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(DuplicateLeadName);

		if (DuplicateLeadName.contains("xxx")) {
			System.out.println("Duplicate---Lead----- name matched");
		} else {
			System.out.println(" Duplicate---Lead----- name Not matched");
		}
		System.out.println("***********Duplicate Lead HW Done *******************");
//Close the browser (Do not log out)
		//driver.close();

	}

}
