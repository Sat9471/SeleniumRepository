package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Download and set the path
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Jerry");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("98765432190");
		
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("abc123@xyz789");
		
		// Step 11: Handle all the three drop downs
		//day drop-down
		WebElement drop = driver.findElement(By.xpath("//select[@id='day']"));
		Select day =new Select(drop);
		day.selectByIndex(11);
		
		//month
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon=new Select(drop2);
		mon.selectByValue("1");
		
		//year
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select yea=new Select(drop3);
		yea.selectByVisibleText("1980");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	}

}
