package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//* 1	Launch the browser http://leaftaps.com/opentaps/control/main
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//* 2	Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//* 3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//* 4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//* 5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 6	Click Leads link
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 
	   // 7	 Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		// 8	Enter first name
		 driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Toma");
		 
		//9	Click Find leads button
		 driver.findElement(By.id("ext-gen334")).click();
		 Thread.sleep(7000);
		 
		//10 Click on first resulting lead
		 //after that use implicit wait because it is navigating to the next page
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		// 11 Verify title of the page
		 String title="View Lead | opentaps CRM";
		 String title2 = driver.getTitle();
		 System.out.println("Title of the page: "+title);
		 if (title.equals(title2)) {
			System.out.println("Title of the Webpage matches the DOM: "+title2);
		}else {
			System.out.println("Title of the Webpage does not matches the DOM: "+title2);
		}
		
		 // 12 Click Edit
		 driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 // 13 Change the company name
		 WebElement come = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		 come.clear();
		 come.sendKeys("Tom Jerry Limited");
		 
	    // 14 Click Update
		 driver.findElement(By.className("smallSubmit")).click();
		 
		// 15 Confirm the changed name appears
		//boolean displayed=driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		//System.out.print(displayed);
		 String input="Tom Jerry Limited (11172)";
		 WebElement output = driver.findElement(By.id("viewLead_companyName_sp"));
		 String text = output.getText();
		 
		 if (input.equalsIgnoreCase(text)) {
			System.out.println("Name changed after update: "+text);
		}else {
			System.out.println("Name does not changed after update: "+text);
		}
		// 16 Close the browser (Do not log out)
        driver.close();
	}

}
