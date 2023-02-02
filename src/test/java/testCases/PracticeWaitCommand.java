package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaitCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Maximaze window
		driver.manage().window().maximize();

		//Open URL Orange
		String url = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(url);
		
		//Click on the button simple alert using JavaScript method
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
		executor.executeScript("arguments[0].click();", alert);

		//Create new webdriver wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//Wait for alert to be present
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either popup is displayed or it's timed out");
		
		//Accept the alert 
		myAlert.accept();
		System.out.println("Alert accepted");
		
		//Close the main window 
		driver.close();
	}

}
