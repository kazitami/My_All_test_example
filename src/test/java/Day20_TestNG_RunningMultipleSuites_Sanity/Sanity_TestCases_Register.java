package Day20_TestNG_RunningMultipleSuites_Sanity;

import org.testng.annotations.Test;

public class Sanity_TestCases_Register {
	@Test(priority=1)
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("test3");
	}
	
	@Test(priority=3)
	public void test3() {
		System.out.println("test3");
	}
}
