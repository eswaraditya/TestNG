package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

public static void main(String[] args) throws Exception{
		
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//creating the alert
		driver.executeScript("window.alert('site is ready to launch');");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.get("https://www.amazon.in/");			
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");	//to set the page has complete scrolldown
		Thread.sleep(5000);
		driver.executeScript("window.scrollTo(0,-(document.body.scrollHeight));");	
		
		//driver.close();
		
		

	}

}
