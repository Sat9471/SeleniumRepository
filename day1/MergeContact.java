package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

     //1. Launch URL "http://leaftaps.com/opentaps/control/login"
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://leaftaps.com/opentaps/control/login");
	
//	 2. Enter UserName and Password Using Id Locator
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
//	3. Click on Login Button using Class Locator
	driver.findElement(By.className("decorativeSubmit")).click();
	
//	 4. Click on CRM/SFA Link
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	
//	5. Click on contacts Button
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
//	6. Click on Merge Contacts using Xpath Locator
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	
//	7. Click on Widget of From Contact
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> allLinks = new ArrayList<String>(windowHandles);
	
//	8. Click on First Resulting Contact
	driver.switchTo().window(allLinks.get(1));
	driver.findElement(By.className("linktext")).click();
	Thread.sleep(3000);
	driver.switchTo().window(allLinks.get(0));
	
//	9. Click on Widget of To Contact
//	we need to create windowHandle for each windows opens
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> allLinks2=new ArrayList<String>(windowHandles2);
	driver.switchTo().window(allLinks2.get(1));
	
//	10. Click on Second Resulting Contact
	driver.findElement(By.xpath("(//a[@class='linktext']/parent::div[contains(@class,'x-grid3-col-partyId')])[2]")).click();
	driver.switchTo().window(allLinks2.get(0));
	Thread.sleep(3000);
	
//	11. Click on Merge button using Xpath Locator
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	
//	12. Accept the Alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	driver.switchTo().defaultContent();
	Thread.sleep(1000000);
	
//	13. Verify the title of the page
	String title="Merge Contacts | opentaps CRM";
	String title2 = driver.getTitle();
	System.out.println("Title of the page:"+title2);
	System.out.println(" ");
	if (title.equals(title2)) {
		System.out.println("Title matches and verified");
	} else {
        System.out.println("Title does not match");
	}
	
//close the browser
	driver.close();
	}

}
