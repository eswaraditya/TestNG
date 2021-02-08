package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {

	@Test 
	public void testcase1() 
	{ 
	 Assert.assertNotNull("Eswar"); 
	 System.out.println("Test case1 executed successfully"); 
	 }
	
	@Test 
	public void testcase2() 
	{ 
	 Assert.assertNotNull(null); 
	 System.out.println("Test case2 executed successfully"); 
	 }
}
