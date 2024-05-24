package testExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectDropdown {
	@Test
	public void selectOptions() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=18");

	    Select selectOptions = new Select(driver.findElement
	    		(By.xpath("//select[@id='input-sort']")));
	    selectOptions.selectByVisibleText("Name (A - Z)");
	        

	}
}
