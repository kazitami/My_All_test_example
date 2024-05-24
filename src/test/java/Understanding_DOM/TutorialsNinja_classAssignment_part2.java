package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_classAssignment_part2 {
	
	//Once you have created the 3 methods above, in the same package create another class
	//In this class do not create the main method
	//create 3 methods with login logic 
	// call these methods inside the class which has the main method using the concept of 
	// classname.methodname();
	
	public static void loginAccount1() {
		WebDriver driver = new ChromeDriver();// opening a driver instance
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("https://tutorialsninja.com/demo/");// Opening a browser 
		driver.findElement(By.linkText("My Account")).click(); // My Account
		driver.findElement(By.linkText("Login")).click(); // clicking on login 
		driver.findElement(By.id("input-email")).sendKeys("firstname1@gmail.com"); // entering email address
		driver.findElement(By.id("input-password")).sendKeys("@first123");// entering password
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();// clicking login button
		driver.quit();
}
	
	public static void loginAccount2() {
		WebDriver driver = new ChromeDriver();// opening a driver instance
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("https://tutorialsninja.com/demo/");// Opening a browser 
		driver.findElement(By.linkText("My Account")).click(); // My Account
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("firstname2@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
	public static void loginAccount3() {
		WebDriver driver = new ChromeDriver();// opening a driver instance
		driver.manage().window().maximize(); // maximizing the browser
		driver.get("https://tutorialsninja.com/demo/");// Opening a browser 
		driver.findElement(By.linkText("My Account")).click(); // My Account
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("firstname3@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
	
}
