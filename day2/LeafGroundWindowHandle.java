package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/auth.xhtml");
		
		//click on basic author
		driver.findElement(By.xpath("//span[text()='Basic Auth']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		
		//Name of the parent window
		String title = driver.getTitle();
		System.out.println("Name of the first window: "+title);
		
		// change the string to list
	    List<String> allLinks=new ArrayList<String>(windowHandles);
	    driver.switchTo().window(allLinks.get(1));
	    
	   //Title of the child window
	    String title2 = driver.getTitle();
	    System.out.println("Name of the second window: "+title2);
	    
	    
		
	}

}
