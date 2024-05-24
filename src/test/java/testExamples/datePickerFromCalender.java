package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class datePickerFromCalender {

	@Test
	public void datePicker() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
		
		WebElement datePick = driver.findElement(By.xpath("//*[@id=\"product\"]/div[7]/div/span/button"));
		
		WebElement dateTextBox = driver.findElement(By.xpath("//*[@id=\"input-option219\"]"));
		Select select = new Select(datePick);
		//String datePic = select.selectByVisibleText("2024-06-20");
		dateTextBox.sendKeys("2024-06-20");
		
		
	}
	
}
