package Day13_OOPs_part_2_Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Explain_Calling_Via_Object_Reference {

	
	@Test 
	public void check() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
}
