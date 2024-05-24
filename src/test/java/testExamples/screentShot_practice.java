package testExamples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
	
public class screentShot_practice {
	
	public WebDriver driver;
	
	@Test
	public void screenShot() throws IOException {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
	driver.get("https://openweathermap.org/");
	
	WebElement logo = driver.findElement(By.xpath("//div[@class='section where-to']"));
	
	File source = logo.getScreenshotAs(OutputType.FILE);
		
	File destination = new File(System.getProperty("user.dir")+"\\test-output\\ScreenShots\\openweatherlogo.png");
	
	FileHandler.copy(source, destination);
	
	}
}
