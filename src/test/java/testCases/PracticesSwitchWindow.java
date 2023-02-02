package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticesSwitchWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximaze window
		driver.manage().window().maximize();

		// Open URL Orange
		String url = "https://demoqa.com/browser-windows";
		driver.get(url);

		// Store and print the name of the first window
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		// Click on the button "New Window Message"
		driver.findElement(By.id("messageWindowButton")).click();

		// Store and print the name of all the windows open
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		// Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {

			
			driver.switchTo().window(handle1);
			System.out.println(handle1);
			
		}
	}
}
