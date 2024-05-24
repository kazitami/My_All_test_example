package Day16_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TutorialsNinjaRegister {

	public WebDriver driver;

	@Test(dataProvider = "getTNRegisterData")
	void loginTest(String FirstName, String lastName,String email, String telephone,String password, String confirmPassword) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Register")).click();
		
	driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(FirstName);
	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastName);
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
	driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
	driver.findElement(By.xpath("//input[@name = 'newsletter' and @value='1']")).click();
	driver.findElement(By.cssSelector("a.agree+input")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
}
	//String FirstName, String lastName,String email, String telephone,String password, String confirmPassword
	@DataProvider
	public Object[][] getTNRegisterData() {
		Object[][] data = { {"test1" , "Auto","abcd1@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd1@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd2@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd3@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd4@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd5@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd6@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd7@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd8@gmail.com","23452345","abcd@123","abcd@123"},
				{"test1" , "Auto","abcd9@gmail.com","23452345","abcd@123","abcd@123"}};
		
		return data;
	}
}