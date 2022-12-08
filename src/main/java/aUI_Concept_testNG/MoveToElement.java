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

public class MoveToElement {

	//public static void main(String[] args) throws InterruptedException, IOException {
@Test
public void moveToElement() throws InterruptedException, IOException {
//Launch Chromebrowser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//initiate the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
//Launch the URL Address	
		driver.get("http://mrbool.com/");
//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
//Select Content element and store it in a variable
		WebElement Content = driver.findElementByXPath("//a[@class='menulink']");
//create object of Actions Class and pass the driver
		Actions action = new Actions(driver);
//perform Move To Element (mouse hoover on) action 
		action.moveToElement(Content).perform();
//Then click the Articles Element 
		driver.findElementByXPath("//a[text()='Articles']").click();
		Thread.sleep(2000);
//print Title on Console 
		System.out.println(driver.getTitle());
//verification of the title page by using ifelse loop
		if ("Search Results - Mr.Bool".equals(driver.getTitle())) {
			System.out.println("Search Results - Mr.Bool-----Title Match----------");
		}else {
			System.out.println("Search Results - Mr.Bool-----Title Not Match----------");
		}
//Again take the Screen Shot 
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap_AUI_Concept/MoveToElement_image.png");
		FileUtils.copyFile(src, dest);	
		
		driver.close();	
		
	}
	

}
