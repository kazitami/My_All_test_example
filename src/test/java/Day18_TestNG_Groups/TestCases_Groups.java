package Day18_TestNG_Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases_Groups {

	//1.What are Groups?
	//2.How to create Groups?
	//3.How to execute Groups?
	//4.What are Metagroups?
	//5.Regular Expressions
	//6.Groups at a Class level
	
		public WebDriver driver;
		public ChromeOptions options;
		
		@BeforeMethod
		public void setup() {
			options = new ChromeOptions();
			driver = new ChromeDriver();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximize");
			options.addArguments("--incognito");
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();		
		}
		
		@Test(priority=1, groups = {"smoke" , "sanity", "regression"})
		public void verifyLoginWithValidCredentials() {
		
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());						
		}	
		
		@Test(priority=2, groups = {"smoke" , "sanity"})
		public void verifyLoginWithInvalidCredentials() {
		
			driver.findElement(By.id("input-email")).sendKeys("seleniumhellopanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
			
			
		}	
		@Test(priority=3, groups={"smoke"})
		public void verifyLoginWithValidEmailInvalidPassword() {
		
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123456");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));	
		}
		@Test(priority=4, groups = {"sanity"})
		public void verifyLoginWithInvalidEmailValidPassword() {
		
			driver.findElement(By.id("input-email")).sendKeys("seleniumhellopanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
			
			
		}
		
		@Test(priority=5, groups = {"regression"})
		public void verifyLoginWithNoCredentials() {
		
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
			String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));			
			
		}	
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}
