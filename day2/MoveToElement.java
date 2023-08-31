package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to close the notification
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the url https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		
		//selct Male
		WebElement moveToElement = driver.findElement(By.xpath("//a[@title='MEN']"));
        Actions obj=new Actions(driver);
        obj.moveToElement(moveToElement).perform();
	}

}
