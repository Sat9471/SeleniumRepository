package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class salesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //start the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://login.salesforce.com");
		
		//wait-java-wait 5 seconds
		Thread.sleep(10000);
		
		//close the browser
		driver.close();
				
	}

}
