package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Login_Css_Selector {

	public static void main(String[] args) {
		//seleniumpanda@gmail.com - Selenium@123
		//seleniumpanda40@gmail.com - Selenium@123

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(2)>a")).click();
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
