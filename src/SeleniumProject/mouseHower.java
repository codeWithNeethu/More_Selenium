package SeleniumProject;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHower {
	
	WebDriver driver;
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium Webdriver\\\\Chrome Driver New\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement sneakers = driver.findElement(By.xpath("//a[text()='Sneakers']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(sneakers).perform();
	}

}
