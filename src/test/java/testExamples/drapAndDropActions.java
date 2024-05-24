package testExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class drapAndDropActions {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	}
	@Test
	public void dragAndDrop() {
		driver.switchTo().frame(0);
		
		WebElement sourceDrag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement destinationDrop = driver.findElement(By.cssSelector("div#droppable>p"));
		
		Actions dragNDrop = new Actions(driver);
		dragNDrop.dragAndDrop(sourceDrag, destinationDrop).perform();
		dragNDrop.dragAndDropBy(sourceDrag, 0, 50).perform();;
		
	}
}
