package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Independent_class {

	@Test(priority=1)
	public void case1(){
		
	}
	@Test(priority=2, dependsOnMethods = "case1")
	public void case2(){
		
	}
	@Test(priority=3, enabled = false, dependsOnMethods = {"case1","case2"})
	public void case3(){
		//Assert.fail();
	}
	@Test(priority=4,invocationCount = 10, dependsOnMethods = {"case1","case2","case3"})
	public void case4(){
		
	}
	@Test(priority=5, dependsOnMethods = {"case1","case2","case3","case4"})
	public void case5(){
		
	}
	
	
	
	
}
