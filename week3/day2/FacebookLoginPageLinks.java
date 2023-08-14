package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  // open the browser	
      ChromeDriver driver=new ChromeDriver();
      
      // maximize the screen 
      driver.manage().window().maximize();
      
      //open the URL
      driver.get("https://www.facebook.com/");
      
      // driver.findElements(BY.tagName("a");
      // tag name must be inside the "" double quotations
      // ctrl+2 then assign to the local variable
      // I changed the findElement to links here
      List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("Number of links in the Facebook login page: "+links.size());
      
      
      
      for (int i = 0; i < links.size(); i++) {
    	  
    	  //links.get(i).getText();
    	  //ctrl+2 then assign to local variable
    	  String text = links.get(i).getText();
    	  
    	 System.out.println(text);
      }
      
   // to click particular links in the webpage
//      Firstname in the Facebook singup page
    	 Thread.sleep(2000);
    	 links.get(2).click();   	 
     
	}	  
}


