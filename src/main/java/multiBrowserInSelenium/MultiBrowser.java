package multiBrowserInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowser {

	public static void main(String[] args) throws InterruptedException {
//done ChromeDriver		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
//Done FireFox 		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();

//Done Edgedriver 
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
//done InternetExplorer		
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		
		
	}

}
