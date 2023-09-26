package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrombrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
