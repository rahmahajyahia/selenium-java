package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		// open url demoQA
		String url = "http://demoqa.com/buttons";
		driver.get(url);

		// instantiate action class
		Actions actions = new Actions(driver);

		// retrieve webelement to perform double click 
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));

		// doubleClick on the button 
		actions.doubleClick(btnDoubleClick).perform(); 

		System.out.println("Button is Double Clicked");

		// storage
		String doubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();

		Assert.assertTrue(doubleClickMessage.contains("You have done a double click"));

		// close browser
		driver.quit();

	}

}
