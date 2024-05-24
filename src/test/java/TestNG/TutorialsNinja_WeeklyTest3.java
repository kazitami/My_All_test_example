package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinja_WeeklyTest3 {
	public WebDriver driver;
	
//Question 8: Write an Automation program but strictly follow the instructions: -
//	Step1: Use TestNG
//	Step2: Use @BeforeMethod annotation to open the url https://tutorialsninja.com/demo
//	Step3: Write 3 test cases using @Test annotation for login
//	Step4: Use @AfterMethod annotation to quit the browser.
//	Step5: Validate in each page title and currenturl of the webpage.
//	Step6: Choose any 2 WebElements to determine their presence.
//	Step7: Use cssSelector as much as possible.
	
	@BeforeMethod
	public void openWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test
	public void loginTestWithValidCredential() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";

		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/";

		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}else {
			System.out.println("Title and CurrentUrl are incorrect");
		}

	//	WebElement MyAccount = driver.findElement(By.linkText("My Account")).click();
	//	if(MyAccount.isDisplayed() && MyAccount.isEnabled()) {
	//		MyAccount.click();
	//	}else {
	//		System.out.println("The MyAccount is not enabled or not displayed");
	//	}
		
		
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
	
	private WebElement findElement(By linkText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void loginTestWithInValidCredential() {
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("selefgjhniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selfgjhenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
}
	@Test
	public void loginTestWithValidNoCredential() {
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(2)>a")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@AfterMethod
	public void afterMethodMethod() {
		driver.quit();
	}	
	
	
}
