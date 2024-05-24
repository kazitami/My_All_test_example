package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementValidation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signinlink = driver.findElement(By.className("signin"));
		if(signinlink.isDisplayed() && signinlink.isEnabled()) {
			signinlink.click();
		}else
		{
			System.out.println("Sign In link is not enabled or displayed");
		}

	}

}
