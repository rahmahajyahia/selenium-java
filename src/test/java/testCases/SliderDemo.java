package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/drivers/chromedriver.exe");

		// open Chrome
		WebDriver driver = new ChromeDriver();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		// open url orange
		String url = "http://demoqa.com/slider/";
		driver.get(url);
		//http://demoqa.com/slider/
		//http://the-internet.herokuapp.com/horizontal_slider?fbclid=IwAR1HUCOysoKASE0-0hQxHl6vtokt3plm5I57c5jBvD13IPaAOLv0RiZU4FU

		int x = 10;
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		int width = slider.getSize().getWidth();
		System.out.println(width);
		Actions move = new Actions(driver);
		move.moveToElement(slider, ((width * x) / -30), 0).click();
		move.build().perform();
		System.out.println("Slider moved");
		
//		  WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
//	        for(int i=0;i<=0.5;i++){
//	                         //Slide to RIGHT
//	                       slider.sendKeys(Keys.ARROW_RIGHT);
//	                       Thread.sleep(3000);
//	                        //Slide to LEFT
//	                      slider.sendKeys(Keys.ARROW_LEFT);
//	                    }

	}

}
