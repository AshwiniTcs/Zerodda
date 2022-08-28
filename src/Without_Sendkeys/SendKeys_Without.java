package Without_Sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Without {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//JavascriptExecutor is the interface we use enter the text filed  
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript ("document.getElementById('username').value='admin'");
	      WebElement l = driver.findElement(By.id("username"));
	      String s = l.getAttribute("value");
	      System.out.println("Value entered is: " + s);
	      //driver.quit();
	  
	}

}
