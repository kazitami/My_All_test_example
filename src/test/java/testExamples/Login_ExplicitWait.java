package testExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_ExplicitWait {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void validCredentials() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));
		driver.findElement(By.linkText("My Account")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		driver.findElement(By.linkText("Login")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.btn.btn-primary")));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
	}
}
