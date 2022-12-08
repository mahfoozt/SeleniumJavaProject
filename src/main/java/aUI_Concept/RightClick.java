package aUI_Concept;

import java.io.File; 
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//initiate the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
//Launch the URL Address	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//select Right Click Me Element and store it in a variable
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		Thread.sleep(2000);
//create object of Actions Class and pass the driver
		Actions action = new Actions(driver);
//perform Right Click action 
		action.contextClick(rightclick).perform();
//Click the Delete or any button
		driver.findElementByXPath("//span[text()='Delete']").click();
//wait for 3 sec
		Thread.sleep(3000); 
//switch to Alert and print alert text 
		 String alertext = driver.switchTo().alert().getText();
		 System.out.println(alertext);
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
//verification of the alert text 
		 if ("clicked: delete".equals(alertext)) {
			System.out.println("clicked: delete--Alert text Match--------");
		} else {
			System.out.println("clicked: delete----Alert text not match--");
		}
//perform Right Click action and keep doing same steps for other button
		action.contextClick(rightclick).perform();
//Click the Cut or any button
		driver.findElementByXPath("//span[text()='Cut']").click();
//wait for 3 sec
		Thread.sleep(3000);
//switch to Alert and print alert text 
		String alerttext1 = driver.switchTo().alert().getText();
		System.out.println(alerttext1);
//accept the alert 
		driver.switchTo().alert().accept();
		if ("clicked: cut".equals(alerttext1)) {
			System.out.println("clicked: cut ----Alert Text Match--------");
		} else {
			System.out.println("clicked: cut ----Alert Text  Not Match---");
		}
//Again take the Screen Shot 
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Snap_AUI_Concept/RightClick_image.png");
	FileUtils.copyFile(src, dest);	
		
	}

}
