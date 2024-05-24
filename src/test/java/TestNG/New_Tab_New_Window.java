package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New_Tab_New_Window {
	public WebDriver driver;
	
	@BeforeMethod
	public void openNewTab() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://costco.com");
		driver.get("https://flipkart.com");
		driver.navigate().to("https://rediff.com");
		driver.get("https://flipkart.com");
		driver.navigate().to("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();

	}
	@Test
	public void logic1() {
		
	}
}
