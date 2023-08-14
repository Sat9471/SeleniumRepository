package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //launch the url
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.leafground.com/select.xhtml");
		
		//choose your favorite automation tool
		//ctrl+2 then L to change the findElement to WebElement
		WebElement drop = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select fat=new Select(drop);
		fat.selectByIndex(1);
		
		//choose the preferred country
		//which is not an usual select drop down so we need to click on the dropdown first and then click on the required value
		driver.findElement(By.xpath("//label[contains(text(),'Select Country')]")).click();
		//after this we need to setTimeout(function(){debugger;},7000) in console of the DOM in the webpage to get the values for dropdown menu <li> tag
		driver.findElement(By.xpath("//li[contains(text(),'USA')]")).click();
		Thread.sleep(2000);
		
		//confirm city belongs to Country is loaded
		driver.findElement(By.id("j_idt87:city_label")).click();
		WebElement city3 = driver.findElement(By.xpath("//li[contains(text(),'Denver')]"));
		//city.getText();
		//then ctrl+2 then to local variable
		//Return type for getText() will be String
		String text = city3.getText();
		city3.click();	
		Thread.sleep(2000);
		
		//now change the country and check that city is different or not
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Brazil')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.xpath("//li[contains(text(),'USA')]")).click();
		Thread.sleep(2000);
		
		//now check the city and click
		//WebElement city2 = driver.findElement(By.xpath("//li[contains(text(),'New York')]"));
		driver.findElement(By.id("j_idt87:city_label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='New York']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		//choose language
		driver.findElement(By.id("j_idt87:lang_label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);
		
		//choose two irrespective of the language chosen
		driver.findElement(By.id("j_idt87:value_label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Two')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
