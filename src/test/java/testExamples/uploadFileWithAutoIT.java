package testExamples;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class uploadFileWithAutoIT {
@Test
public void Upload() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=42");
	//driver.findElement(By.id("button-upload222")).sendKeys("C:\\Tamanna_Automation\\Software Testing\\Automation\\Notes\\JAVA DAY 2.pdf");
	
	//driver.findElement(By.xpath("//*[@id=\"input-option222\"]")).sendKeys("C:\\Tamanna_Automation\\Software Testing\\Automation\\Notes\\JAVA DAY 2.pdf");
	
	//select radio button
	driver.findElement(By.xpath("//*[@id=\"input-option218\"]/div/label/input")).click();
	
	//select checkbox 
	driver.findElement(By.xpath("//*[@id=\"input-option223\"]/div[2]/label/input")).click();
	
	//select color from dropdown
	WebElement color = driver.findElement(By.xpath("//*[@id=\"input-option217\"]"));
	Select selectcolor = new Select(color);
	
	selectcolor.selectByValue("4");
	
	
	//Textarea
	driver.findElement(By.xpath("//*[@id='input-option209']")).sendKeys("This monitor is excellent!"
			+ "\nThis monitor is excellent!\n"
			+ "This monitor is excellent!\n"
			+ "This monitor is excellent!\n"
			+ "This monitor is excellent!\n");
	
	
	//upload file
	//driver.findElement(By.id("button-upload222")).click();
	File file = new File("C:\\Tamanna_Automation\\Software Testing\\Automation\\Notes\\JAVA DAY 2.pdf");
	
	
	//driver.findElement(By.xpath("//*[@id=\"button-upload222\"]")).sendKeys(file);
	
	
	//driver.findElement(By.xpath("//*[@id=\"input-option222\"]")).sendKeys
	//("C:\\Tamanna_Automation\\Software Testing\\Automation\\Notes\\JAVA DAY 2.pdf");
	
	//Runtime.getRuntime().exec("C:\\Users\\kazit\\Desktop\\UploadFile\\TestFile.exe");
	
	//add To cart button
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
}
}
