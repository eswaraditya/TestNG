package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	
	@Test
	@Parameters({"x","y"})
	public void method(@Optional("abdul") String a,@Optional("kalam") String b) throws Exception{
		
		System.out.println(a+""+b);
		
	}
		
	
}


