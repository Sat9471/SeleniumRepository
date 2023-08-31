package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
//		1. Launch https://www.snapdeal.com/
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
//		2. Go to Mens Fashion
		WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		act.moveToElement(mens).perform();
		
//		3. Go to Sports Shoes
		driver.findElement(By.partialLinkText("Sports Shoes")).click();
		Thread.sleep(3000);
		
//		4. Get the count of the sports shoes
		String count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		int countMensSportShoes = Integer.parseInt(count);
		System.out.println("Count of the Sports shoes Fashion: "+countMensSportShoes);
		Thread.sleep(3000);
		
//		5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
//		6. Sort by Low to High
		driver.findElement(By.className("sort-label")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(10000);
		
//		7. Check if the items displayed are sorted correctly
		
		List<WebElement> priceList = driver.findElements(By.xpath("//span[contains(@class,'product-price')]"));
        //int sorted =1;   --> we can use boolean data type or sorted
		boolean sorted = true;
        int previousPrice=0;
        for (WebElement price : priceList) {
			int currentPrice = Integer.parseInt(price.getText().replaceAll("[^\\d]", ""));
			if(previousPrice>currentPrice) {
				//int sorted =0;   --> we can use boolean data type or sorted
				sorted=false;
				// it will stop iterating, if the current price of the item is less than the previous item
				// it will break because if condition match and the sorted will be false
				//break if the loop is not true
				break;
			}
			//current price of the first item is equals to the previous price of the second item
			//Update the previous price with the current price
			previousPrice=currentPrice;
		}
        if (sorted) {
			System.out.println("Items are sorted correctly from low to high");
		} else {
            System.out.println("Items are not sorted correctly from low to high");
		}
		Thread.sleep(10000);
		
//		8. Select the price range (900-1200)
//       WebElement dragPriceFilterLow = driver.findElement(By.xpath("//div[contains(@class,'filter-price-slider')]/a"));
//       Point location = dragPriceFilterLow.getLocation();
//       int x = location.x;
//       int y = location.y;  
//        act.dragAndDropBy(dragPriceFilterLow, countMensSportShoes, previousPrice)
		
		WebElement priceFrom = driver.findElement(By.xpath("//input[@class='input-filter']"));
        priceFrom.clear();
        priceFrom.sendKeys("500");
        Thread.sleep(1000);
        
        WebElement priceTo = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
        priceTo.clear();
        priceTo.sendKeys("1200");
        driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
        Thread.sleep(10000);
        
//	    9. Filter with color Navy 
        WebElement color = driver.findElement(By.xpath("//input[contains(@id,'s-Navy')]/following-sibling::label"));
        act.moveToElement(color);
        //color.sendKeys(Keys.ENTER);
        //arguments[0] index starts from 0, it will go to the first web element
        driver.executeScript("arguments[0].click();",color);
        Thread.sleep(10000);
        
//		10. verify the all applied filters 
       List<WebElement> filters = driver.findElements(By.xpath("//div[@class='navFiltersPill']"));
        for (int i = 0; i < filters.size()-2; i++) {
			System.out.println(filters.get(i).getText());
           }
           if (filters.get(0).getText().equalsIgnoreCase("Price: Rs. 519 - Rs. 999")) {
				System.out.println("Price filter applied");
			} else {
				System.out.println("Price filter not applied");
			}
			
			if (filters.get(1).getText().equalsIgnoreCase("Color: Navy")) {
				System.out.println("Color filter applied");
			} else {
				System.out.println("Color filter not applied");
			}
 
        
//		11. Mouse Hover on first resulting Training shoes
			//it is mandatory to use perform() after the actions
		Thread.sleep(10000);
		WebElement firstResult = driver.findElement(By.xpath("//div[contains(@class,'product-tuple-image')]"));
        act.moveToElement(firstResult).perform();
        
//		12. click QuickView button
        //using setTimout in console setTimeout(function(){debugger;},10000)
        driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
        
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> links = new ArrayList<String>(windowHandles);
        driver.switchTo().window(links.get(1));
        
//		13. Print the cost and the discount percentage
        String CostAndDiscount = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY')]")).getText();
        System.out.println(CostAndDiscount);
        
//		14. Take the snapshot of the shoes.
        File scr = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap/snapDeal.png");
        
        FileUtils.copyFile(scr, dest);
        
//		15. Close the current window
        driver.close();
        driver.switchTo().window(links.get(0));
        
//		16. Close the main window
        driver.quit();
        }

}
