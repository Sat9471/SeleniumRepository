package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1	Launch the browser and load *http://leaftaps.com/opentaps/control/main
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
				 
		//7	Click Find leads
	    driver.findElement(By.linkText("Find Leads")).click();
	    
		//8	Click on Phone
	    //driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
	    
		//9	Enter phone number
	    //no phone number provide during the lead creation so using email id instead
	    //driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("210");
	    //driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("97865432190");
	    driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[3]")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("abc2023@outlookgmail.com");
	    
		//10	Click find leads button
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    
		//11	Capture lead ID of First Resulting lead
	    WebElement lid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String text = lid.getText();
		System.out.println("Lead ID of First Resulting lead: "+text);
		
	    //12	Click First Resulting lead
	    lid.click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
		//13	Click Delete
	    driver.findElement(By.className("subMenuButtonDangerous")).click();
	    
		//14	Click Find leads
	    driver.findElement(By.linkText("Find Leads")).click();
	    
		//15	Enter captured lead ID
	    WebElement leid = driver.findElement(By.xpath("//input[@id='ext-gen246']"));
	    leid.sendKeys(text);
	    
		//16	Click find leads button
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	    WebElement red = driver.findElement(By.className("x-paging-info"));
	    String output = red.getText();
	    System.out.println("Result details: "+output);
	    String input ="No records to display";
	    if (input.equals(output)) {
			System.out.println("Created Lead successfully deleted");
		}else {
			System.out.println("Lead is displayed not yet deleted");
		}
		//18	Close the browser (Do not log out)
	    driver.close();

	}

}
