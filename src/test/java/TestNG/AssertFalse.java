package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {

	@Test 
	public void compareNumeric() 
	{ 
	  Assert.assertFalse(5 > 2); // Here, condition is true. So, test case will be marked as failed and the next statement will not be executed. 
	  System.out.println("5 is greater than 2");
	 } 
	@Test 
	public void compareString() 
	{ 
	   Assert.assertFalse("Selenium" == "Java", "Matched"); // Here, condition is false. So, test case will be passed by assertion. 
	 } 
}
