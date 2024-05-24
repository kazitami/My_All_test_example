package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo_TestNG {
	//if @BeforeMethod, @Test and @AfterMethod are being executed then the output will show
		//@BeforeMethod....@Test...@AfterMethod        @BeforeMethod....@Test...@AfterMethod    @BeforeMethod....@Test....@AfterMethod

		@BeforeMethod
		public void setup() {
			System.out.println("This is just a before method logic");
		}

		@Test(priority=1)
		public void testCase1() {
			System.out.println("This is TC1");
		}

		@Test(priority=2)
		public void testCase2() {
			System.out.println("This is TC2");
		}

		@Test(priority=3)
		public void testCase3() {
			System.out.println("This is TC3");
		}

		@AfterMethod
		public void closing() {
			System.out.println("This has the after method logic");
		}
}
