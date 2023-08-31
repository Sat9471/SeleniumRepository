package week4.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Launch the URL https://www.chittorgarh.com/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		
//		2. Click on stock market
		driver.findElement(By.xpath("//a[contains(@id,'stockmarket')]")).click();
		
//		3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
//		4. Get all the Security names
		List<WebElement> securitiesList = driver.findElements(By.xpath("//td[@class='left-align']/a"));
		Set<String> securitiesSet =new TreeSet<String>();
		//for loop for the list WebElements
		for (WebElement securities : securitiesList) {
			//getting text in the list of webElements
			String securityName = securities.getText();
			//now the listed web elements are added with TreeSet(in ASCII order)
			//if duplicates found willing adding it will get removed from the set
			securitiesSet.add(securityName);
		}
	
//		5. Ensure whether there are duplicate Security names
		System.out.println(securitiesSet);
		int numberOfSecurityList = securitiesList.size();
		System.out.println("Number of securities including duplicates: "+numberOfSecurityList);
		
		int numberOfSecuritiesSet = securitiesSet.size();
		System.out.println("Number of securities: "+numberOfSecuritiesSet);
		
		if (numberOfSecurityList==numberOfSecuritiesSet) {
			System.out.println("There is no duplicate securities name");
		} else {
            System.out.println("There are duplicates securities with same name");
		}
		  
		String title = driver.getTitle(); 
		System.out.println("Title of the webpage: "+title);
		driver.close();

	}

}
