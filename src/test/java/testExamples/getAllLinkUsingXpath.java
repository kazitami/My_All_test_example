package testExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class getAllLinkUsingXpath {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
		@Test(priority=1)
		public void getAllLink() {
		List<WebElement> HrefLink = driver.findElements(By.xpath("//a"));
		for(int i=0;i<HrefLink.size();i++) {
			System.out.println(i+"-> "+HrefLink.get(i).getText());
		}
		
		}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}