package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

	
	// Create first WebDriver reference. 
	   WebDriver driver; 
	 @Parameters({"Browser"}) 
	 @BeforeTest 
	 public void setUp(String browser) 
	 { 
	   if(browser.equalsIgnoreCase("Firefox")) 
	   { 
		   WebDriverManager.chromedriver().setup();
	     driver = new FirefoxDriver(); 
	     System.out.println("Firefox opened"); 
	   } 
	 else { 
		 WebDriverManager.chromedriver().setup(); 
	     driver = new ChromeDriver(); 
	     System.out.println("Chrome opened"); 
	   } 
	 driver.manage().window().maximize(); 
	 } 
	@Parameters({"URL"}) 
	@Test(priority = 1) 
	public void getURL(String URL) 
	{ 
	   driver.get(URL); 
	 } 
	@Test(priority = 2) 
	public void getTitle() 
	{ 
	   String title = driver.getTitle(); 
	   System.out.println("Title of Webpage: " +title); 
	 } 
	@AfterTest 
	public void close() 
	{ 
	   driver.close(); 
	  } 
}
