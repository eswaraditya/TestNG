package TestNG;

import org.testng.annotations.Test;

public class DisableTestMethod {
	
	@Test(enabled = true) 
	public void m1() 
	{ 
	   System.out.println("Hello"); 
	} 
	@Test(enabled = false) 
	public void m2()
	{ 
	   System.out.println("Hi"); 
	} 
	@Test 
	public void m3()
	{ 
	  System.out.println("Hello-Hi"); 
	  } 

}
