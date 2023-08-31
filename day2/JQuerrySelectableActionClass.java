package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerrySelectableActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		load the url https://jqueryui.com/
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);

//		https://jqueryui.com/droppable
		driver.findElement(By.linkText("Selectable")).click();
		Thread.sleep(3000);

		// switching from windows to frame
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement item1 = driver.findElement(By.xpath("//ol[@id='selectable']/li"));
		
		WebElement item3 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[3]"));
		
		WebElement item5 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[5]"));

		Actions act = new Actions(driver);
//		key down the control key
//		first we need to use keyboard function
//		after selecting the options use key up the control key
		act.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
	}

}
