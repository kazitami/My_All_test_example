package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Negetive_TestCases_Acknowlegement_practice {
	public WebDriver driver;
	
	@BeforeMethod
	public void openWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsNinja.com/demo");
	}
	
	@Test
	public void registerTestWithValidData() {
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
		@Test
		public void registerTestWithInvalidData() {
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Seleniumfgh");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Pandafgh");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumfghpanda@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("987fgh6543210");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selefghnium@123");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selefghnium@123");
			driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
			@Test
			public void registerTestWithInvaliCredential() {
				driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selensdfgium");
				driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Pandasdfg");
				driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
				driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
				driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenisdfgum@123");
				driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenisdfgum@123");
				driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
				driver.findElement(By.cssSelector("a.agree+input")).click();
				driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			}
				@Test
				public void registerTestWithValidEmailInvalidPassword() {
					driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
					driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
					driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
					driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
					driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selendsfgium@123");
					driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
					driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
					driver.findElement(By.cssSelector("a.agree+input")).click();
					driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		
	}
	@AfterMethod
	public void closingMethod() {
		driver.quit();
	}
	
}
