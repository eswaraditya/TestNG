package TestNG;

import org.testng.annotations.Test;

public class TestsWithoutPriority {
	
	@Test 
	public void one() 
	{ 
	   System.out.println("First"); 
	} 
	@Test 
	public void two()
	{ 
	   System.out.println("Second"); 
	} 
	@Test 
	public void three()
	{ 
	  System.out.println("Third"); 
	 } 

}
