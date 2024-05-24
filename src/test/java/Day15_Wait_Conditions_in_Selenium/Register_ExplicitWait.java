package Day15_Wait_Conditions_in_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Register_ExplicitWait {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test(priority=1)
	public void TutorialsninjaExplicitWait() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Account")));
		driver.findElement(By.linkText("My Account")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		driver.findElement(By.linkText("Register")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-firstname")));
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-lastname")));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-email")));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda145@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-telephone")));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-password")));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#input-confirm")));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")));
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.agree+input")));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.btn.btn-primary")));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
	
