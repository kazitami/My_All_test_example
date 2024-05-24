package Day12_Assertion_In_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Concepts {
		
		@Test
		public void checkingSoftAssert() {
			
			//one of the differences especially the way you want to use SoftAssert
			
			//Step1: You have to create the Object of SoftAssert Class
			
			SoftAssert softassert = new SoftAssert();
			SoftAssert softassert1 = new SoftAssert();
			
			int i  = 10;
			int j  = 20;
			System.out.println(i + j); //30
	        softassert1.assertTrue(1 == 1);
			System.out.println(2*(i+j)); //60
			softassert1.assertTrue(1 == 2);
			System.out.println(5 + 5);
			softassert1.assertTrue(true == false);
			System.out.println(50 + 50);
			softassert1.assertAll(); //this should be the last line of code for this Test Case
		}
	}
