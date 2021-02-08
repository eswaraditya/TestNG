package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
	
	@Test 
	public void verify1()
	{ 
	  String actualTitle = "Hello"; 
	// Call assertEqals() method to verify the comparison between actual title and expected title. 
	   Assert.assertEquals(actualTitle, "Hello"); 
	   System.out.println("Both are matched"); 
	  } 

	@Test 
	public void verify2()
	{ 
	  String actualTitle = "Hello"; 
	// Call assertEqals() method to verify the comparison between actual title and expected title. 
	   Assert.assertEquals(actualTitle, "Wow"); 
	   System.out.println("Both are not matched"); 
	  } 
}
