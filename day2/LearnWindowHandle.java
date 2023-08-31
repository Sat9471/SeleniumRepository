package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		// load the URL https://www.leafground.com/window.xhtml
		driver.get("https://www.leafground.com/window.xhtml");
		
		//click and cofirm new Windows opens button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//current window id
		//driver.getWindowHandle();
		//ctrl+2 then assign to local variable
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//multiple window handle
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println("Multiple windows: "+windowHandles);
		
		for (String window : windowHandles) {
			System.out.println(window);
		}
		
		String parentname = driver.getTitle();
		System.out.println(parentname);
		
		//pass my control to child window
		//convert set in list
		List<String> allLinks=new ArrayList<String>(windowHandles);
		
		//syntax
		//get(1) Here index[1] is child Dashboard window
		driver.switchTo().window(allLinks.get(1));
		
		//to print the title of the child Dashboard window
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter email id
		driver.findElement(By.id("email")).sendKeys("abc123@outlookgmail.com");
		Thread.sleep(2000);
		
		//control will be in child, Need to back to parent window
		//switching to parent window
		//get(0) Here index[0] is parent window
		driver.switchTo().window(allLinks.get(0));
		
		// we are checking for next data that is Open Multiple button
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles2=driver.getWindowHandles();
		System.out.println(windowHandles2);
		
		List<String> parent2=new ArrayList<String>(windowHandles);
		System.out.println(parent2);
		
		//switching to the third window
		//get(0) Here index[0] is parent window
		driver.switchTo().window(parent2.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		//driver.close(); used to close the current opened browser
		//driver.quit(); will close all the windows that opened by the Selenium automation tool
		driver.quit();
	}

}
