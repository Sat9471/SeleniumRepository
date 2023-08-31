package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nyka {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Nykaa Assignment
//		======================
//		1) Go to  https://www.nykaa.com/
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
		Thread.sleep(3000);
		
//		2) Mouseover on Brands and Search L'Oreal Paris
		Actions act = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		//mandatory to use perform
		act.moveToElement(brands).perform();
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		
//		3) Click L'Oreal Paris
		driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();
		
//		4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();
		System.out.println("Title of the web page: "+title);
		
//		5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'control-indicator ')])[4]")).click();
		
//		6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("(//div[contains(@class,'filter-open')]/div)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		WebElement shampoo = driver.findElement(By.xpath("//div[contains(@class,'checkbox')]"));
		shampoo.click();
//		String shamp = shampoo.getText();
		String shamp="shampoo";
		Thread.sleep(7000);
		
//		7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//input[contains(@id,'Protection')]/following::div[contains(@class,'checkbox')])[3]")).click();
		
//		8)check whether the Filter is applied with Shampoo
		String filter = driver.findElement(By.className("filter-value")).getText();
		if (filter.equalsIgnoreCase(shamp)) {
			System.out.println("Filter is applied with Shampoo");
		} else {
			System.out.println("Filter is not applied with Shampoo");
		}
		Thread.sleep(7000);
		
//		9) Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
//		10) GO to the new window and select size as 175ml
//		not available selecting the nearest value 180 ml
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allLinks = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLinks.get(1));
		
		driver.findElement(By.xpath("//button[@type='button']/span[text()='180ml']")).click();
		
//		11) Print the MRP of the product
		String price = driver.findElement(By.xpath("//span[contains(text(),'209')]")).getText();
		String MRP = price.replaceAll("[^0-9]", "");
		System.out.println("MRP of the product: "+MRP);
		
//		12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
//		13) Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		Thread.sleep(3000);
		
//		14) Print the Grand Total amount
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("//span[contains(text(),'279')]")).getText();
		String grand = grandTotal.replaceAll("[^0-9]", "");
		int grandTot = Integer.parseInt(grand);
		System.out.println("Grand Total amount: "+grandTot);
		
//		15) Click Proceed
		driver.findElement(By.xpath("(//div[contains(@class,'vhhhd')])[2]")).click();
		
//		16) Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
//		17) Check if this grand total is the same in step 14
		String priceDetails = driver.findElement(By.xpath("(//div[contains(@class,'qlrij')]//p)[4]")).getText();
		String priced = priceDetails.replaceAll("[^0-9]", "");
		int priceDet = Integer.parseInt(priced);
		
		driver.switchTo().defaultContent();
		
		if (grandTot==priceDet) {
			System.out.println("Grand Total is same as price details: "+priceDet);
		} else {
			System.out.println("Grand Total is not same as price details: "+priceDet);
		}
		
//		18) Close all windows
		Thread.sleep(5000);
		driver.quit();
	}

}
