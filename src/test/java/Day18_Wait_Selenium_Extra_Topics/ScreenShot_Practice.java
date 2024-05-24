package Day18_Wait_Selenium_Extra_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot_Practice {
	public class screen_shot{
		public WebDriver driver;
		@Test
		public void hotToCaptureScreenShot() throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			
			WebElement logo = driver.findElement(By.cssSelector("div.product-layout.col-lg-3.col-md-3.col-sm-6.col-xs-12"));
			File source = logo.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir")+"\\test-output\\ScreenShots\\xyz.jpeg");
			FileHandler.copy(source, destination);
		}
	}
}
