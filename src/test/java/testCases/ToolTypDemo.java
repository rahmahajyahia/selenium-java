package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTypDemo {

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
		String url = "http://demoqa.com/tool-tips/";
		driver.get(url);

		WebElement text = driver.findElement(By.id("toolTipButton"));

		String toolTipText = text.getText();

		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			System.out.println("Pass : ToolTyp matching expected value");
		} else {
			System.out.println("Fail : ToolTyp not matching expected value");

		}
		
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		
		System.out.println("PlaceHolder is : "+ textPlaceHolder);

	}

}
