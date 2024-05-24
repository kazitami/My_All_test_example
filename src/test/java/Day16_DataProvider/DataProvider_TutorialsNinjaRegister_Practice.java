package Day16_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TutorialsNinjaRegister_Practice {
	public WebDriver driver;
	
	@Test(dataProvider = "getTNRegisterData")
	public void registerTutorialsninja(String firstname, String lastname, String email, String telephone, String password, String confPassword) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(confPassword);
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']")).isDisplayed());
		//driver.quit();
	}
	@DataProvider
	public Object[][] getTNRegisterData(){
		Object[][] data = {{"Selenium","Panda","seli45@gmail.com","24234234","Selenium@123","Selenium@123"},
				{"Selenium","Panda","seli46@gmail.com","24234234","Selenium@123","Selenium@123"}};
		return data;
	}
}
