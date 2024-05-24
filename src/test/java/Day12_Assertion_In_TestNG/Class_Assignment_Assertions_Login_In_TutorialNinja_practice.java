package Day12_Assertion_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Assignment_Assertions_Login_In_TutorialNinja_practice {
	public WebDriver driver;
	
	@BeforeMethod
	public void loginOpeningWebsiteAssertion() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Title of the page - this is first validation we need to do
		String actualTitle = driver.getTitle(); //we know that the title is a String
		System.out.println(actualTitle); //this will print the title of this webpage
		String expectedTitle = "Account Login";
		
		//CurrentUrl of the webpage - this is the second validation which we need to do
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = "https://www.tutorialsninja.com/demo";
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}else {
			System.out.println("The title and current url of TutorailsNinja Landing Page are incorrect");
		}
		
		
//		driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.linkText("Login")).click();
	}
	@Test(priority=1)
	public void enterValidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).isDisplayed());	
		driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Logout']")).click();
	}
	@Test(priority=2)
	public void enterValidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123456456");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarnigMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.equals(expectedWarnigMessage));
	}
	@Test(priority=3)
	public void enterInvalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandasdfg@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarnigMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.equals(expectedWarnigMessage));
	}
	
	@Test(priority=4)
	public void enterInvalidCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("seleniumpandasdfg@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123dfgdsf");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarnigMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.equals(expectedWarnigMessage));
	}
	
	@Test(priority=5)
	public void enterNoCredentials() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		String expectedWarnigMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.equals(expectedWarnigMessage));
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
