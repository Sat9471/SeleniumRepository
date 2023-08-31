package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameW3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
								
		// load the URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm ");
				
		//switch from focus to frame
	    driver.switchTo().frame("iframeResult");
	    
	    //click on Try it
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	    //click ok/cancel in the alert
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    //click cancel in the alert
	    //alert.dismiss();
	    
	    //Get the text using id 
	    String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    System.out.println(text);
	    
	    //back to webpage
	    driver.switchTo().defaultContent();
	}

}
