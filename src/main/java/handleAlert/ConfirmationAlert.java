package handleAlert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()='Click for JS Confirm']").click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.getText();
		System.out.println(confirmAlert.getText());
		
	
		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
//Accept the alert 
		driver.switchTo().alert().accept();
//Take the Screen Shot 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap2_Alert_Concept/Confirmation_Alert_image.png");
		FileUtils.copyFile(src, dest);
		
		
	}

}
