package startingPoinfOfFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWrapper implements WrapperMethod{
	WebDriver driver;
	public void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver.exe");
		
		//ChromeDriver is a class
		driver = new ChromeDriver();
		
	}

	public void enterById(String locatorValue, String data) {
		driver.findElement(By.id(locatorValue)).sendKeys(data);
	
	}

	public void enterByName(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByCssSelector(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByClassName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkText(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void selectVisibleTextById(String Id, String Value) {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexByName(String Name, int Value) {
		// TODO Auto-generated method stub
		
	}

	public void getTextById(String Id) {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

}
