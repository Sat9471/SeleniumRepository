package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.mk_latn.No;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//syntax for simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//syntax for alert
		//driver.switchTo().alert();
		//ctrl+2 then assign to local variable
		Alert alert = driver.switchTo().alert();
		//getText(); helps to print the text
		//ctrl+2 then assign to local variable
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		
		//accept.alert
		alert.accept();
		
		String text2 = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
		//confirm.alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		
		String text3 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(text3);
		
		//No such alert present exception
		//alert.accept();
		
		//sweet alert confirmation alert
		//sweet alert dialog box is inspectable but we cannot inspect outside the dialog box
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		
		//we cannot use alert.getText(); for sweet alert
		//String text4 = alert.getText();
		//System.out.println(text4);
		
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//no such confirmation message to print in the sweet alert
		
		
		
		
	}

}
