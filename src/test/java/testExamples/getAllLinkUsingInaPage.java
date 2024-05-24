package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getAllLinkUsingInaPage {

	@Test
	public void getAllLinks() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		WebElement getSearchTextBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		getSearchTextBox.sendKeys("HP");
		String getSearchTextBoxValue = getSearchTextBox.getAttribute("value");
		System.out.println(getSearchTextBoxValue);
		
		
		//close driver
		driver.quit();
	}
}