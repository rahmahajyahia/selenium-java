package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();
		
		//Implicite wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Maximaze window
		driver.manage().window().maximize();

		//Open URL Orange
		String url = "https://demoqa.com/text-box";
		driver.get(url);

		//Find web element
		WebElement userName = driver.findElement(By.id("userName"));

		//WebElement userEmail = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

		//Instanciate action class
		Actions actions = new Actions(driver);
		actions.sendKeys(userName, "Zied").perform();
		actions.click(currentAddress).sendKeys("Tunis").perform();

		//Copy current address
		actions.keyDown(currentAddress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAddress, Keys.CONTROL).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//Javascript executor click button submit
		WebElement submit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", submit);
		
		
		

	}

}
