package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealMoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//disable notification
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		//open Chrome browser
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the URL https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		
		//select Men's Fashion
		WebElement MoveToElement = driver.findElement(By.xpath("//span[@class='catText']"
				+ ""));
		Actions obj=new Actions(driver);
		obj.moveToElement(MoveToElement).perform();
		
	}

}
