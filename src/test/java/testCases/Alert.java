package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "src/test/ressources/drivers/geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 */
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "https://demoqa.com/alerts";
		driver.get(url);

		driver.findElement(By.id("alertButton")).click();
		// driver.findElement(By.xpath("//button[@type='button']")).click();

		// accept alert
		driver.switchTo().alert().accept();

		String title = driver.getTitle();

		System.out.println("Title of the app is "+title);

		// close browser
		//driver.quit();


	}

}
