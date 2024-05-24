package Day15_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_ExplicitWait {

	public WebDriver driver;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@Test
	public void validCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account"))); // clicking on My Account
		driver.findElement(By.linkText("My Account")).click();
		
		//click on Login
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		driver.findElement(By.linkText("Login")).click();
		
		//entering email
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-email")));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("automation5@gmail.com");
		
		//entering password
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-password")));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("@automation");
	
		//click on Login
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.btn.btn-primary")));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
