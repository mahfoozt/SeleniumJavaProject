package allLoop;

import org.openqa.selenium.chrome.ChromeDriver;

public class IfElseLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.get("amazon.com");
		int x = 20;
		int y =30;		
		if (x>y) {
			System.out.println("this is not right");
		}else if(x==y){
			
			System.out.println("this is right");
		}else {
			System.out.println("this is number 1 right");
		}
		
	if(x<y) {
		System.out.println("this is definitly right");
	}else {
		
	}
	//Verify the title as 'Amazon Prime' ---------------
			System.out.println(driver.getTitle());
			String Title = driver.getTitle();
			if (Title.contains("Amazon.com. Spend less. Smile more.")) {
				System.out.println("Title---Amazon Prime---- Matched");

			} else {
				System.out.println("Title---Amazon Prime---- not matched");
			}
	}
}
