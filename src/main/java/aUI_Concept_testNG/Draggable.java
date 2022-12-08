package aUI_Concept_testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draggable {

	//public static void main(String[] args) throws InterruptedException, IOException {
	@Test
	public void draggable() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
//click Draggable button outside the frame 
		driver.findElementByXPath("//a[contains(text(),'Draggable')]").click();
//switching to frame
		driver.switchTo().frame(0);
//Drag and pull variable's XPATH saving in src and dest
		WebElement src1 = driver.findElementByXPath("//p[text()='Drag me around']");
		WebElement dest1 = driver.findElementByXPath("//div[@id='draggable']");
		
		Thread.sleep(1500);
//create Actions class object
		Actions action = new Actions(driver);
//Drag and Pull action code is performing 
		action.dragAndDrop(src1, dest1).perform();
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
	 File dest = new File("./Snap_AUI_Concept/Draggable_image.png");
	 FileUtils.copyFile(src, dest);	
		
		
//close the driver		
	driver.close();	
		
	}

}
