package TestNG;

import org.testng.annotations.Test;

public class InclusionAndExclusionGroups {
	
	@Test(groups = {"Cricket Player"}) 
	public void player1() 
	{ 
	   System.out.println("Sachin Tendulkar"); 
	} 
	@Test(groups = {"Cricket Player"}) 
	public void player2()
	{ 
	   System.out.println("Virat Kohli"); 
	} 
	@Test(groups = {"Cricket Player"}) 
	public void player3()
	{ 
	   System.out.println("Anil Kumble"); 
	} 
	@Test(groups = {"Cricket Player", "exclude-group"}) 
	public void player4()
	{ 
	   System.out.println("Rohit Sharma"); 
	 } 

}
