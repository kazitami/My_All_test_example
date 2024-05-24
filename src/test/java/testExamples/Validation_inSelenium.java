package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_inSelenium {
	
	//Validation with Selenium only
		//getTitle
		//getCurrentUrl
		//getPageSource
		

		//isDisplayed
		//isSelected
		//isEnabled
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String expectedTitle ="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentURL="https://www.rediff.com/";
		
		String actualTitle = driver.getTitle();
		String actualCurrentURL=driver.getCurrentUrl();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentURL.equals(expectedCurrentURL))
		{
			driver.findElement(By.className("signin")).click();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		
		WebElement usernameTextbox = driver.findElement(By.id("login1"));
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		WebElement keepMeSignInCheckbox = driver.findElement(By.id("remember"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));
		
		if(usernameTextbox.isDisplayed() && usernameTextbox.isEnabled() && passwordTextbox.isDisplayed() && passwordTextbox.isEnabled() && keepMeSignInCheckbox.isSelected() && signInButton.isDisplayed() && signInButton.isEnabled()) {
			usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
			passwordTextbox.sendKeys("Selenium@123");
			signInButton.click();
		}
		else
		{
			driver.quit();
		}
		
		
	}

}
