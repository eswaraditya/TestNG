package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test 
	public void m1() 
	{ 
	  System.out.println("Test method one"); 
	} 
	@Test(dependsOnMethods = "m1") 
	public void m2()
	{ 
	   System.out.println("Test method two"); 
	} 
	@Test 
	public void m3()
	{ 
	   Assert.fail(); 
	   System.out.println("Test method three"); 
	  } 
	@Test(dependsOnMethods = {"m3", "m1"}) 
	public void m4()
	{ 
	   System.out.println("Test method four"); 
	 } 

}
