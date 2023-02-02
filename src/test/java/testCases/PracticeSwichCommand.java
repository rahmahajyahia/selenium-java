package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwichCommand {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver4.exe");

		//Open chrome
		WebDriver driver = new ChromeDriver();
		
		//Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Maximaze window
		driver.manage().window().maximize();

		//Open URL Orange
		String url = "http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
		//Switching the frame by id
		driver.switchTo().frame("a077aa5e");
		System.out.println("***We are switch to the iframe***");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		System.out.println("***We are done***");
		
		driver.quit();
		
		
	}

}
