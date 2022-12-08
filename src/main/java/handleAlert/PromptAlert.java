package handleAlert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.getText();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("I am a Robot");
		
		Thread.sleep(2000);
		promptAlert.accept();
		String Result = driver.findElementById("result").getText();
		System.out.println(Result);

//Again take the Screen Shot 
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Snap2_Alert_Concept/Prompt_Alert_image.png");
		 FileUtils.copyFile(src, dest);	
	}

}
