package DAY23_Dynamic_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Looping_Dropdown {
	public WebDriver driver;

	@Test
	public void spiceJet() {
		//homework
	}

	@Test
	public void loopingDropDownEaseMyTrip() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		//preSelection = 1
		//postSelection = n travellers
		
		String PreSelectionNumber = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Travellers before selection is " + PreSelectionNumber);
		
		driver.findElement(By.id("ptravlrNo")).click();
		Thread.sleep(2000);
		
		int Adults = 1;
		while(Adults<5) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='add' and @class='add plus_box1']")).click();
			Adults++;
		}
		
		int children=0;
		while(children<2) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='add' and @class='add plus_boxChd']")).click();
			children++;
		}
		
		int infant=0;
		while(infant<2 ) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='add' and @class='add plus_box1Inf']")).click();
			infant++;
		}
		
		//String totalTraveller = 
		Thread.sleep(2000);
		driver.findElement(By.id("traveLer")).click();
		Thread.sleep(2000);
		
		String postSelectionNumber = driver.findElement(By.id("spnDrpNo")).getText();
		System.out.println("Travellers after selection is : " + postSelectionNumber);
		Assert.assertTrue(postSelectionNumber.equals(PreSelectionNumber));
		
	}

}

