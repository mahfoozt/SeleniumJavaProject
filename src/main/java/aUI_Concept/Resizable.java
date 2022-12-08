package aUI_Concept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
//click Resizable button outside the frame
		driver.findElementByXPath("//a[text()='Resizable']").click();
//switching to frame
		driver.switchTo().frame(0);
//Drag and Drop Variable's XPATH saving in src1 and dest1 		
		WebElement src1 = driver.findElementByXPath("//div[@class='ui-resizable-handle ui-resizable-s']");
		WebElement dest1 = driver.findElementByXPath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']");
		//WebElement dest1 = driver.findElementByXPath("//div[@id='resizable']");

		Thread.sleep(1500);		
		Actions action = new Actions(driver);
//Drag And Drop action code is performing 
		action.dragAndDrop(src1, dest1).perform();
		Thread.sleep(2000);
	
//switch back to main frame
		driver.switchTo().parentFrame();
//click Sortable button outside the frame 
		driver.findElementByXPath("//a[text()='Resizable']").click();
//Verification of the title page
		System.out.println(driver.getTitle());
		//String Title1= driver.getTitle();
		if ("Resizable | jQuery UI".contains(driver.getTitle())) {
			System.out.println("Resizable | jQuery UI------Title Match-------------");
		}else {
			System.out.println("-----Title Not Match----------");
		}
//Again take the Screen Shot 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap_AUI_Concept/Resizable_image.png");
		FileUtils.copyFile(src, dest);	
			
		driver.close();
		
		
	}

}
