package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "http://demoqa.com/slider/";
		driver.get(url);
		
		Actions actions = new Actions(driver);
		
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		
		actions.moveToElement(slider, 50, 0).click().build().perform();
		
		//slider.click();
		
		System.out.println("Moved slider in horizontal directions");

	}

}
