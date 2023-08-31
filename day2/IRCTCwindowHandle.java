package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCwindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//disable notifications
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//add option arguements to the ChromeDriver
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//load the URL https://www.irctc.co.in/
		driver.get("https://www.irctc.co.in/");
		
		//click on the flights link
		driver.findElement(By.xpath(" //a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Multiple windows: "+windowHandles);
	}

}
