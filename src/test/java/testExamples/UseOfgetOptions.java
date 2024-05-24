package testExamples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UseOfgetOptions {

	@Test
	public void getOptionsUse() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=18");
		
		WebElement dropdownElement = driver.findElement(By.id("input-sort"));
		
		Select dropdown = new Select(dropdownElement);
		
		List<WebElement> options = dropdown.getOptions();
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
