package Day12_Assertion_In_TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class_Assignment_Assertions_Register_In_TutorialNinja_practice {
	public WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void registerOpeningWebsiteSetup() {
		
	}
	
	@Test(priority=1)
	public void registerWithNoInputs() {
		
	}
	
	@Test(priority=2)
	public void registerWithMandatoryDetails() {
		
	}
	
	@Test(priority=3)
	public void registerWithAllDetails() {
		
	}
	
	@Test(priority=4)
	public void registerWithExistingEmail() {
		
	}
	
	@Test(priority=5)
	public void registerWithWrongConfirmPassword() {
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
