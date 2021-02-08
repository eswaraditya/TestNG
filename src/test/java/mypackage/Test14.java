package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {
	
	@Test
	public void m1() throws Exception
	{
		System.out.println("I am from m1");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("jkdfvjhg");
		driver.findElement(By.name("lastname")).sendKeys("jkdfvjhg");
		driver.findElement(By.name("reg_email__")).sendKeys("jkvfkjdzfv");
		driver.findElement(By.name("reg_passwd__")).sendKeys("zkjnvfjkdbf");
		
	}
	
	@Test
	public void m2() throws Exception
	{
		System.out.println("I am from m2");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
	}

}
