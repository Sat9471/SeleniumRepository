package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//start the browser
				ChromeDriver driver=new ChromeDriver();
				
				//load the URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize the windows
				driver.manage().window().maximize();
				
				//enter the User's name
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

				//enter the password
		        driver.findElement(By.id("password")).sendKeys("crmsfa");
		        
		        //login with the User's name and password
		        driver.findElement(By.className("decorativeSubmit")).click();
		        
		        //click on CRM/SFA link
		        driver.findElement(By.linkText("CRM/SFA")).click();
		        
		        //click on Leads button
		        driver.findElement(By.xpath("//div[@class='x-panel-header']")).click();
		        
		        //Click on create Lead Button
		        driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	        
		        //Enter CompanyName using id Locator
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
		        
		        //Enter FirstName using id Locator
		        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tom");
		        
		        // Enter LastName using id Locator
		        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jerry");
		        
		        //Select value as Employee in Source Using SelectbyVisible text
		        WebElement drop = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		        Select emp=new Select(drop);
		        emp.selectByVisibleText("Employee");
		        
		        //Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		        WebElement drop2 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		        Select mrkc=new Select(drop2);
		        mrkc.selectByValue("9001");
		        
		        //Select value as Corporation in OwnerShip field Using SelectbyIndex
		        WebElement drop3 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		        Select cor=new Select(drop3);
		        cor.selectByIndex(5);
		        
		        // Select value as India in Country Field Using SelectbyVisibletext
		        WebElement drop4 = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		        Select cou=new Select(drop4);
		        cou.selectByValue("IND");
		        
		        //Click on create Lead Button Using name Locator
		        driver.findElement(By.name("submitButton")).click();
		        Thread.sleep(2000);
		        
		        //Get the Title of the resulting Page
		        String title = driver.getTitle();
		        System.out.println("Title of the resulting page: "+title);
		        
		        //logout of leaftaps website
		        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	        

	}

}
