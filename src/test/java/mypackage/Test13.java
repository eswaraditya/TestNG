package mypackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test13 {
	
	@Test
	public void m1()
	{
		
		Assert.assertTrue(false); //here we are explicitly failing the method
		System.out.println("I am from m1");
	}
	
	@Test(dependsOnMethods = "m1", alwaysRun=true)
	public void m2() 
	{
		
		System.out.println("I am from m2");
	}

}
