package TestNG;

import org.testng.annotations.Test;

public class PrioritizedAndNonPrioritizedMethods {
	
	@Test 
	public void c_m1() 
	{ 
	  System.out.println("c_m1"); 
	} 
	@Test 
	public void b_m1()
	{ 
	   System.out.println("b_m1"); 
	} 
	@Test(priority = 1) 
	public void a_m1()
	{ 
	   System.out.println("a_m1"); 
	} 
	@Test(priority = 1) 
	public void d_m1()
	{ 
	  System.out.println("d_m1"); 
	} 
	@Test(priority = 0) 
	public void e_m1()
	{ 
	   System.out.println("e_m1"); 
	} 
	@Test(priority = 2) 
	public void f_m1()
	{ 
	   System.out.println("f_m1"); 
	  } 

}
