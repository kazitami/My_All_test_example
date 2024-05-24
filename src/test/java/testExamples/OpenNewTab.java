package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenNewTab {
	public WebDriver driver;
	@Test
	public void OpenNewTab() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//open another website in the same browser in another tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://flipkart.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
	}

}
