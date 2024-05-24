package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_of_TestNG_practice {
	@BeforeMethod
	public void setup() {
		System.out.println("This is just a before method logic");
	}
	
	@Test
	public void testCase1() {
		System.out.println("This is TC1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("This is TC2");
	}
	@Test
	public void testCase3() {
		System.out.println("This is TC3");
	}
	
	@AfterMethod
	public void afterMethodMethod() {
		System.out.println("This is After Method");
	}
}
