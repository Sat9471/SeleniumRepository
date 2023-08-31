package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerryActionClassDraggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		load the url https://jqueryui.com/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		
//		https://jqueryui.com/draggable
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		
//		Create action class
		Actions act=new Actions(driver);

//		switching from windows to frame
		driver.switchTo().frame(0);
		
//		drag is the source and drop is the destination
		WebElement dragAndDrop = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		act.dragAndDropBy(dragAndDrop, 50, 50).perform();
		
//      navigating back to window from frame
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
//		close the browser
		driver.close();
		
	}

}
