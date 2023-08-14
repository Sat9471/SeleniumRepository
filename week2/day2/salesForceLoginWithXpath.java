package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceLoginWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//start the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://login.salesforce.com");
		
		//enter the Username
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
		
		//click on login button
		driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
		
		
	}

}
