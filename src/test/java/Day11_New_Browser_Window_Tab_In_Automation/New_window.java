package Day11_New_Browser_Window_Tab_In_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_window {
			
			
			public WebDriver driver;
			
			@Test
			public void openNewTab() throws Exception {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
				driver.get("https://google.com");
				
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://amazon.com");
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://flipkart.com");
				
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.get("https://costco.com");
			
				
			}
			

}
