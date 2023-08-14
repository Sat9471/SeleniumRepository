package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// 1.Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on Leads Button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on Create Lead 
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter CompanyName Field Using id Locator
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		
		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tom");
		
		// 9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jerry");
		
		// 10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.name("firstNameLocal")).sendKeys("Tom");
		
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Information Technology");
		
		// 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).click();
		
		// 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc2023@outlookgmail.com");
		
		// 14. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//15. Get the Title of Resulting Page using driver.getTitle()
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		// 16. Click on Duplicate button
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 17. Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement cone = driver.findElement(By.id("createLeadForm_companyName"));
		cone.clear();
		Thread.sleep(2000);
		cone.sendKeys("Tom and Jerry Limited");
		
		//18.Clear the FirstName Field using .clear() And Enter new FirstName
		WebElement fine = driver.findElement(By.id("createLeadForm_firstName"));
		fine.clear();
		Thread.sleep(2000);
		fine.sendKeys("Toma");
		
		// 19.Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        //20. Get the Title of Resulting Page using driver.getTitle()
		System.out.println("Title of the Resulting page after edit: "+title);
	}

}
