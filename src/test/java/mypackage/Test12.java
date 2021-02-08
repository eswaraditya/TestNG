package mypackage;

import org.testng.annotations.Test;

public class Test12 {
	
	@Test(priority=0)
	public void E()
	{
		System.out.println("I am from e method");
	}
	
	@Test(enabled=false)
	public void s()
	{
		System.out.println("I am from s method");
	}
	
	@Test(description="Hi, I am d method")
	public void D()
	{
		System.out.println("I am from d method");
	}
	
	@Test(priority=-1)
	public void b()
	{
		System.out.println("I am from b method");
	}
	
	@Test(invocationCount=2)
	public void c()
	{
		System.out.println("I am from c method");
	}

}
