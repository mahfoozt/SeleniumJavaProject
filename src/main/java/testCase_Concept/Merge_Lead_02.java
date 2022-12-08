package testCase_Concept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Merge_Lead_02 {

	//@Test 
	//public void Merge_Lead_02() {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
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
		System.out.println("click in the icon 1");
		//Move to new window -------------------1st Window
		String FirstWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set <String> TotalWindow =driver.getWindowHandles();
		System.out.println(TotalWindow);
		for (String eachWin : TotalWindow) {
			driver.switchTo().window(eachWin);
			System.out.println(driver.getTitle());
		}
		//Click Find Leads button
		Thread.sleep(3000);	
		System.out.println("click in the Find Leads Button");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		// Enter Lead ID
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10071");

		// click on Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
	}

}
