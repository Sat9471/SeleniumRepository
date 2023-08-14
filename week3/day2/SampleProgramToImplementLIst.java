package week3.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SampleProgramToImplementLIst {

	public static void main(String[] args) throws InterruptedException {
		
//		1. Launch the URL https://www.ajio.com/
//		disable notification
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		
//		2. In the search box, type as "bags" and press enter
//			Alert alert=driver.switchTo().alert();
//			alert.dismiss();
			WebElement search = driver.findElement(By.xpath("//div[contains(@class,'react-autosuggest')]/input"));
			search.sendKeys("bags");
			search.sendKeys(Keys.ENTER);
			
//	    3. To the left  of the screen under " Gender" click the "Men"
			driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[3]")).click();
			Thread.sleep(3000);
			
//		4. Under "Category" click "Fashion Bags"
			driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
			Thread.sleep(3000);
			
//		5. Print the count of the items Found. 
			String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
			System.out.println("Count of the items found: "+text);
			
//		6. Get the list of brand of the products displayed in the page and print the list.
		  List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
		  int brandSize = bagBrandList.size();
		  System.out.println("Number of bag brands under Men's and Fashion Bags category: "+brandSize);
		  
//		  to avoid duplicates in brand name, we are using HashSet concept
		  Set<String> bagBrandSet=new HashSet<String>();
			
		  System.out.println("Bag brand name using list concept: ");
		  //iterating the brand names
		  for (WebElement brand : bagBrandList) {
			String brandName = brand.getText();
			//adding set(bagBrandSet) to the brand list(brandName)
			bagBrandSet.add(brandName);	
			
//			Get the list of brand of the products displayed in the page and print the list.
			System.out.println(brandName);
		}
		    System.out.println(" ");
		    System.out.println("===============");
		    System.out.println(" ");
		    
			System.out.println("Bag brands for Men's under fashion bag category: "+bagBrandSet);
			
			WebElement scroll = driver.findElement(By.xpath("(//div[@class='headline'])[5]"));
			Actions act=new Actions(driver);
			
			act.moveToElement(scroll).perform();
			Thread.sleep(110000);
			
//			Get the list of names of the bags and print it (using driver.findElements)
			List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
			int bagNameSize = bagNames.size();
			
			System.out.println("Number of bags names fro Men's under fashion bag category: "+bagNameSize);
			 System.out.println(" ");
			    System.out.println("===============");
			    System.out.println("Bag names for Men's under fashion bag categories");
			    
			 for (WebElement bagNamesList : bagNames) {
			   String bagName = bagNamesList.getText();
			   System.out.println(bagName);
			}
			 
			 //close the browser
			 driver.close();
	}
}
