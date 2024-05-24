package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_example1 {

	public static void main(String[] args) {
		//xPath_Syntax_1
		//useOfXpathInCompoundedValueClass
		//xPathSyntax_4();
		xPathSyntax_5();
	}
	public static void xPath_Syntax_1() 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	driver.findElement(By.xpath("//a[@class='signin']")).click();
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input[@name='proceed']")).click();

	}
	public static void useOfXpathInCompoundedValueClass() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[@class=\"bmailicon relative\"]")).click();
		
	}
	public static void xPathSyntax_4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}
	public static void xPathSyntax_5() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(text(),'Shopping')]")).click();
	}
}
