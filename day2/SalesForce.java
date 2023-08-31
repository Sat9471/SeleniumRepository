package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		1.Launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		2.Load the url as " https://login.salesforce.com/ "
		driver.get("https://login.salesforce.com/");
		
//		3.Enter the username as "hari.radhakrishnan@qeagle.com"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
//		4. Enter the password as "Testleaf$1234"
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
//		5.click on the login button
		driver.findElement(By.id("Login")).click();
		
//		6.click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
//		7.Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> links = new ArrayList<String>(windowHandles);
		for (String sessionID : links) {
			System.out.println("SessionID: "+sessionID);
		}
		
//		8.click on the confirm button in the redirecting page
		driver.switchTo().window(links.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(10000);
		
//		9.Get the title
		String title = driver.getTitle();
		System.out.println("Title of the webpage: "+title);
		
//		10.Get back to the parent window
		driver.switchTo().window(links.get(0));
		
//		11.close the browser
		driver.quit();
	}

}
