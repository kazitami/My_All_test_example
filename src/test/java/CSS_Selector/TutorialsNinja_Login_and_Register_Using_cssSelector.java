package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Login_and_Register_Using_cssSelector {

	public static void main(String[] args) {
		//register_TutorialsNinja_with_cssSelector();
		login_TutorialsNinja_with_cssSelector();
	}
	public static void login_TutorialsNinja_with_cssSelector() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://TutorialsNinja.com/demo");
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li+li>a")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("automation5@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("@automation");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
	
	}
	public static void register_TutorialsNinja_with_cssSelector() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://TutorialsNinja.com/demo");
		driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("java");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("automation5@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("23542345");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("@automation");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("@automation");
		driver.findElement(By.cssSelector("input[name=newsletter]")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
