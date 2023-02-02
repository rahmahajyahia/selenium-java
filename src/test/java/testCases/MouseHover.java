package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "http://demoqa.com/menu/";
		driver.get(url);
		
		Actions actions = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		actions.moveToElement(mouseHover).perform();
		
		driver.quit();
		

	}

}
