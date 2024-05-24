package Day15_Applying_OOPs_in_Automation;

public class Approach {
	
//	import org.testng.IRetryAnalyzer;
//	import org.testng.ITestResult;
//
//	public class MyRetry implements IRetryAnalyzer {
//
//	  private int retryCount = 0;
//	  private static final int maxRetryCount = 3;
//
//	  @Override
//	  public boolean retry(ITestResult result) {
//	    if (retryCount < maxRetryCount) {
//	      retryCount++;
//	      return true;
//	    }
//	    return false;
	  }
	
	//We identify our Test Scenarios - Login, Register, SearchProduct
	//Each Scenario pertains to one Functionality what we are testing
	//We write Test Cases in different Classes - positive and negative
	//Run all the Test Cases together with testng.xml file
	//Generally there is a lot of code which is quite common in all the Test Cases
	//We move the common code which is used again and again to one particular Class
	//This Class acts as the Parent Class
	//Other Classes act as the Child Classes

