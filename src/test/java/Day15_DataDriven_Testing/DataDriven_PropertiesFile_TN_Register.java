package Day15_DataDriven_Testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDriven_PropertiesFile_TN_Register {
	public WebDriver driver;
	public 	Properties prop;
	public FileInputStream ip;
	@Test
	public void readRegisterDataFromPropertiesFile() throws Exception {
		prop =new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\DataDriven_Testing\\config_Register.properties");
		prop.load(ip);		
	}
	@Test(enabled=false)
	public void checkPath() {
		registerCode();
		registerAccountWithoutEnteringAnyDetails();
	}
	public void registerCode() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(prop.getProperty("telephone"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
		
	}
	
	public void registerAccountWithoutEnteringAnyDetails() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualPrivacyPolicyWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedPrivacyPolicyWarningMessage = prop.getProperty("PrivacyPolicyWarningMessage");
		Assert.assertEquals(actualPrivacyPolicyWarningMessage, expectedPrivacyPolicyWarningMessage);
		
		String actualFirstNameWarningMessage = driver.findElement(By.cssSelector("input#input-firstname+div")).getText();
		String expectedFirstNameWarningMessage = prop.getProperty("FirstNameWarningMessage");
		Assert.assertTrue(actualFirstNameWarningMessage.contains(expectedFirstNameWarningMessage));
			
		String actualLastNameWarningMessage = driver.findElement(By.cssSelector("input#input-lastname+div")).getText();
		String expectedLastNameWarningMessage = prop.getProperty("LastNameWarningMessage");
		Assert.assertTrue(actualLastNameWarningMessage.contains(expectedLastNameWarningMessage));
		
		String actualEmailWarningMessage = driver.findElement(By.cssSelector("input#input-email+div")).getText();
		String expectedEmailWarningMessage = prop.getProperty("EmailWarningMessage");
		Assert.assertTrue(actualEmailWarningMessage.contains(expectedEmailWarningMessage));
		
		String actualTelephoneWarningMessage = driver.findElement(By.cssSelector("input#input-telephone+div")).getText();
		String expectedTelephoneWarningMessage = prop.getProperty("TelephoneWarningMessage");
		Assert.assertTrue(actualTelephoneWarningMessage.contains(expectedTelephoneWarningMessage));
		
		String actualPasswordWarningMessage = driver.findElement(By.cssSelector("input#input-password+div")).getText();
		String expectedPasswordWarningMessage = prop.getProperty("PasswordWarningMessage");
		Assert.assertTrue(actualPasswordWarningMessage.contains(expectedPasswordWarningMessage));
	}
	
	
}
