package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		createAccount();
		loginWithTheCreateAccount();
	}
	public static void createAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Tom2");
		driver.findElement(By.id("input-lastname")).sendKeys("New Jersey");
		driver.findElement(By.id("input-email")).sendKeys("tomnewjersey4@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("345678901");
		driver.findElement(By.id("input-password")).sendKeys("@tom123");
		driver.findElement(By.id("input-confirm")).sendKeys("@tom123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		

		
		
	}
	
	public static void loginWithTheCreateAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("tomnewjersey4@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("@tom123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

}
