package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksByUsingLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
//		driver.findElement(By.linkText("Create Account")).click();
//		System.out.println("Create Account clicked by using linkText");
//		
//		driver.findElement(By.partialLinkText("Create Acc")).click();
//		System.out.println("Create Account clicked by using partialLinkText");
//		
//		driver.findElement(By.cssSelector("a.bmailicon.relative")).click();
//		driver.navigate().back();
		
//		driver.findElement(By.className("mailicon")).click();
//		driver.navigate().back();
//		System.out.println("Rediffmail clicked");
		
	}
}
