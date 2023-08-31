package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the url https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		//get to the xpath
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Help']"));
        Actions obj=new Actions(driver);
        obj.scrollToElement(scroll).perform();
        Thread.sleep(3000);
        
        scroll.click();
	}

}
