package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class doubleClickAction {
		public WebDriver driver;
		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://tutorialsninja.com/demo");
		}
		@Test(priority=1)
		public void doubleClickAction() {
			WebElement doubleClickOnElement = driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"));
			Actions actions = new Actions(driver);
			actions.doubleClick(doubleClickOnElement).perform();
			System.out.println();
			System.out.println("My Account got doubleClicked");
			System.out.println();
			driver.quit();
		}
}
	
	
	
	
