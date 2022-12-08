package testCase_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CreatLead_TestCase_01 {   

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe"); //Launch chrome browser
		ChromeDriver driver = new ChromeDriver ();										// initiate the Google chrome browser.	
//Launch the Browser
		driver.get("http://leaftaps.com/opentaps/control/login");						//Load Leaf taps web page 
		driver.manage().window().maximize();											//Maximize window 	                                               
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);				//Implicit wait		                                             
//Enter the User name
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");	//Enter UserName by Attribute base XPath					                                             
//enter password by using Collections XPath
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");	//Enter password by Collections XPath
		Thread.sleep(3000);																	//Explicitly wait until 3 second		                                               
//Click Login		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click(); 			//Click login by Attribute base XPath		                                              	                                           
		Thread.sleep(3000);	  																	//Explicitly wait until 3 second
//Click crm/sfa link		
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();						//click crm/sfa by using Partial Text Base XPath
//Click Create Lead Link
		driver.findElementByXPath("//a[text()='Create Lead']").click();		
//Enter Company Name-----TCS
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
//Enter First Name------Hema
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");

//Enter Last Name -------MaS
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
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
//Verify the First name	
		System.out.println("***********Create Lead HW*************************");
		Thread.sleep(3000);
		String firstName1 = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println("Verify First Name is Hema");
		System.out.println("Hema");
		if (firstName1.equals(firstName1)) {
			System.out.println("First Name Hema is Matched");
		}else { System.out.println("First Name Hema is Not Matched");
		}
		System.out.println("***********Create Lead HW Done*******************");
		
		driver.close();
	}

}
