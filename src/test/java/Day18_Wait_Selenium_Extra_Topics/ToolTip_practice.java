 package Day18_Wait_Selenium_Extra_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTip_practice {
	
	public WebDriver driver;
	
	@Test
	public void determineToolTip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		
		//we need to determine the tooltip of signinLink
		String tooltipText = signinLink.getAttribute("title");
		System.out.println(tooltipText);
		
		WebElement money = driver.findElement(By.cssSelector("a.moneyicon.relative"));
		String tooltipText1 = money.getAttribute("title");
		System.out.println(tooltipText1);
		
		WebElement businessMail = driver.findElement(By.cssSelector("a.bmailicon.relative"));
		String toolTipTextBusinessMail = businessMail.getAttribute("title");
		System.out.println("Business mail" + toolTipTextBusinessMail);
	}

}