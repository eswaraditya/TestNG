package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	@Test(priority=0)
	public void softAssert()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Soft assertion started from here"); 
		sa.assertTrue(false);
		System.out.println("Soft assertion ended here"); 
		
	}

	@Test(priority=1)
	public void hardAssert()
	{
		System.out.println("Hard assertion started from here"); 
		Assert.assertTrue(false);
		System.out.println("Hard assertion ended here"); 
		
	}
}
