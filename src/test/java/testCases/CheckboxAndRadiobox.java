package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxAndRadiobox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

// open chrome
		WebDriver driver = new ChromeDriver();

// implicite wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Maximaze window
		driver.manage().window().maximize();

// open URL Orange
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);

//Check Box
		WebElement hobbiesSport = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		hobbiesSport.click();

//Radio Button
		Select radio = new Select(driver.findElement(By.xpath("//input[contains(@value='Male')]")));
		radio.selectByValue("Male");

//scroll
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}

// Thread.sleep(2000);
// driver.navigate().refresh();
// Thread.sleep(2000);
// driver.navigate().back();
// Thread.sleep(2000);
// driver.navigate().forward();

	}

}