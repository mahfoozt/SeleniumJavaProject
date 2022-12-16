package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinitions { 
	
	ChromeDriver driver;
	
	@Given("Launch Chromebrowser and load url")
	public void launchChromebrowserAndLoadUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	
	@When("click the Droppable button")
	public void clickTheDroppableButton() {
		System.out.println("my new program");
		System.out.println(driver.getTitle());
		//driver.findElementByXPath("//a[text()='Droppable']").click();
		driver.findElementByXPath("//a[text()='Droppable']").click();
		
	}

	@Then("its navigate the droppable page")
	public void itsNavigateTheDroppablePage() {
	    System.out.println(driver.getTitle());
	}

	@When("switching to frame")
	public void switchingToFrame() {
		driver.switchTo().frame(0);
	}

	@When("drag and drop action code is performing")
	public void dragAndDropActionCodeIsPerforming() throws InterruptedException {
		WebElement src1 = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement dest1 = driver.findElementByXPath("//div[@id='droppable']");
		
		Thread.sleep(1500);		
		Actions action = new Actions(driver);
		action.dragAndDrop(src1, dest1).perform();
	}

	@When("switch back to main frame")
	public void switchBackToMainFrame() {
		driver.switchTo().parentFrame();
	}

	@When("click the sortable button")
	public void clickTheSortableButton() {
		driver.findElementByXPath("//a[text()='Sortable']").click();
	}

	@Then("its navigate the sortable page")
	public void itsNavigateTheSortablePage() {
		System.out.println(driver.getTitle());
	}

	@When("verification of the title page")
	public void verificationOfTheTitlePage() {
		//String Title1= driver.getTitle();
		if ("Droppable | jQuery UI".contains(driver.getTitle())) {
			System.out.println("Sortable | jQuery UI------Title Match-------------");
		}else {
			System.out.println("-----Title Not Match----------");
		}
	}
	@When("click the draggable button")
	public void clickTheDraggableButton() {
		driver.findElementByXPath("//a[contains(text(),'Draggable')]").click();
	}

	@Then("its navigated the draggable page")
	public void itsNavigatedTheDraggablePage() { 
		System.out.println(driver.getTitle());
		
	}

	@When("drag and pull action code is performing")
	public void dragAndPullActionCodeIsPerforming() throws InterruptedException {
		WebElement src1 = driver.findElementByXPath("//p[text()='Drag me around']");
		WebElement dest1 = driver.findElementByXPath("//div[@id='draggable']");
		
		Thread.sleep(1500);
		Actions action = new Actions(driver);
		action.dragAndDrop(src1, dest1).perform();
	}

@Then("its navigate the draggable page")
public void itsNavigateTheDraggablePage() {
	System.out.println(driver.getTitle());
}

@When("click the selectable button")
public void clickTheSelectableButton() {
	driver.findElementByXPath("//a[text()='Selectable']").click();
}

@Then("its navigated the selectable page")
public void itsNavigatedTheSelectablePage() {
	System.out.println(driver.getTitle());
}

@When("click the item numbers")
public void clickTheItemNumbers() throws InterruptedException {
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
}
	@When("close browser")
	public void closeBrowser() {
		driver.close();
	}

}
