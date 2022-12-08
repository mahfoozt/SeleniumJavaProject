package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Southwest_calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		
		//ChromeDriver is a class
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//Load URL
		driver.get("https://www.southwest.com/");
		
		//Get page title
		//driver.getTitle(); 
		System.out.println(driver.getTitle());
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Click on calendar icon near from the deperture date 
		driver.findElement(By.xpath("(//div[@class='input--icon-separator'])[1]")).click();
		//(//span[@class='swa-icon--icon'])[13]
		
		//String month = "November, 2022";
		//String day = "11";
		//enter departure day 24/11
		driver.findElement(By.xpath("(//button[@type='button'])[43]")).click();
		
		//(//input[@class='input--text'])[3]
		
		//click Return calender icon
		driver.findElement(By.xpath("(//div[@class='input--icon-separator'])[2]")).click();
		//enter Return day 22/12
		driver.findElement(By.xpath("(//button[@type='button'])[85]")).click();
		
		/*String text1 = driver.findElement(By.xpath("(//input[@class='input--text'])[3]")).getText();
		System.out.println(text1);	
		String text2 = driver.findElement(By.xpath("(//input[@class='input--text'])[4]")).getText();
		System.out.println(text2);	
		*/
		
			}

}
