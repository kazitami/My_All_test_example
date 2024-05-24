package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceXpath {
	public static WebDriver driver;
	public static void main(String[] args) {
		//tutorialNinjaRegister();
		tutorialNinjaLogin();
	}
	
	public static void tutorialNinjaRegister() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li/a")).click();
		
//		//firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tomtom");
//		
//		//lastname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium");
//		
//		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tomtomselenium10@gmail.com");
//		
		//telephone
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("2334567890");
//		
//		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("selenium@123");
//		
//		//confirmPassword
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("selenium@123");
//		
//		//privacy Policy
		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		
//		//continue button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//		
		driver.quit();
		
	}
	
	public static void tutorialNinjaLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")).click();
		
		
		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tomtomselenium10@gmail.com");
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("selenium@123");
		
		//login
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}

}
