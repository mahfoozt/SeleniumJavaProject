package aUI_Concept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class KeyDown {

	public static void main(String[] args) throws InterruptedException, IOException {
//Launch Chromebrowser and load url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);		
//click Selectable button outside the frame 
		//driver.findElementByXPath("//a[contains(text(),'Selectable')]").click();
		driver.findElementByXPath("//a[text()='Selectable']").click();
//switching to frame
		driver.switchTo().frame(0);
//click the item numbers 
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[6]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
//switch back to main frame
		driver.switchTo().parentFrame();
//click Demos button out side the iframe		
		driver.findElementByXPath("//a[contains(text(),'Demos')]").click();
//Verification of the title page using IfElse Loop
		System.out.println(driver.getTitle());
		if ("jQuery UI Demos | jQuery UI".equals(driver.getTitle())) {
			System.out.println("jQuery UI Demos | jQuery UI------Title Match");
		
		}else {
			System.out.println("------Title Not Match------------------");
		}
		
//Again take the Screen Shot 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap_AUI_Concept/KeyDown_image.png");
		FileUtils.copyFile(src, dest);	
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
