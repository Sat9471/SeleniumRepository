package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Open https://www.myntra.com/
		driver.get("https://www.myntra.com/");

//		2) Mouse hover on MeN 

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();

//		3) Click Jackets 
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();

//		4) Find the total count of item 
		WebElement count = driver.findElement(By.className("title-count"));
		String totalCount = count.getText();
		totalCount = totalCount.replaceAll("[^0-9]", "");
		int total = Integer.parseInt(totalCount);
		System.out.println("Total count of item: " + total);

//		5) Validate the sum of categories count matches
		WebElement cat1 = driver.findElement(By.className("categories-num"));
		String jackets = cat1.getText();
		jackets = jackets.replaceAll("[^\\d-.]", "");
		// converting string to integer for adding
		int jacket = Integer.parseInt(jackets);
		System.out.println("Number of items in Jacket category: " + jacket);

		WebElement cat2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]"));
		String rainJackets = cat2.getText();
		rainJackets = rainJackets.replaceAll("[^0-9]", "");
		// converting string to integer for adding
		int rainJacket = Integer.parseInt(rainJackets);
		System.out.println("Number of items in Rain Jackets category: " + rainJacket);

		int totalItems = jacket + rainJacket;
		if (total == totalItems) {
			System.out.println("Total count of item matches the categories items total");
		} else {
			System.out.println("Total count of item does not match the categories items total");
		}

//		6) Check jackets
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();

//		7) Click + More option under BRAND
		driver.findElement(By.className("brand-more")).click();

//		8) Type Duke and click checkbox
		WebElement searchBrand = driver.findElement(By.className("FilterDirectory-searchInput"));
		searchBrand.sendKeys("Duke");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']/div")).click();
		Thread.sleep(2000);

//		9) Close the pop-up x
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close sprites-remove')]")).click();

//		10) Confirm all the Coats are of brand Duke
//		    Hint : use List 
		List<WebElement> dukeList = driver.findElements(By.className("product-brand"));
		int size = dukeList.size();
		// to remove the duplicates we are converting list to set
		Set<String> dukeSet = new HashSet<String>();
		System.out.println("Number of items in the first result page: " + size);

		// using for each loop to print all the list web elements
		// and also to convert list to String
		for (WebElement brandName : dukeList) {
			// to get the text in the list web element
			String dukeBrand = brandName.getText();
			dukeSet.add(dukeBrand);
//			String brandTitle = "Duke";
//			It checks if the size of the set is 1, which means that all the brand names are the same.
		    }if (dukeSet.size()==1) {
//		    	 If so, it prints a message that all the coats are of Duke brand.
				System.out.println("All the coats in the first resulting page belongs to Duke Brand");
			} else {
//				Otherwise, it prints a message that some of the coats are not of Duke brand.
				System.out.println("Some of the coats in the first resulting page does not belongs to Duke Brand");
			}

//		11) Sort by Better Discount
	    driver.findElement(By.className("sort-sortBy")).click();
	    driver.findElement(By.xpath("(//label[contains(@class,'sort-label')])[4]")).click();
	    Thread.sleep(3000);
	    
//		12) Find the price of first displayed item
	    String price = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
	    System.out.println("Price of first displayed item: "+price);
	    
//		Click on the first product
	    driver.findElement(By.className("product-productMetaInfo")).click();
	    
//		13) Take a screen shot
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> allLinks = new ArrayList<String>(windowHandles);
	    driver.switchTo().window(allLinks.get(1));
	    
	    File scr = driver.getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("./snap/myntra.png");
	    
	    FileUtils.copyFile(scr, dest);
	    
//	    driver.switchTo().window(allLinks.get(0));
	    
//		14) Click on WishList Now
	    driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-wishlist ')]")).click();
	    String title = driver.getTitle();
	    System.out.println("Title of the web page: "+title);
	    
//		15) Close Browser
	    driver.quit();
}
}