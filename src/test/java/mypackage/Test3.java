package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.linkText("Mobiles")).click();
		
		boolean display= driver.findElement(By.xpath("//a[text()='Best Sellers']")).isDisplayed();
		System.out.println(display);
		String tagname=driver.findElement(By.xpath("//a[text()='Best Sellers']")).getTagName();
		System.out.println(tagname);
		String text=driver.findElement(By.xpath("//a[text()='Best Sellers']")).getText();
		System.out.println(text);
		String attribute=driver.findElement(By.xpath("//a[text()='Best Sellers']")).getAttribute("class");
		System.out.println(attribute);
		
		//driver.switchTo().frame(0);
		//driver.switchTo().defaultContent();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		//WebElement view= driver.findElement(By.xpath("(//*[@class='a-spacing-extra-large a-text-left'])[1]"));
		//jse.executeScript("arguments[0].scrollIntoView();", view);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'OnePlus 7T')]")).click();
		Thread.sleep(5000);
		WebElement e= driver.findElement(By.className("nav-line-1-container"));
		Actions  a = new Actions(driver);
		a.moveToElement(e).perform();
		driver.findElement(By.className("nav-action-inner")).click();
		driver.findElement(By.name("email")).sendKeys("kjwkhsdijh");
		driver.close();
		
	}


}
