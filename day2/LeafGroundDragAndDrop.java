package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/");
		
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Drag']")).click();
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Point location = drag.getLocation();
		int x = location.x;
		System.out.println("X axis offset point: "+x);
		int y = location.y;
		System.out.println("X axis offset point: "+y);
		
		Actions act=new Actions(driver);
		//we need to perform after the action to execute it
	    act.dragAndDropBy(drag, 150, 0).perform();
	    Thread.sleep(3000);
	    
	    WebElement drag2 = driver.findElement(By.id("form:drag_content"));
	    String dragToTarget = drag2.getText();
	    System.out.println(dragToTarget);
	    WebElement drop = driver.findElement(By.id("form:drop_content"));
	    String dropHere = drop.getText();
	    System.out.println(dropHere);
	    
	    //it mandatory to use perform after the action
	    act.dragAndDrop(drag2, drop).perform();
	    WebElement dropped = driver.findElement(By.xpath("//p[@class='ui-widget-header']"));
	    String droppedHere = dropped.getText();
	    System.out.println(droppedHere);
	    Thread.sleep(5000);
	    
	    //close the browser
	    driver.close();
	}

}
