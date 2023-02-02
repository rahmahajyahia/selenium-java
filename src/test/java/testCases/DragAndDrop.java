package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

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
		String url = "http://demoqa.com/droppable/";
		driver.get(url);

		Actions actions = new Actions(driver);

		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));

		// perform
		actions.dragAndDrop(from, to).perform();

		// verify text changed in to dropped!

		String textTo = to.getText();

		if (textTo.equals("Dropped!")) {

			System.out.println("Pass : Source is dropped to target as expected");

		} else {
			System.out.println("Fail : Source couldn't be dropped to target as expected");
		}

	}

}
