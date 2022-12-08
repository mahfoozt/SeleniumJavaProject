package handleAlert;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
		String simpleAlert = driver.switchTo().alert().getText();
		
		System.out.println(simpleAlert);
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap2_Alert_Concept/Simple_Alert_image.png");
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
		
			

	}

}
