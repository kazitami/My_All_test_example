package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getHrefLink {
		@Test
		public void hrefLink() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			
			WebElement myAccountHrefLink = driver.findElement(By.linkText("My Account"));
			String myAccountHLink = myAccountHrefLink.getAttribute("href");
			System.out.println();
			System.out.println("href link--->  " + myAccountHLink);
			System.out.println();
			
			//closing driver
			driver.close();
	}
}