package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open chrome
		WebDriver driver = new ChromeDriver();

		// implicite wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximaze window
		driver.manage().window().maximize();

		// open URL Orange
		String url = "https://www.google.com";
		driver.get(url);

		WebElement googleSearch = driver.findElement(By.id("realbox"));

		googleSearch.sendKeys("selenium");

		googleSearch.sendKeys(Keys.ENTER);

	}

}
