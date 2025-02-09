package com.tutorialsNinja.Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	@BeforeMethod
	public void LoginSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsNinja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@Test(priority=1)
	public void verifyLoginWithValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}
	@Test(priority=2)
	public void verifyLoginWithValidEmainInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123345");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String ActualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(ActualWarningMessage, ExpectedWarningMessage);
	}
	@Test(priority=3)
	public void verifyLoginWithInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandaasf@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String ActualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(ActualWarningMessage, ExpectedWarningMessage);
	}
	@Test(priority=4)
	public void verifyLoginWithInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandaasf@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234534");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String ActualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(ActualWarningMessage, ExpectedWarningMessage);
	}
	@Test(priority=5)
	public void verifyLoginWithNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String ActualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String ExpectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(ActualWarningMessage, ExpectedWarningMessage);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
