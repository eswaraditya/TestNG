package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups = "GroupA") 
	public void m1() 
	{
	  Assert.fail(); 
	  System.out.println("m1-GroupA"); 
	 } 
	@Test(groups = "GroupA") 
	public void m2()
	{ 
	   System.out.println("m2-GroupA"); 
	} 
	@Test(groups = "GroupB") 
	public void m3()
	{ 
	   System.out.println("m3-GroupB"); 
	} 
	@Test(dependsOnGroups = "GroupA") // This test method depends on GroupA. 
	public void m4()
	{ 
	   System.out.println("m4 is dependent on GroupA"); 
	  } 
}
