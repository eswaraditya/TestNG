package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {
	
	@Test
	public void Message() throws Exception{
		
		System.out.println("My Test class is running");
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
		
		WebElement e1= driver.findElement(By.id("day"));
		Select s1= new Select(e1);
		s1.selectByVisibleText("9");
		
		WebElement e2= driver.findElement(By.id("month"));
		Select s2= new Select(e2);
		s2.selectByIndex(5);
		
		WebElement e3= driver.findElement(By.id("year"));
		Select s3= new Select(e3);
		s3.selectByVisibleText("1906");
		
		WebElement e4 =driver.findElement(By.xpath("//label[text()='Male']"));
		e4.click();
		Thread.sleep(5000);
		if(e4.isSelected())
		{
			System.out.println("It is in selected state");
		}
		else
		{
			System.out.println("It is not selected state");
		}
		driver.close();
	}
	

}
