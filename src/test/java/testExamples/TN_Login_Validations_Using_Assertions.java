package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Login_Validations_Using_Assertions {

	public WebDriver driver;
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@Test(priority=1)
	public void LoginWithValidCredential() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}
	
	@Test(priority=2)
	public void LoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniasfasdumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement WarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]"));
		
		String actualWarningMessage = WarningMessage.getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	}
	
	@Test(priority=3)
	public void LoginWithValidEmailInvalidPassword() {
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@1ffd23");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	WebElement WarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]"));
	
	String actualWarningMessage = WarningMessage.getText();
	String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	//Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	Assert.fail("Delebarate fail");
	}
	
	@Test(priority=4, alwaysRun=true,enabled=false, dependsOnMethods= {"LoginWithValidCredential","LoginWithInvalidEmailValidPassword","LoginWithValidEmailInvalidPassword"})
	public void LoginWithInvalidCredential() {
	driver.findElement(By.id("input-email")).sendKeys("seleniudfgdfmpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Seleniudfgm@1ffd23");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	WebElement WarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]"));
	
	String actualWarningMessage = WarningMessage.getText();
	String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
		
	}
	
	@Test(priority=5)
	public void LoginWithNoCredential() {
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	WebElement WarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]"));
	
	String actualWarningMessage = WarningMessage.getText();
	String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
	Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
