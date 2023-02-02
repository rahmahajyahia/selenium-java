package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");
		
		// WebDriver driver = new ChromeDriver();
//				ChromeOptions capability = new ChromeOptions();
//				capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//				capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//				WebDriver driver = new ChromeDriver(capability);

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
		
		// delete cookies
		driver.manage().deleteAllCookies();

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);

		// wait 3 sec
		//Thread.sleep(3000);

		// input username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// wait 3 sec
		Thread.sleep(3000);

		// input password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click button login with explicit wait
		WebElement btnLogin;
		btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
		btnLogin.click();

		// click button without explicit wait
		// driver.findElement(By.id("btnLogin")).click();

		// print a log in message to the screen
		System.out.println("Successfully Authentification");
		
		// storage
		String adminUser = driver.findElement(By.id("welcome")).getText();
		
		System.out.println("Admin User is : "+adminUser);
		
		//Assert.assertTrue(adminUser.contains("Welcome Linda"));
		Assert.assertEquals("Welcome Linda", adminUser);

		// close browser / Kill
		//driver.quit();

	}

}
