package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Assignment {

	//Find out the syntax for cssSelectors

	//1. starting value
	//   tagname[attribute^='prefix of the string']
	//div[class^="test"]
	
	//2. contains aspect
	//a[data-tracking='abc']
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a")).click();
	driver.findElement(By.cssSelector("div#top-links>ul>li:nth-child(2)>a+ul>li:nth-child(1)>a")).click();

//Using cssSelector starts With tagname[attribute^='prefix of the starting']
	driver.findElement(By.cssSelector("input[id^='input-first']")).sendKeys("Selenium");
//-----------------	
	//driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
	//	driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
//-----------------	
//Using cssSelector starts With tagname[attribute$='suffix of the string']
	driver.findElement(By.cssSelector("input[id$='email']")).sendKeys("seleniumpanda111@gmail.com");

//-----------------
//Using cssSelector starts With tagname[attribute*='substring']	
	driver.findElement(By.cssSelector("input[id*='-telephone'")).sendKeys("9876543210");

	
//	driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
//	driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
//	driver.findElement(By.cssSelector("fieldset#account+fieldset+fieldset>div.form-group>div>label:nth-child(1)>input")).click();
//	driver.findElement(By.cssSelector("a.agree+input")).click();
//	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//	
	}
}