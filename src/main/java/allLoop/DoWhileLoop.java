package allLoop;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println(i);	//print 1 to 5 using Do While Loop 
			i=i+1;
		} while (i<=5);
		
		int j= 10;
		do {
			System.out.println(j);//Print 10 to 20 using Do While Loop
			j=j+1;
		} while (j<=20);
	
	}

	/*//Verify the First name	
	Thread.sleep(3000);
				System.out.println("******Parameters Create Lead Test NG HW*************************");
				String firstName1 = driver.findElementById("viewLead_firstName_sp").getText();
				System.out.println("Verify First Name is Hema");
				System.out.println("Hema");
				if (firstName1.equals(firstName1)) {
					System.out.println("First Name Hema is Matched");
				}else { System.out.println("First Name Hema is Not Matched");
				}
				System.out.println("******Parametrs Create Lead Test NG HW Done********************");
	//Again take the Screen Shot 
	 File src = driver.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Snap/P_CreateLead_image.png");
	 FileUtils.copyFile(src, dest);
	}*/
	

}
