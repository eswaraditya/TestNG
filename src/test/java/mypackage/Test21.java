package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test21 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		//String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
		//int innerText = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
		//System.out.println(innerText);
		List<WebElement> allHeadersOfTable = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Total headers found: "+allHeadersOfTable.size());
		for(WebElement header:allHeadersOfTable)
		{
			System.out.println(header.getText());
		}
		//http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/
		/*List<WebElement> allHeadersOfTable= driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		System.out.println("Total headers found: "+allHeadersOfTable.size());
		for(WebElement header:allHeadersOfTable)
		{
			System.out.println(header.getText());
		}*/
		
		/*
		// Retrive cell value by providing row and column number
		WebElement colValue= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[3]"));
		System.out.println(colValue.getText());
		System.out.println("========================================================================");
		 */

	}

}
