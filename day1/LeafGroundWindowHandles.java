package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//Click and Confirm new Window Opens https://leafground.com/window.xhtml
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://leafground.com/window.xhtml");
	
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	Thread.sleep(3000);
	
	//using set concepts to handle between windows
	Set<String> windowHandles = driver.getWindowHandles();
	//convert set to list
	List<String> links=new ArrayList<String>(windowHandles);
	//iterating and getting the webpages id using for each loop
	for (String windowId : links) {
		System.out.println(windowId);
	}
	
	//get the title of the dashboard(window 2)
	driver.switchTo().window(links.get(1));
	String dash = driver.getTitle();
	System.out.println(dash);
	
	driver.findElement(By.id("email")).sendKeys("abc123@gmailoutlook.com");
	Thread.sleep(3000);
	
	driver.close();
	
	//navigating back to homepage(parent) from dashboard(child) using list method
    driver.switchTo().window(links.get(0));
	Thread.sleep(3000);
	
	//click on open multiple button under find the number of opened tabs
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	Thread.sleep(3000);
	
	//converting set to list concept for the parent 2(link 2)
	Set<String> windowHandles2 = driver.getWindowHandles();
	System.out.println(windowHandles2);
	
    //we are handling new windowHandles2 to convert the windowHandles2 to list
	List<String> links2=new ArrayList<String>(windowHandles2);
	for (String windowId2 : links2) {
		System.out.println(windowId2);
	}
	
	
	//title of open multiple
	driver.switchTo().window(links2.get(2));
	String multiple = driver.getTitle();
	System.out.println(multiple);
	driver.close();
	
	driver.switchTo().window(links2.get(0));
	//click close windows
	driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

	Set<String> windowHandles3 = driver.getWindowHandles();
	List<String> links3 = new ArrayList<String>(windowHandles3);
	String window3 = driver.switchTo().window(links3.get(3)).getTitle();
	System.out.println(window3);
	
	//close all windows except primary
	for (int i = 1; i < links3.size(); i++) {
		driver.switchTo().window(links3.get(i));
		driver.close();
	}

	driver.switchTo().window(links3.get(0));
	
	//wait for 2 new tabs to open and click on Open with delay button
	driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	Thread.sleep(10000);
	
	Set<String> windowHandles4 = driver.getWindowHandles();
	List<String> links4 = new ArrayList<String>(windowHandles4);
	for (int i = 0; i < links4.size(); i++) {
		System.out.println(links4.get(i));
	}
	
	//wait for 2 new tabs to open and click on Open with delay button
	String window4 = driver.switchTo().window(links4.get(1)).getTitle();
	System.out.println(window4);
	driver.close();
	Thread.sleep(3000);
	
	driver.switchTo().window(links4.get(0));
	
	String window5 = driver.switchTo().window(links4.get(2)).getTitle();
	System.out.println(window5);
	driver.close();
	
	driver.switchTo().window(links4.get(0));
	
	//find the number of opened tabs
	int number = links4.size();
	System.out.println("Number of opened tabs: "+number);
	
	
   //to close all the browsers
    driver.quit();

	}

}
