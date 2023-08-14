package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start the browser
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://login.salesforce.com");
		
		//enter user's name
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		
		//click login
				driver.findElement(By.id("Login")).click();
	}

}
