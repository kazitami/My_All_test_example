package Day18_Mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Keyboard_Actions_Practice {
	
	public WebDriver driver;
	
	@Test
	public void loginTutorialsNinjaKeyBoard() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		Actions actions = new Actions(driver);
		
		//focusing cursor in email text box
		actions.click(emailTextBox).sendKeys("seleniumpanda@gmail.com").perform();
		
		//selecting all email
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//copying all email
		actions.keyDown(emailTextBox, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//moving to password text box by using Tab
		actions.keyDown(emailTextBox, Keys.TAB).perform();
		
		//pasting in password text box
		actions.keyDown(passwordTextBox, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		//clicking enter button 
		actions.keyDown(loginButton, Keys.ENTER).perform();
		
		
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		
	}

}