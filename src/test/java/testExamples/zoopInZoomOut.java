package testExamples;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class zoopInZoomOut {
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
	public void zoom_In_zoom_Out() throws Exception {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
	driver = new ChromeDriver(options);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom = '300%' ;");
	Thread.sleep(2000);
	js.executeScript("document.body.style.zoom = '50%' ;");
	Thread.sleep(2000);
	js.executeScript("document.body.style.zoom = '100%' ;");
	
	
	
	}
}
