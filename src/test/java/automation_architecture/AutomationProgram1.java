package automation_architecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutomationProgram1 {

	public static void main(String[] args) {

		// we are using webDriver to code in selenium Automation
		// WebDriver is very important
		// Java is a case sensitive language
		WebDriver driver = new ChromeDriver();
		// ctrl + shift +o - together
		//command + shift +o - together 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bestbuy.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://bestbuy.com");
		driver1.quit();
		
		//WebDriver driver3 = new SafariDriver();
		//driver1.manage().window().maximize();
		//driver1.get("https://costco.com");
		//driver1.quit();
		
		
	}

}
