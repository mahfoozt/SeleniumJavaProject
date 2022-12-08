package aUI_Concept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='email']").sendKeys("abc@yahoo.com");
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
		driver.findElementByXPath("//input[@id='pass']").sendKeys("Rosy");
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.TAB);
		Thread.sleep(1500);

//Again take the Screen Shot 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap_AUI_Concept/TAB_ENTER_image.png");
		FileUtils.copyFile(src, dest);	
		driver.close();
		
				

	}

}
