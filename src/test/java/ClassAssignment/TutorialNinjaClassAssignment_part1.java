package ClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaClassAssignment_part1 {

	public static void main(String[] args) {
		RegisterAccount1();
		tutorialninjaClassAssignmentPart2.login1();
		
		RegisterAccount2();
		tutorialninjaClassAssignmentPart2.login2();
		
		RegisterAccount3();
		tutorialninjaClassAssignmentPart2.login3();
		
		
		
	}
	
	public static void RegisterAccount1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("tomtom");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("tomtomautomation1@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("tomtom@123");
		driver.findElement(By.id("input-confirm")).sendKeys("tomtom@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
	public static void RegisterAccount2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("tomtom");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("tomtomautomation2@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("tomtom@123");
		driver.findElement(By.id("input-confirm")).sendKeys("tomtom@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
	public static void RegisterAccount3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys("tomtom");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("tomtomautomation3@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("tomtom@123");
		driver.findElement(By.id("input-confirm")).sendKeys("tomtom@123");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
