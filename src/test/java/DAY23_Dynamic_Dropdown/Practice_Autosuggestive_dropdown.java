package DAY23_Dynamic_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice_Autosuggestive_dropdown {
	public WebDriver driver;
	@Test
	public void autosuggestive() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New");
		
		int i=0;
		while(i<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
			i++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		//---------------------------------------------------------------------------------
		
		Thread.sleep(1000);
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Las");
		
		int j=0;
		while(j<5) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
			j++;
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		
		
		
	}
	
}
