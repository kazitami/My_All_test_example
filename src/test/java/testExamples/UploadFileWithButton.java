package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileWithButton {
	
	@Test
	public void UploadFile() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
	
	//driver.findElement(By.xpath("//*[@id=\"button-upload222\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"input-option222\"]")).sendKeys("C:\\Tamanna_Automation\\Software Testing\\Automation\\Notes\\JAVA DAY 3.pdf");
	
	}
	
}
