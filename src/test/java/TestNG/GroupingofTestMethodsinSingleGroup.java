package TestNG;

import org.testng.annotations.Test;

public class GroupingofTestMethodsinSingleGroup {

	@Test(groups = {"Car"}) 
	public void mahindra() 
	{ 
	  System.out.println("CAR 1: Mahindra"); 
	 } 
	@Test 
	public void sedan() 
	{ 
	  System.out.println("Sedan CAR"); 
	} 
	@Test(groups = {"Car"}) 
	public void Bajaj() 
	{ 
	  System.out.println("CAR 2: Bajaj Alto"); 
	 } 
	@Test(groups= {"Car"})
	public void maruthi() 
	{ 
	  System.out.println("CAR 3: Swift"); 
	 } 
}
