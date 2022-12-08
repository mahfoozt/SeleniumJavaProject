package wrapper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Parameters_DuplicateLead extends ProjectSpecificWrapper{
	@Test
	public void duplicateLead() throws InterruptedException, IOException {
					                                               
		//Click leads Link
		driver.findElementByXPath("//a[text()='Leads']").click();
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Click on Email
		driver.findElementByXPath("//span[text()='Email']").click();
		//Enter Email
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
		Thread.sleep(3000);	
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("***********Parameters Duplicate Lead Test XML HW*******************");

		//Capture name of First Resulting lead
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));		
		String FirstResultingLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();	
		System.out.println("First Resulting Lead ID");
		System.out.println(FirstResultingLead);
		//Click First Resulting lead
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
		//Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		//Verify the title as 'Duplicate Lead' ---------------
		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		if (Title.contains("Duplicate Lead")) {
			System.out.println("Title---Duplicate Lead---- Matched");

		} else {
			System.out.println("Title---Duplicate Lead---- not matched");
		}
		//Click Create Lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		//Confirm the duplicated lead name is same as captured name--------------Not Covered
		String DuplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(DuplicateLeadName);

		if (DuplicateLeadName.contains("CTS")) {
			System.out.println("Duplicate---Lead----- name matched");
		} else {
			System.out.println(" Duplicate---Lead----- name Not matched");
		}
		System.out.println("********Parameters Duplicate Lead Test XML HW Done *******************");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snap1/P_DuplicateLead_image.png");
		FileUtils.copyFile(src, dest);

	}


}
