package JavatestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessBrowser {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static WebDriver driver1;
	public static FirefoxOptions options1;
	
	public static void main(String[] args) {
		
		//chromedriver
		  WebDriverManager.chromedriver().setup();
		  options = new ChromeOptions();
		  options.addArguments("headless"); 
		  driver = new ChromeDriver(options); 
		  driver.get("https://www.tutorialsninja.com/demo");
		  System.out.println(driver.getCurrentUrl()); 
		  System.out.println(driver.getTitle());
		  	
		
		//firefoxdriver
		WebDriverManager.firefoxdriver().setup();
		options1 = new FirefoxOptions();
		options1.addArguments("--headless");
		driver1 = new FirefoxDriver(options1);
	
		driver1.get("https://www.rediff.com");
		driver1.get("https://www.tutorialsninja.com/demo");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
