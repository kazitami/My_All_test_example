package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWebsite {

	public static void main(String[] args) {
		createAccount();
	}
	public static void createAccount() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("span.v-p-right-xxs.line-clamp")).click();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("uni");
		driver.findElement(By.name("lastname")).sendKeys("corn");
		
		
		
	}
	

}
