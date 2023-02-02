package testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser() {
		
		//Create new instance on the chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	

	@Test
	public void valid_UserCredential() {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test
	public void invalid_UserCredential() {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Salma");
		driver.findElement(By.id("txtPassword")).sendKeys("Salma123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test
	public void navigate() {
		
		driver.findElement(By.id("Subscriber_link")).click();	
		}
	
	@AfterClass
	public static void tearDown() {
		
		//driver.quit();
	}

}
