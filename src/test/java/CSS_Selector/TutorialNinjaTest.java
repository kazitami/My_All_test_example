package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialNinjaTest {

	public static void main(String[] args) {
	//Question 7:  Write a program for the below mentioned steps: -
    // Step1: Open https://tutorialsninja.com/demo
    
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
		
	// Step2: in the Search box enter HP and click on the Search icon
    
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("HP");
			
	// Step3 : Write 3 different Xpaths for the HP laptop that will display
	
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
		driver.findElement(By.xpath("//div[@class=\"input-group\"]/input")).sendKeys("HP");
		driver.findElement(By.xpath("//div[@id=\"search\"]/input")).sendKeys("HP");
		
		
		
	
	
	
	
	}

}
