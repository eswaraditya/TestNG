package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {
	
	@Test 
	public void testcasefail() 
	{ 
	  Assert.fail("test purpose"); // Here, test case will be marked as failed and the next statement will not be executed. 
	  System.out.println("Test case failed"); 
	 } 

}
