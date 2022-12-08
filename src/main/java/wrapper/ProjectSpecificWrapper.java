package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

public ChromeDriver driver;
	
@Parameters({"url","uname","pwd"})
@BeforeMethod
public void login(String url, String uname, String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumsoft\\chromedriver_win32\\chromedriver.exe");//Launch chrome browser
		driver = new ChromeDriver ();          // initiate the Google chrome browser.
		//load URL
		driver.get(url );
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Enter User name - (Element level)
		driver.findElementById("username").sendKeys(uname);
		
		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys(pwd);
		
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm.sfa link
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		
	}
	@DataProvider
	public String[][] getData() throws InterruptedException {
	
		String [][] data = new String[3][3];
		
		data [0][0] = "CTS";
		data [0][1] = "Mahfooz";
		data [0][2] = "Murshalin";

			
		data [1][0] = "TCS";
		data [1][1] = "Sazia";
		data [1][2] = "Islam";
		
		
		data [2][0] = "ABS";
		data [2][1] = "Neepa";
		data [2][2] = "Khan";
		
		return data;	//add return type 		 
		
	}

}
