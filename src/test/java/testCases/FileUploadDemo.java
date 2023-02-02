package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Maximaze window
		driver.manage().window().maximize();

		//Open URL Orange
		String url = "http://demo.guru99.com/test/upload/";
		driver.get(url);
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\\\Desktop\\formation QA\\Capture.PNG");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();//*[@id="res"]/center
		
		//driver.quit();
		
	}

}
