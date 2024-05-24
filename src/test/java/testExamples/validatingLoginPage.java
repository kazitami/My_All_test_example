package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatingLoginPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Validating the LandingPage
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		
		String actualCurrentUrl = driver.getCurrentUrl();
		String expectedCurrentUrl = "https://tutorialsninja.com/demo/";
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)){
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}
		else
		{
			System.out.println("Title and CurrentUrl are incorrect");
		}
		
		//Validatin the LoginPage
		String actualLoginPageTitle = driver.getTitle();
		String expectedLoginPageTitle = "Account Login";
		
		String actualLoginPageCurrentUrl = driver.getCurrentUrl();
		String expectedLoginPageCurrentUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		
		if(actualLoginPageTitle.equals(actualLoginPageTitle)&& actualLoginPageCurrentUrl.equals(expectedLoginPageCurrentUrl)) {
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		else
		{
			System.out.println("Title and CurrentUrl are incorrect");
		}
	}

}
