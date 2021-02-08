package mypackage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIt {
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/create_account.html");				
		JavascriptExecutor jse = (JavascriptExecutor) driver;		
		jse.executeScript("scroll(0,500)");
		driver.findElement(By.xpath("//*[text()='Choose file']")).click();
		Thread.sleep(3000);		
		Runtime.getRuntime().exec("C://Users//Eswara Aditya//Desktop//fileupload.exe");
		Thread.sleep(5000);
	     
		

	}

}
