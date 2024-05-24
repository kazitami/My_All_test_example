package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_SignIn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		//click on Sign in link
		driver.findElement(By.className("signin")).click();
		
		//Enter username
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda1@rediffmail.com");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("Donkey@123");
		
		//Click signin button
		driver.findElement(By.className("signinbtn")).click();
		
		//Click logout button
		driver.findElement(By.className("rd_logout")).click();
		
	}
}
