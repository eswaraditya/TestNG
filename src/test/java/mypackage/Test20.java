package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/child::li"));
		System.out.println("Total no of suggestions in search box:::====> " + list.size());
		for (int i = 0; i < list.size(); i++) 
		{
		System.out.println(list.get(i).getText());
		if (list.get(i).getText().contains("testing tools")) 
		{
		list.get(i).click();
		break;
		//driver.close();
		
		}

		}
		

	}

}
