package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	
	@Test 
	public void compareNumeric() 
	{ 
	  Assert.assertTrue(5 > 2); 
	  System.out.println("5 is greater than 2"); 
	 } 
	@Test 
	public void compareString() 
	{ 
	   Assert.assertTrue("Java".equals("Java"), "Not matched"); // true 
	   Assert.assertTrue("Selenium".equals("Java"), "Not matched"); // false 
	 } 

}
