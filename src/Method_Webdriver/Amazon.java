package Method_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles under 20000");
		    //click on search button
		    driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
