package testExamples;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertPopUps {

	public WebDriver driver;
	public ChromeOptions options;
	@Test
	public void AlertPopUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert();
		
		Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		 //alert.dismiss();
		 //alert has 3 most important method.1. getText, 2. accept 3. dismoss
		
		
	}
	
}
