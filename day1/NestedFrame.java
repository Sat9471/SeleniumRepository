package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
								
				// load the URL https://www.leafground.com/frame.xhtml
				driver.get("https://www.leafground.com/frame.xhtml");
				
				//focus to frame
				driver.switchTo().frame(0);
				
				//search frame in the DOM by using //iframe
				//Nested frame is a frame inside another frame
				
				//frame 1
				driver.switchTo().frame(2);
				
				//frame 2
				driver.switchTo().frame("frame2");
				
				driver.findElement(By.id("click")).click();
				
				//going back from child frame 2 to parent frame 1
				driver.switchTo().parentFrame();
				
				//going back from child frame 2 to web page
				driver.switchTo().defaultContent();
				

	}

}
