package mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("My Test class is running");
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/create_account.html");
	      // scroll to reach upload button
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript("scroll(0,500)");
	    //identify element and click
	      driver.findElement(By.xpath("//*[text()='Choose file']")).click();
	      Thread.sleep(5000);
	      // file path passed as parameter to StringSelection
	      StringSelection s = new StringSelection("C:\\Users\\Eswara Aditya\\Downloads\\Resume.doc");
	      // Clipboard copy
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);	      
	      // Robot object creation
	      Robot r = new Robot();
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);	      
	      r.keyRelease(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      Thread.sleep(5000);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	     
	}

}
