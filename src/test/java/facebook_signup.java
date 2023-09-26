import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook_signup {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		driver.findElement(By.name("firstname")).sendKeys("Niraj");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("9582094268");
		driver.findElement(By.name("reg_passwd__")).sendKeys("491994");
		driver.findElement(By.name("birthday_day")).sendKeys("4");
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("1994");
		driver.findElement(By.name("sex")).sendKeys("Male");
		driver.findElement(By.linkText("Sign Up")).click();
		
		
		
		
			
		
		

	
		

	}

}
