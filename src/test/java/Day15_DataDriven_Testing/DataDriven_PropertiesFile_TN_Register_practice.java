package Day15_DataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDriven_PropertiesFile_TN_Register_practice {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	@Test(priority=1)
	public void readRegisterDataFromPropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Day15_DataDriven_Testing\\config_Register.properties");
		prop.load(ip);
		
		registerCode();
		registerWithNoDetailEnterCode();
	}
	
	public void registerCode() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		//verify Title and Current url
		String actualTitle = driver.getTitle();
		String expectedTitle = prop.getProperty("registerTitle");
		System.out.println(actualTitle);
		
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = prop.getProperty("url");
		System.out.println(actualCurrentUrl);
	
		if(actualTitle.equals(expectedTitle) && (actualCurrentUrl.equals(expectedCurrentUrl)))
		{
			//driver.get(prop.getProperty("url"));
			//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
			
			String actualRegisterCurrentUrl = driver.getCurrentUrl();
			System.out.println(actualRegisterCurrentUrl);
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstName"));
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastName"));
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
			driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("div#content>p:nth-child(2)")).isDisplayed());
			driver.quit();
		}

		
	}
	
//	url = https://tutorialsninja.com/demo
//  title = "Your Store"	
//	firstName = Tom
//	lastName = Auto
//	email = tomauto@gmail.com
//	telephone = 2345452344
//	password = @automation
//	confirmPassword = @automation
//
//	PrivacyPolicyWarningMessage = Warning: You must agree to the Privacy Policy!
//	firstNameWarningMessage = First Name must be between 1 and 32 characters!
//	lastNameWarningMessage = Last Name must be between 1 and 32 characters!
//	emailWarningMessage = E-Mail Address does not appear to be valid!
//	telephoneWarningMessage = Telephone must be between 3 and 32 characters!
//	passwordWarnignMessage = Password must be between 4 and 20 characters!

	public void registerWithNoDetailEnterCode() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//verify Title and Current url
		
		String actualCurrentUrl = driver.getCurrentUrl();
		System.out.println(actualCurrentUrl);
		String expectedCurrentUrl = prop.getProperty("url");
		Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = prop.getProperty("title");
		System.out.println("actual Title " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("expected Title " + expectedTitle);
		
		
		
		if(actualTitle.equals(expectedTitle) && (actualCurrentUrl.equals(expectedCurrentUrl)))
		{
			//driver.get(prop.getProperty("url"));
			
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			String actualFirstNameWarningMessage = driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText();
			String expectedFirstNameWarningMessage = prop.getProperty("firstNameWarningMessage");
			Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage)); 
			
			String actualLastNameWarningMessage = driver.findElement(By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']")).getText();
			String expectedLastNameWarningMessage = prop.getProperty("lastNameWarningMessage");
			Assert.assertEquals(actualLastNameWarningMessage,expectedLastNameWarningMessage);
			
			String actualEmailWarningMessage = driver.findElement(By.xpath("//div[text()='E-Mail Address does not appear to be valid!']")).getText();
			String expectedEmailWarningMessage = prop.getProperty("emailWarningMessage");
			Assert.assertEquals(actualEmailWarningMessage, expectedEmailWarningMessage);
			
			String actualTelephoneWarningMessage = driver.findElement(By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']")).getText();
			String expectedTelephoneWarningMessage = prop.getProperty("telephoneWarningMessage");
			Assert.assertEquals(actualTelephoneWarningMessage,expectedTelephoneWarningMessage);
			
			String actualPasswordWarningMessage = driver.findElement(By.xpath("//div[text()='Password must be between 4 and 20 characters!']")).getText();
			String expectedPasswordWarningMessage = prop.getProperty("passwordWarnignMessage");
			Assert.assertEquals(actualPasswordWarningMessage, expectedPasswordWarningMessage);
			driver.quit();
		
		}
		
		
	}
	
	
	
}
