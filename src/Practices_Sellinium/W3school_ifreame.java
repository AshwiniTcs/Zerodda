package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school_ifreame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Java Programs\\\\Core java\\\\src\\\\Selenium\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
			Thread.sleep(2000);
			
			
			//enter the ifream no 2
			driver.switchTo().frame("iframeResult");
			
			//enter the 1st name
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Mayank");
			
			//enter the last name
			driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Awate");
			//click on the botton 
			
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			
			
			
			
	}

}
