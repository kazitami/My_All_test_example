package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_ClassAssignment_part1 {
		//create a class
		//create a main methos inside the class - do not write logic inside main method 
		//create 3 methods 
		//registerAccount1
		//registerAccount2
		//registerAccount3
	public static void main(String[] args) {
		
		registerAccount1();// First Account registration
		TutorialsNinja_classAssignment_part2.loginAccount1();
		
		registerAccount2();
		TutorialsNinja_classAssignment_part2.loginAccount2();
		
		registerAccount3();
		TutorialsNinja_classAssignment_part2.loginAccount3();
	}
	
	
	public static void registerAccount1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname1");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname1");
		driver.findElement(By.id("input-email")).sendKeys("firstname1@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("234567898");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("input-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
		
		
	}
	public static void registerAccount2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname1");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname1");
		driver.findElement(By.id("input-email")).sendKeys("firstname2@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("234567898");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("input-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
		
	}
	public static void registerAccount3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname1");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname1");
		driver.findElement(By.id("input-email")).sendKeys("firstname3@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("234567898");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("input-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
}
