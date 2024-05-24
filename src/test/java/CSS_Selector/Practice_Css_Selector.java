package CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Css_Selector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("a.signin")).click();
		//driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		// travarse between siblings you have to use (+) symbol
		// travarse between grandparent>parent>child  you have to use (>) symbol
		// a parent can have multiple kids. in that case 
		// p>child:nth-type-of[]
		// p#signin_info>a:nth-child(3)
		// p#signin_info>a:nth-of-type(1)
		// p#signin_info>a+br+a ---------- to go to sibling to sibling use (+) symbol
		//input#OAS_subsection+div>div>div:nth-child(3)>p#signin_info>a:nth-child(3)
	
	}

}
