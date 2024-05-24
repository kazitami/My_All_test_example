package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_xPath {

	public static void main(String[] args) {
		//registerAccount();
		loginAccount();
		
	}
	
	public static void Menu_link_test() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo");
//		driver.findElement(By.xpath("//a[@title='My Account' and @class='dropdown-toggle']")).click();//this xpath is working
		//driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::a")).click();//this xpath is working
		//driver.findElement(By.xpath("//i[@class='fa fa-heart']/parent::a")).click(); //Wish List--this xpath is working
		//driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']/parent::a")).click();//Shopping Cart Link path is working
		//driver.findElement(By.xpath("//div[@class='pull-right']/child::a[text()='Continue']")).click();  //continue button path is working
//		driver.findElement(By.xpath("//i[@class='fa fa-share']/parent::a")).click();  // check out link is working
//		driver.findElement(By.xpath("//div[@class='pull-right']/child::a")).click(); // continue link is working
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Register']")).click();
	
		//html[@attribute = 'value']
		
				//html[@attribute1 = 'value' and @attribute2 = 'value']

				//html[@attribute1 = 'value' or @attribute2 = 'value']

				//html[text() = 'valueofthetext']

				//html[contains(text(), 'valueofthetext')]

				//html[contains(@attribute, 'valueoftheattribute')]

				//html[starts-with(@attribute, 'startingvaluewhichisfixed')]

				//html[ends-with(@attribute, 'endingvaluewhichisfixed')]
			
				
				//1. parent
				//2. child
				//3. ancestor
				//4. descendant
				//5. following-sibling
				//6. preceding-sibling
				//7. following
				//8. preceding
				//9. self
			
			// parent, child, ancestor,descendant,following,preceding,following-sibling,
			//preceding-sibling,self 
	
	}
	
	public static void loginAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@title='My Account' and @class='dropdown-toggle']")).click();//this xpath is working
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("wonderful@gmail.com");
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Login']")).click();
	//	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("wonderful@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("wonderful@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	public static void registerAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@title='My Account' and @class='dropdown-toggle']")).click();//this xpath is working
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/descendant::a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("tom5");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("wonderful");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("wonderful@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("456435654");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("wonderful@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("wonderful@123");
		driver.findElement(By.xpath("//input[@name ='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class ='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	
	}

}
