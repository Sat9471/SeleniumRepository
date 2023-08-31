package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		// load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//click the prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//driver.switchTo().alert();
		Alert alert = driver.switchTo().alert();
		
		//get the text getText();
		//ctrl+2 then assign to local variable
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
	    //type in the alert box
		//sendKeys input will not be visible in alert dialog box for automation
		alert.sendKeys("Sathish");
		Thread.sleep(2000);
		
		//dismiss the alert
		alert.dismiss();
		
		//print the outcome
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Outcome: "+text2);
		Thread.sleep(2000);
		
		driver.close();
	    
		
		
	}

}
