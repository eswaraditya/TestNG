package mypackage;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingsendKeys {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript(window.scrollBy(0,300));
		//jse.executeScript("scroll(0,500)");
		Thread.sleep(5000);
		driver.findElement(By.id("uploadfile_0")).sendKeys("C://Users//Eswara Aditya//Desktop//CV_Eswar Aditya.doc");
		//Runtime.getRuntime().exec("C://Users//Eswara Aditya//Desktop//fileupload.exe"+" "+"C://Users//Eswara Aditya//Desktop//CV_Eswar Aditya.doc");
		Thread.sleep(5000);
	     
		

	}
}
