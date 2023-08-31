package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerryDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		load the url https://jqueryui.com/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		
//		https://jqueryui.com/droppable
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);
		
//		create action class
		Actions act = new Actions(driver);
		
//      switching from driver to frame index
		driver.switchTo().frame(0);
		WebElement dragSource = driver.findElement(By.id("draggable"));
//      setting drag as source
		String drag = dragSource.getText();
		System.out.println(drag);
	
//      setting destination as drop
		WebElement dropDest = driver.findElement(By.id("droppable"));
		String drop = dropDest.getText();
		System.out.println(drop);
		
		act.dragAndDrop(dragSource, dropDest).perform();

//      switching back to window
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        
//      close the browser
        driver.close();
	}

}
