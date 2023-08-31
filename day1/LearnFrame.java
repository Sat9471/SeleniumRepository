package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
		// load the URL https://www.leafground.com/frame.xhtml
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//focus to frame
		driver.switchTo().frame(0);
		
		//click the button inside the frame
		//driver.findElement(By.xpath("//button[@id='Click']")).click();
		WebElement frame = driver.findElement(By.xpath("//button[@id='Click']"));
		frame.click();
		String text = frame.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		//come out from frame
		driver.switchTo().defaultContent();
		
		//we can click the webpage only after exiting from the frame
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
	}

}
