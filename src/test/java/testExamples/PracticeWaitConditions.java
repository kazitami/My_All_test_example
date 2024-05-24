package testExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PracticeWaitConditions {

	//There are 3 types of wait conditions in Selenium
	//1. implicitWait
	//2.explicitWait
	//3.fluentWait
	
	public WebDriver driver;
	
	@Test
	public void implicitWaitUnderstanding() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(1000));
		
		driver.findElement(By.linkText("My Account")).click();
		
	}
	
	@Test
	public void explicitlyWaitUnderstanding() throws Exception {
		//Java has some wait  conditions
		//Thead.sleep(2000); defined within java
		//WebDriverWait - this is explicitWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("My Account")));
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		Thread.sleep(2000);// here 2000 means 2 seconds
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
	}
}
