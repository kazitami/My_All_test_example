package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class submitFormInSelenium {
	
	@Test
	public void submitForm() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.id("srchquery_tbox")).sendKeys("cricket");
	driver.findElement(By.xpath("//form[@id='queryTop']/input[@class='newsrchbtn']")).submit();
	System.out.println("Page successfully submitted");
	//close driver
	driver.quit();
	
	}
}
