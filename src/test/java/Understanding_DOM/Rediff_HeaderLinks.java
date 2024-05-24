package Understanding_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_HeaderLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//click on Business Email
			driver.findElement(By.linkText("bmailicon relative")).click();
		
		// click on videos
			driver.findElement(By.linkText("vdicon")).click();
		
		//click on Shopping
			driver.findElement(By.linkText("shopicon relative")).click();
		
		//partiallinktext 
		driver.findElement(By.linkText("Create Acc"));
		
		//Investors
		driver.findElement(By.linkText("Investors")).click();
		driver.findElement(By.partialLinkText("Invest")).click();
		
		//Advertise with us
		driver.findElement(By.linkText("Advertise with us")).click();
		driver.findElement(By.partialLinkText("Advertise")).click();
		
		//Disclaimer
		
		driver.findElement(By.linkText("Disclaimer")).click();
		driver.findElement(By.partialLinkText("Discla")).click();
		
		//Privacy
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.partialLinkText("Priv")).click();
		
		//Rediff Labs
		driver.findElement(By.linkText("Rediff Labs")).click();
		driver.findElement(By.partialLinkText("Rediff")).click();
		
		//Sitemap
		driver.findElement(By.linkText("Sitemap")).click();
		driver.findElement(By.partialLinkText("Site")).click();
		
		//Feedback
		driver.findElement(By.linkText("Feedback")).click();
		driver.findElement(By.partialLinkText("Feedb")).click();
		
		//Contact Us
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.partialLinkText("Contact")).click();
		
		//About us
		driver.findElement(By.linkText("About us")).click();
		driver.findElement(By.partialLinkText("About")).click();
		
		//Terms of use
		driver.findElement(By.linkText("Terms of use")).click();
		driver.findElement(By.partialLinkText("Terms of")).click();
		
		//Grievances
		driver.findElement(By.linkText("Grievances")).click();
		driver.findElement(By.partialLinkText("Grieva")).click();
		

	}

}
