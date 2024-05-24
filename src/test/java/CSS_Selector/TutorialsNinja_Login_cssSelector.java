package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Login_cssSelector {
	
	public static void main(String[] args) {
		registerUsingCSS_Selector();
		login_using_cssSelector();	
		}
	public static void login_using_cssSelector() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li+li>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("sel12024@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	public static void registerUsingCSS_Selector() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		driver.findElement(By.cssSelector(".dropdown-menu.dropdown-menu-right>li>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("sel12024@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("a.agree+input")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}
}


