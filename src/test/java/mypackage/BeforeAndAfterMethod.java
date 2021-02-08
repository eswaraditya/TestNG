package mypackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
		
	
		@BeforeSuite
		public void beforeSuite() {
			
			System.out.println("I am from beforeSuite");
		}
	
		@AfterSuite
		public void afterSuite() {
			
			System.out.println("I am from afterSuite");
		}
		
		@BeforeTest
		public void beforeTest() {
			
			System.out.println("I am from beforeTest");
		}
		
		@AfterTest
		public void afterTest() {
			
			System.out.println("I am from afterTest");
		}
		
		@BeforeClass
		public void beforeClass() {
			
			System.out.println("I am from beforeClass");	
		}
		
		@AfterClass
		public void afterClass() {
			
			System.out.println("I am from afterClass");	
		}
		
		@BeforeMethod
		public void beforeMethod() {
			
			System.out.println("I am from beforeMethod");			
		}
		
		@AfterMethod
		public void afterMethod() {
			
			System.out.println("I am from afterMethod");			
		}
		
		@Test
		public void testMethod() {
			
			System.out.println("I am from testMethod");
		}
		
		

	}


