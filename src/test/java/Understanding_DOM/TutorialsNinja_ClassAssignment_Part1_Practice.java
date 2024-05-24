package Understanding_DOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_ClassAssignment_Part1_Practice{
	public static void main(String[] args){
		
		registerAccount1();// Account registration method1
		registerAccount2();// Account registration method2
		registerAccount3();// Account registration method3
		
}
	public static void registerAccount1(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname4");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname4");
		driver.findElement(By.id("input-email")).sendKeys("firstname4			@gmail.com");

		driver.findElement(By.id("input-telephone")).sendKeys("234523455");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("input-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
}
	public static void registerAccount2(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname5");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname5");
		driver.findElement(By.id("input-email")).sendKeys("firstname5			@gmail.com");

		driver.findElement(By.id("input-telephone")).sendKeys("234523556");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("input-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
}
	public static void registerAccount3(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("firstname6");
		driver.findElement(By.id("input-lastname")).sendKeys("lastname6");
		driver.findElement(By.id("input-email")).sendKeys("firstname6@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("323455654");
		driver.findElement(By.id("input-password")).sendKeys("@first123");
		driver.findElement(By.id("imput-confirm")).sendKeys("@first123");
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();


}
	
}