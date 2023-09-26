package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException 
	{
		
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/"); //facebook page
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("email")).sendKeys("niraj.sharma@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("niraj@43");
	 driver.findElement(By.id("u_0_5_r0")).click();
	 
	 
		
		
		
		
		
		

	}

}
