package Day18_Wait_Selenium_Extra_Topics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomIN_ZoomOUT_Practice {
	
	public WebDriver driver;
	
	@Test
	public void zoomInZoomOut() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '300%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '50%' ;");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom = '100%' ;");
		
		Thread.sleep(2000);
		//JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom = '60%';");
		
		Thread.sleep(2000);
		//JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='40%';" );
	}

}