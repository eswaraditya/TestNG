package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	
	@Test(priority=1)
	public void testCase1() 
	{
		Assert.assertNull("Eswar"); 
		System.out.println("Test case1 executed successfully"); 
	}
	
	@Test(priority=2)
	public void testCase2() 
	{
		Assert.assertNull(null); 
		System.out.println("Test case2 executed successfully"); 
	}

}
