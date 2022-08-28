package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Attributes_YouTube3 {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		 Thread.sleep(2000);
		 
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Deh bye rohit awate");
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
	
			
	}
}
