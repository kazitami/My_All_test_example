package Day18_Wait_Selenium_Extra_Topics;

import java.util.Arrays;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alerts_PopUps_Practice {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void handlingAlertOrPopUps() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		//Alert will come
		
		Alert alert = driver.switchTo().alert();
		//Alert alert1 = driver.switchTo().alert();
		//System.out.println("The text inside the Alert1 window" + alert1.getText());
		//Alert is an interface
		//what is the text inside the Alert
		System.out.println("The text inside the Alert window : " + alert.getText());
		//Either you accept the alert or dismiss the alert
		
		//alert1.accept();
		alert.accept();
		//alert.dismiss();// for cancel
		
	}

}