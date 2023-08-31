package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificationMethod{
     
	@Test
	public  void runCreate() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tom and Jerry");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tom");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jerry");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("97896543109");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Tom and Jerry")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	
}
