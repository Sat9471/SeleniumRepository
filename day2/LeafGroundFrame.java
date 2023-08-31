package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//	get the URL https://leafground.com/frame.xhtml
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://leafground.com/frame.xhtml");
	
//switch to frame index()
	driver.switchTo().frame(0);
	
	//Click me(inside frame)
	WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
	frame1.click();
	Thread.sleep(3000);
	String click = frame1.getText();
	System.out.println(click);

//	switch back to window
	driver.switchTo().defaultContent();
	
//  How many frames in this page?
//	get using tagname
    List<WebElement> outerFrame = driver.findElements(By.tagName("iframe"));
	int count = outerFrame.size();
    System.out.println("Total number of outer frames: "+count);

	int count2=0;
	count2=count+outerFrame.size();
	
	//iterate the outerFrame
	for (int i = 0; i < outerFrame.size(); i++) {
		driver.switchTo().frame(i);
		List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));
		count2=count+innerFrame.size();
		
//		switch to default window
		driver.switchTo().defaultContent();
	}
	System.out.println("Total number of frame(outer frames+inner frames): "+count2);
	
//	switch to default window
	driver.switchTo().defaultContent();
	
	// Click Me (Inside Nested frame)
	driver.switchTo().frame(2);
    // enter inside another frame
	driver.switchTo().frame("frame2");
	
	WebElement secondFrameNested = driver.findElement(By.xpath("//button[@id='Click']"));
	secondFrameNested.click();
	String nestedFrame = secondFrameNested.getText();
	System.out.println(nestedFrame);
	
//	switch back to window
	driver.switchTo().defaultContent();
	
//	close the browser
	driver.close();
	}

}
