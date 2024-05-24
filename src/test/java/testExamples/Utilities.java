package testExamples;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Utilities {
	
public WebDriver driver;
	
	@Test(dataProvider = "getTNRegister" , invocationCount = 10)
	public void loginTest(String firstname, String lastname, String email, String telephone, String password, String confPassword ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(emailTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confPassword);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).isDisplayed());
		driver.quit();
	}
	
	
	
	@DataProvider
	public Object[][] getTNRegister() {
		Object[][] data = {{"Selenium","panda" ,"tomautomation12@gmail.com", "234523454","Selenium@123","Selenium@123"},
		};
		
		return data;
	}
	
	@Test
	public String emailTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(timeStamp);
		
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}

}
