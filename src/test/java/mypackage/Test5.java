package mypackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		int width=driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println(width+""+height);
		int xposition= driver.manage().window().getPosition().getX();
		int yposition = driver.manage().window().getPosition().getY();
		System.out.println(xposition+""+yposition);
		Dimension d= new Dimension(200,300);
		driver.manage().window().setSize(d);
		driver.close();
		

	}

}
