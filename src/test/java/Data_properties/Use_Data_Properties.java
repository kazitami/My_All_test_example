package Data_properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Use_Data_Properties {

		public WebDriver driver;
		public 	Properties prop;
		public FileInputStream ip;
		@Test
		public void readRegisterDataFromPropertiesFile() throws Exception {
			prop =new Properties();
			ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Data_properties\\data.properties");
			prop.load(ip);		
		}
		@Test(priority=1)
		public void checkPath() {
			registerCode();
		}
		
		public WebDriver initalizeBrowserAndOpenApplication(String browserName) {
			
			if(browserName.equals("Chrome")) {
				driver = new ChromeDriver();
			}else if(browserName.equals("Firefox")) {
				driver = new FirefoxDriver();
			}else if(browserName.equals("Edge")) {
				driver = new EdgeDriver();
			}else {
				System.out.println("None of the browser matches");
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
			return driver;
			
		}
		
		public void registerCode() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("validEmail"));
			driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("validPassword"));
			driver.findElement(By.cssSelector("a.agree+input")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
			
		}
}
