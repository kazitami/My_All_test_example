package testExamples;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TN_Register_Validation_With_Assertion {
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
	}
	
	
	@Test(priority=1)
	public void registerWithMandatoryFields() {
		driver.findElement(By.id("input-firstname")).sendKeys("tomtom");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("tomtomautomation20@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("324523452345");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content>p:nth-child(2)")).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void registerWithAllDetails() {
		driver.findElement(By.id("input-firstname")).sendKeys("tomtom");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("tomtomautomation20@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("324523452345");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div#content>p:nth-child(2)")).isDisplayed());
		
	}
	
	@Test(priority=3)
	public void registerWithwrongConfirmpasswordDetails() {
		
	}
	
	@Test(priority=4)
	public void registerWithExistingEmail() {
		
	}
	
	@Test(priority=5)
	public void registerWithNoFields() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//privacy policy
		WebElement PrivacyPolicy = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]"));
		String actualPrivacyPolicyWarningMessage = PrivacyPolicy.getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(actualPrivacyPolicyWarningMessage, expectedPrivacyPolicyWarningMessage);
		
		//firstname
		WebElement firstnameWarningMessage = driver.findElement(By.xpath("//input[@id='input-firstname']/following::div[1]"));
		String actualfirstnameWarningMessage = firstnameWarningMessage.getText();
		String expectedfirstnameWarningMessage = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(actualfirstnameWarningMessage, expectedfirstnameWarningMessage);
		
		//lastname
		WebElement lastnameWarningMessage = driver.findElement(By.xpath("//input[@id='input-lastname']/following::div[1]"));
		String actuallastnameWarningMessage = lastnameWarningMessage.getText();
		String expectedlastnameWarningMessage = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(actuallastnameWarningMessage, expectedlastnameWarningMessage);
		
		//email
		WebElement emailWarningMessage = driver.findElement(By.xpath("//input[@id='input-email']/following::div[1]"));
		String actualemailWarningMessage = emailWarningMessage.getText();
		String expectedemailWarningMessage = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(actualemailWarningMessage, expectedemailWarningMessage);
		
		//telephone
		WebElement telephoneWarningMessage = driver.findElement(By.xpath("//input[@id='input-telephone']/following::div[1]"));
		String actualtelephoneWarningMessage = telephoneWarningMessage.getText();
		String expectedtelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(actualtelephoneWarningMessage, expectedtelephoneWarningMessage);		
		
		//password
		WebElement passwordWarningMessage = driver.findElement(By.xpath("//input[@id='input-password']/following::div[1]"));
		String actualpasswordWarningMessage = passwordWarningMessage.getText();
		String expectedpasswordWarningMessage = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(actualpasswordWarningMessage, expectedpasswordWarningMessage);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
