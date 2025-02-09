package testExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Dropdown {
	public WebDriver driver;
	public Select select;
	@Test
	public void facebookDateofBirthDropdown() throws Exception {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("firstname")).sendKeys("Selenium");
	driver.findElement(By.name("lastname")).sendKeys("Panda");
	driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Selenium@123");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Selenium@123");
	                                              

	
	// June 10 2020
	
	select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Jun");
	
	select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("10");
	
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("2019");
	
	
	}
	
}
