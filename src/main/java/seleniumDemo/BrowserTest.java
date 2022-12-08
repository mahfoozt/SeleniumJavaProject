package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
	//How to pick a date from calendar
	
	
	//Launch Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
	
	//ChromeDriver is a class
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new ChromeDriver();
	//Load URL
	driver.get("http://leaftaps.com/opentaps");
	
	//Get page title
	//driver.getTitle(); 
	System.out.println(driver.getTitle());
	
	//Maximize window
	driver.manage().window().maximize();
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Enter user name
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
	
	//driver.findElementByXPath("//button[text()='Try it']").click();
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login btn
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hema");
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mali");
		//Enter Title-----------Ms.  
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("Ms");
		//Enter Description.....TCS
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("TCS---");
		//Enter Country Code ----1
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("1");
		//Enter Department-----MKT
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("MKT");
		//Enter Number of Employee----100
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("100");
		//Enter Web Url ------------google.com
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("google.com");
		//Enter Zip Code ----------75061
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("75061");
		//Enter Phone Number ------123456
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("123456");
		//Enter Email Address ----abc@gmail.com
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		//enter text in description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It's a software company");
		//Click on calendar icon near from the Birth date field
		driver.findElement(By.xpath("//img[@id='createLeadForm_birthDate-button']")).click();
		
		//1st capture month and year from calendar and store it in a variable 
		//String year= "2021"
		String month = "May, 2016";
		String day = "11";
		while (true) {
			String text = driver.findElement(By.xpath("//td[@class='title']")).getText();
			System.out.println(text);		
			if(text.equals(month)) 	{ //when it finds month = "May 2020", then comes out from the while loop.
				break; //when the condition will be met, it will stop here
			}
			else {
				//continue clicking on previous year btn until found the "2016" year and month
				driver.findElement(By.xpath("(//div[@unselectable='on'])[3]")).click(); //year
				driver.findElement(By.xpath("(//div[@unselectable='on'])[4]")).click();//month
			}
			/*if(text.equals(month)) {
				break;
			}else {
				driver.findElement(By.xpath("(//div[@unselectable='on'])[4]")).click();//month
			}*/
			}
		//click the day 11th May, 2016
		driver.findElement(By.xpath("(//td[@class='day'])[8]")).click();
		
		//close the calendar 
		//driver.findElement(By.xpath("(//div[@unselectable='on'])[2]")).click();
			
		Thread.sleep(2000);
		
		//Click Create Lead button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//driver.quit();
		////div[text()='November 2022'] //southwest
		////td[contains(text(),'Select date')] 
		//(//td[@class='day'])[1]        //day [1/2/3---30]
		//(//div[@unselectable='on'])[6]  //month >
		//(//div[@unselectable='on'])[4]		//< month
		//(//div[@unselectable='on'])[7]  //year >>
		//(//div[@unselectable='on'])[3]    //<< Year
				
		}
	
	}
