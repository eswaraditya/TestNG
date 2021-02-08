package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	@Test
	@Parameters({"firstname","lastname","email","password"})
	public void facebookNewAccount(String fn,String ln,String em,String pas) throws Exception{
		
		System.out.println("I am from facebookNewAccount method");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys(fn);
		driver.findElement(By.name("lastname")).sendKeys(ln);
		driver.findElement(By.name("reg_email__")).sendKeys(em);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pas);
		
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
		
	}
	
	@Test
	public void Message()
	{
		System.out.println("I am form Message method");
	}
	
}

