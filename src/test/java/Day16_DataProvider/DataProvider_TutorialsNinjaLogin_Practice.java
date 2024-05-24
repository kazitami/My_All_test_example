package Day16_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TutorialsNinjaLogin_Practice {
	public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData")
	public void loginTest(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getTNLoginData(){
		Object[][] data = {{"seleniumpanda@gamil.com", "Selenium@123"},
				{"seleniumpanda1@gamil.com", "Selenium@123"},
				{"seleniumpanda2@gamil.com", "Selenium@123"},
				{"seleniumpanda3@gamil.com", "Selenium@123"},
				{"seleniumpanda4@gamil.com", "Selenium@123"},
				{"seleniumpanda5@gamil.com", "Selenium@123"},
				{"seleniumpanda6@gamil.com", "Selenium@123"},
				{"seleniumpanda7@gamil.com", "Selenium@123"},
				{"seleniumpanda8@gamil.com", "Selenium@123"},
				{"seleniumpanda9@gamil.com", "Selenium@123"},
				{"seleniumpanda10@gamil.com", "Selenium@123"}};

		return data;
				
	}
}
