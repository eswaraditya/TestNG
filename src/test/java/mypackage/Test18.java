package mypackage;

import org.testng.annotations.Test;

public class Test18 {
	
	@Test (groups = { "smokeTest", "functionalTest" })
	public void loginTest(){
		System.out.println("Logged in successfully");
	}
	
	@Test (groups = { "functionalTest" })
	public void composeMail(){
		System.out.println("Mail Sent");
	}

}
