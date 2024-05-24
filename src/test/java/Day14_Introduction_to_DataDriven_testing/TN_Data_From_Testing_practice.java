package Day14_Introduction_to_DataDriven_testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_Data_From_Testing_practice {
	
	public Properties prop;
	public FileInputStream ip;
	
	@Test(priority=1)
	public void setup() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Introduction_to_DataDriven_testing");
		prop.load(ip);
		login1();
	}
	
//	public void login() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));
//		driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
//		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
//		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//
//	}
	
	//Method
	public void login1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("Input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	
	
}
