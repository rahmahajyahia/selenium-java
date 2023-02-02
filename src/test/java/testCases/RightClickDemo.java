package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

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

		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));

		actions.contextClick(btnRightClick).perform();

		System.out.println("Right click context displayed");

		// storage
		String rightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();

		Assert.assertTrue(rightClickMessage.contains("You have done a right click"));

		// close browser
		driver.quit();

	}

}
