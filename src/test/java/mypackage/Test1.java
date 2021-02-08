package mypackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args)
	{
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String source=driver.getPageSource();
		String window=driver.getWindowHandle();
		String expectedresult="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println(title);
		System.out.println(url);
		//System.out.println(source);
		System.out.println(window);
		if(title.contains("Shopping"))
		{
			System.out.println("Test case is passed");
		}
		/*Assert.assertEquals(title,expectedresult);
		System.out.println("Amazon site title is matched");*/
		driver.quit();
		
	}
}

