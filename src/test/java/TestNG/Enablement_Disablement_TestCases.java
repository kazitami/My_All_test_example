package TestNG;

import org.testng.annotations.Test;

public class Enablement_Disablement_TestCases {
	@Test
	public void logic1() {
		System.out.println("Tc1");
	}

	@Test(enabled = false)
	public void logic2() {
		System.out.println("Tc2");
	}


	@Test
	public void logic3() {
		System.out.println("Tc3");
	}

}
