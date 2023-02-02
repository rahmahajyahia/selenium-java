  package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

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
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement element = driver.findElement(By.id("txtUsername"));
		
		String attValue = element.getAttribute("id");
		System.out.println("The id attribute is : "+attValue);
		driver.findElement(By.id("txtUsername")).clear();
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement element2 = driver.findElement(By.id("txtPassword"));
		
		Dimension dimensions =  element2.getSize();
		System.out.println("Hight : "+dimensions.height + "Width : "+dimensions.width);
		
		driver.findElement(By.id("txtPassword")).clear();
		
		WebElement element3 = driver.findElement(By.id("txtPassword"));
		Point point = element3.getLocation();
		System.out.println("X cordinate : "+point.x + " Y cordinate : "+point.y);

		driver.findElement(By.id("txtPassword")).clear();
		
		//Vérifier si le boutton affiché vrai/faux
		WebElement element4 = driver.findElement(By.id("btnLogin"));
		boolean status = element4.isDisplayed();
		System.out.println(status);
		
		//Vérifier si le boutton activé vrai/faux
		WebElement element5 = driver.findElement(By.id("btnLogin"));
		boolean status1 = element5.isEnabled();
		System.out.println(status1);
		
		//Vérifier si l'element boutton existe
		List<WebElement> element6 = driver.findElements(By.id("btnLogin"));
		if (element6.size()!=0) {
			
			System.out.println("Element button is exist");

		}else {
			
			System.out.println("Element button is not exist");

		}
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();

	}

}




