package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerryResizeable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		load the url https://jqueryui.com/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		
//		https://jqueryui.com/droppable
		driver.findElement(By.linkText("Resizable")).click();
		Thread.sleep(3000);
		
//		create action class
		Actions act = new Actions(driver);

		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement vertical = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-e')]"));
		act.doubleClick(vertical).perform();
		act.dragAndDropBy(vertical, 200, 0).perform();
        Thread.sleep(5000);
        
		WebElement horizontal = driver.findElement(By.xpath("(//div[contains(@class,'ui-resizable-s')])[1]"));
		act.doubleClick(horizontal).perform();
		act.dragAndDropBy(horizontal, 0, 200).perform();
	}

}
