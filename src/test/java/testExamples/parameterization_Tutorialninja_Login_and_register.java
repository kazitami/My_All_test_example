package testExamples;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization_Tutorialninja_Login_and_register {

	public WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"url","email","password"})
	public void TNLogin(String url, String email, String password) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		
	}
	
	@Test(priority=2)
	@Parameters({"firstname","lastname","telephone","passwordr","confpasswordr"})
	public void TNRegister(String firstname, String lastname, String telephone, String passwordr, String confpasswordr) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(emailTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(passwordr);
		driver.findElement(By.id("input-confirm")).sendKeys(confpasswordr);
		driver.findElement(By.xpath("//input[@name='agree' and @value='1']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
	}
	
	public String emailTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":","_");
		return "seleniumpanda" + timeStamp + "@gmail.com";
	}
	
}
