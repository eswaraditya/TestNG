package TestNG;

import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test 
	public void m1() 
	{ 
	  System.out.println("m1 method"); 
	} 
	@Test(alwaysRun = true) 
	public void m2()
	{ 
	   System.out.println("m2 method"); 
	} 
	@Test(alwaysRun = false) 
	public void m3()
	{ 
	   System.out.println("m3 method"); 
	  } 

}
