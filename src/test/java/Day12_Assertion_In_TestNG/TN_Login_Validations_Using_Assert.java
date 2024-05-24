package Day12_Assertion_In_TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Login_Validations_Using_Assert {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=1)
	public void enterValidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}
	@Test(priority=2)
	public void enterInValidEmailValidPassword() {
		System.out.println("Will the child return ? " + driver.findElement(By.xpath("//i[@class = 'fa fa-exclamation-circle']")).getText());
		WebElement whichHoldsTheWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]"));

	//	assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).isDisplayed());

		String actualWarningMessage = whichHoldsTheWarningMessage.getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";

		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		Assert.assertEquals(actualWarningMessage, expectedWarningMessage);	}
}
