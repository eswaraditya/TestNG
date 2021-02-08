package TestNG;

import org.testng.annotations.Test;

public class TestMethodsWithSamePriority {
	
	@Test(priority = 1) 
	public void firstTest() 
	{ 
	  System.out.println("First test method"); 
	} 
	@Test(priority = 1) 
	public void secondTest()
	{ 
	   System.out.println("Second test method"); 
	} 
	@Test(priority = 0) 
	public void thirdTest()
	{ 
	   System.out.println("Third test method"); 
	} 
	@Test(priority = -1) 
	public void fourthTest()
	{ 
	   System.out.println("Fourth test method"); 
	} 
	@Test(priority = -2) 
	public void fifthTest()
	{ 
	   System.out.println("Fifth test method"); 
	 } 

}
