package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_step_by_step {
	public static void main(String[] args) {
	
		//Step 1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		//Step 2 - Click on MyAccount
		//to make this work we have to learn locators in Selenium
		//there were 8 locators and even today in Selenium these 8 locators are still the most important locators
		
		//1.id
		//2.classname
		//3.name
		//4.linktext - the html tag is generally a (anchor)
		//5.partiallinktext
		//6.tagname
		//7.xpath
		//8.cssSelector
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();	
		}
}
