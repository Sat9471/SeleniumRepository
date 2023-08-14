package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		Thread.sleep(2000);
		
		//enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //login with the User's name and password
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //click on Create Account
        driver.findElement(By.linkText("Create Account")).click();
        
        //Enter AccountName as Debit Limited Account
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
        
        //Enter DEscriptiion as "Selenium Automation Tester"
        driver.findElement(By.xpath("//textarea[@class='inputBox'][1]")).sendKeys("Selenium Automation Tester");
        
        //Enter LocalName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Xpath Locator");
        
        // Enter SiteName Field Using Xpath Locator
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Xpath Locator");
        
        //Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
        driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("175,000,000");
        
        //for find.Element return type will be WebElement
        //ctrl+2 then assign to local variable
        // Select Industry as ComputerSoftware
        WebElement drop = driver.findElement(By.name("industryEnumId"));
        
        //Create a select class for findElement
        Select opt=new Select(drop);
        
        //selectByIndex option 3 index 2(index starts from 0)
        opt.selectByIndex(3);
        	
        // Select OwnerShip as S-Corporation using SelectByVisibletext
        WebElement drop2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select ows=new Select(drop2);
        ows.selectByVisibleText("S-Corporation");
        
        //Select Source as Employee using SelectByValue
        WebElement drop3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
        Select sou=new Select(drop3);
        sou.selectByValue("LEAD_EMPLOYEE");
        
        //Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
        WebElement drop4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
        Select marc=new Select(drop4);
        marc.selectByIndex(6);
        
        //Select State/Province as Texas using SelectByValue 
        WebElement drop5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
        Select stpr=new Select(drop5);
        stpr.selectByValue("TX");
        
        //Click on Create Account using Xpath Locator
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        
        //logout of leaftaps website
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        
        
        
        
	}

}
