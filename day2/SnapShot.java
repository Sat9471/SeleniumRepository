package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosales");

		//step to screen shot
		//In OutputType O and T must be in capital
		File scr = driver.getScreenshotAs(OutputType.FILE);
		
		//store image of snapshot or screenshot
		File dest=new File("./snap/imag.png");
		
		//
		FileUtils.copyFile(scr, dest);
		
	}

}
