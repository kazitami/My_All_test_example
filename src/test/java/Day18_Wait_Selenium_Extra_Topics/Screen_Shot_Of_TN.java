package Day18_Wait_Selenium_Extra_Topics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screen_Shot_Of_TN {

	public class Screen_Shot {
		public WebDriver driver;

		@Test
		public void howToCaptureScreenShot() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");

		//Step 1: Identify the WebElement which you want to take screenshot of
		WebElement logo = driver.findElement(By.cssSelector("div.product-layout.col-lg-3.col-md-3.col-sm-6.col-xs-12"));

		//Step 2: Using the logo we will call a method known as getScreenshotAs
		File source = logo.getScreenshotAs(OutputType.FILE);

		//Where will you store this?
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\ScreenShots\\abcd.jpg");

		//copy the source into the destination
		FileHandler.copy(source, destination);

		}
		}

	
}
