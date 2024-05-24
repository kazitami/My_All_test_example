package testExamples;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_Data_From_PropertiesFile {
	public WebDriver driver;
	public Properties prop;
//	public FileInputStream ip;
	@Test
	public void readDataFromPropertiesFile() throws Exception {
		 prop = new Properties();
		
		 FileInputStream ip; ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\testExamples\\config.properties");
		 prop.load(ip);
		 login();
	}
	
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
