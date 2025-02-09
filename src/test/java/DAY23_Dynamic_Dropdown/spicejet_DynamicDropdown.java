package DAY23_Dynamic_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class spicejet_DynamicDropdown {
	
	public WebDriver driver;

	@Test
	public void spiceJet() throws Exception {
		
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	
	String preSelection = driver.findElement(By.id("spnDrpNo")) .getText();
	System.out.println("Travelers before selection is : " + preSelection );

	driver.findElement(By.id("ptravlrNo")).click();
	Thread.sleep(1000);

	int Adults = 1;
	while(Adults < 5) {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id = 'add' and @class = 'add plus_box1']")). click();
	Adults++;

	int Children = 0;
	while(Children <= 2) {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id= 'add' and @class = 'add plus_boxChd']")) . click();
	Children++;

	int Infants = 0;
	while(Infants <= 5) {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id= 'add' and @class = 'add plus_box1Inf']")). click();
	Infants++;

	Thread.sleep(1000);

	driver.findElement(By.id("traveLer")).click();

	Thread.sleep(1000);

	String postSelection = driver.findElement(By.id("spnDrpNo")).getText();
	System.out.println("Travelers after selection is : " + postSelection );

	}
}
}}}