package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// Open chrome
		WebDriver driver = new ChromeDriver();

		// Implicite wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Maximaze window
		driver.manage().window().maximize();

		//Open URL Orange
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();
		
		System.out.println("Title of the page is : "+titlePage);
		System.out.println("Length title of the page is : "+titleLength);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			
			System.out.println("Verification successfull - the correct url is opened");

		} else {
			
			System.out.println("Verification failed - an incorrect url is opened");

		}	
		
		System.out.println("Actual URL is : "+actualUrl);
		System.out.println("Expected URL is : "+url);
		
		String sourcePage = driver.getPageSource();
		int lengthSourcePage = sourcePage.length();
		System.out.println("Length of the source page : "+lengthSourcePage);
		
		driver.quit();


	}

}
