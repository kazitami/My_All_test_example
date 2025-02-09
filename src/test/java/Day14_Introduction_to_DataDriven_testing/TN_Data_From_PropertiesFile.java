package Day14_Introduction_to_DataDriven_testing;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_Data_From_PropertiesFile {
	public Properties prop;
	public FileInputStream ip;

	@Test(priority=1)
	public void helpingHowToReadFromAPropertiesFile() throws Exception {
		// Step 1: Create the object of Properties Class
		prop = new Properties();
		// Step 2: Create the object of FileInputStream Class
		// Step 3: The constructor of FileInputStream cannot be empty. You need to fill
		// the path of the properties file
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Introduction_to_DataDriven_testing\\config.properties");
		prop.load(ip);
		login();
	}

	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
}