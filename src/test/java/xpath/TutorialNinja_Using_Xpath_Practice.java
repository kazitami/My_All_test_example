package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinja_Using_Xpath_Practice {

	public static void main(String[] args) {
		login_TutorialNinja_Using_xpath();
		//register_TutorialNinja_Using_xpath();
	}
	
	public static void login_TutorialNinja_Using_xpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("automation2@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	public static void register_TutorialNinja_Using_xpath() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("automation2@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.quit();
		
	}
}
