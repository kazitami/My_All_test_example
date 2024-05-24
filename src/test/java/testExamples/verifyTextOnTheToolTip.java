package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyTextOnTheToolTip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement element = driver.findElement(By.linkText("My Account"));
		String actualToolTipText = element.getAttribute("title");
		String expectedToolTipText = "My Account";
		Assert.assertEquals(actualToolTipText, expectedToolTipText);
		if(actualToolTipText.equals(expectedToolTipText)) {
			System.out.println("Valid tooltip");
		}else
		{
			System.out.println("Invalid tooltip");
		}
	}

}
