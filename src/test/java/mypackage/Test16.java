package mypackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test16 {
	
	@Test
	public void m1()
	{
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false); //here we are explicitly failing the method but execution flow won't stop due to soft assert
		System.out.println("I am from m1");
	}
	
	@Test
	public void m2() 
	{
		
		System.out.println("I am from m2");
	}

}
